package courseAssistant.crawler;

/**
 * Created by He Cao on 2017/1/29.
 */

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XKFunction extends BasicFunction {
    /**
     * 端口号，默认为8080
     */
    private int port = 8080;

    public XKFunction() throws Exception {
        super();
        setTerm(port);
    }

    /**
     * 设置学期为port，并更新相关URL
     */
    public void setTerm(int port) throws IOException {
        String urlLoginFormat = WebUtil.getProperty("XK_urlLoginFormat");
        urlLogin = String.format(urlLoginFormat, port);
        urlIndex = urlLogin + WebUtil.getProperty("XK_urlIndexSuffix");
        urlCaptcha = urlLogin + WebUtil.getProperty("XK_urlCaptchaSuffix");
    }

    /**
     * 返回查询课程结果的页面文档
     */
    private Document getAllCourseDocument() throws Exception {
        String url = urlLogin + WebUtil.getProperty("XK_urlAllCourseSuffix");
        List<NameValuePair> data = new ArrayList<NameValuePair>();
        data.add(new BasicNameValuePair("CourseNo", ""));
        data.add(new BasicNameValuePair("CourseName", ""));
        data.add(new BasicNameValuePair("TeachNo", ""));
        data.add(new BasicNameValuePair("TeachName", ""));
        data.add(new BasicNameValuePair("CourseTime", ""));
        data.add(new BasicNameValuePair("NotFull", "false"));
        data.add(new BasicNameValuePair("Credit", ""));
        data.add(new BasicNameValuePair("Campus", "0"));
        data.add(new BasicNameValuePair("Enrolls", ""));
        data.add(new BasicNameValuePair("DataCount", "0"));
        data.add(new BasicNameValuePair("MinCapacity", "9999"));
        data.add(new BasicNameValuePair("MaxCapacity", ""));
        data.add(new BasicNameValuePair("PageIndex", "1"));
        data.add(new BasicNameValuePair("PageSize", "10000"));
        data.add(new BasicNameValuePair("FunctionString", "InitPage"));
        return WebUtil.postDocument(httpClient, url, data);
    }

    /**
     * 返回查询结果 课程号, 课程名, 学分, 教师号, 教师名, 上课时间, 上课地点, 容量, 人数, 校区, 选课限制, 答疑时间, 答疑地点
     */
    public ArrayList<String[]> getAllCourseArray() throws Exception {
        Document doc = getAllCourseDocument();
        Elements rows = doc.select("tr:has(td:eq(9))");
        ArrayList<String[]> arrayList = new ArrayList<String[]>();
        String[] courseHeadInfo = new String[3];
        for (Element row : rows) {
            Elements cols = row.select("td");
            if (cols.size() == 13) {
                for (int j = 0; j < 3; j++) {
                    courseHeadInfo[j] = cols.get(j).html();
                }
            }
            String[] info = new String[13];
            int k = 0;
            for (k = 0; k < 3; k++) {
                info[k] = courseHeadInfo[k];
            }
            for (int j = cols.size() - 10; j < cols.size(); j++) {
                info[k++] = cols.get(j).html();
            }
            arrayList.add(info);
        }
        return arrayList;
    }
}
