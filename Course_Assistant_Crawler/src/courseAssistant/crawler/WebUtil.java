package courseAssistant.crawler;

/**
 * Created by He Cao on 2017/1/29.
 */

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class WebUtil {
    /**
     * 属性文件缓存
     */
    private static Map<String, String> properties = null;

    /**
     * 从文件中加载HTML文档
     */
    public static Document parseFile(String filePath) throws Exception {
        File inputFile = new File(filePath);
        return Jsoup.parse(inputFile, "UTF-8");
    }

    /**
     * 返回GET页面的结果String
     */
    public static String getString(CloseableHttpClient client, String url)
            throws ClientProtocolException, IOException {
        HttpGet getPage = new HttpGet(url);
        String htmlContent = null;
        CloseableHttpResponse response = client.execute(getPage);
        try {
            HttpEntity entity = response.getEntity();
            htmlContent = EntityUtils.toString(entity);
        } finally {
            response.close();
        }
        return htmlContent;
    }

    /**
     * 返回GET页面的结果Document
     */
    public static Document getDocument(CloseableHttpClient client, String url)
            throws ClientProtocolException, IOException {
        return Jsoup.parse(getString(client, url));
    }

    /**
     * 返回POST页面的结果String
     */
    public static String postString(CloseableHttpClient client, String url, List<NameValuePair> data)
            throws ClientProtocolException, IOException {
        HttpPost postPage = new HttpPost(url);
        String htmlContent = null;
        postPage.setEntity(new UrlEncodedFormEntity(data));
        CloseableHttpResponse response = client.execute(postPage);
        try {
            HttpEntity entity = response.getEntity();
            htmlContent = EntityUtils.toString(entity);
        } finally {
            response.close();
        }
        return htmlContent;
    }

    /**
     * 返回POST页面的结果Document
     */
    public static Document postDocument(CloseableHttpClient client, String url, List<NameValuePair> data)
            throws ClientProtocolException, IOException {
        return Jsoup.parse(postString(client, url, data));
    }

    /**
     * Document中的表格转换为二维数组
     */
    public static ArrayList<String[]> parseTable2ArrayList(Document doc, String selectorRow, String selectorCol) {
        Elements rows = doc.select(selectorRow);
        ArrayList<String[]> arrayList = new ArrayList<String[]>();
        for (Element row : rows) {
            Elements cols = row.select(selectorCol);
            String[] array = new String[cols.size()];
            for (int i = 0; i < cols.size(); i++) {
                array[i] = cols.get(i).html();
            }
            arrayList.add(array);
        }
        return arrayList;
    }

    /**
     * 获取登录字段
     */
    public static String[] getLoginFields(Document doc) {
        String[] fields = new String[3];
        Elements eleInputFields = doc.select("input[id~=^txt\\w+]");
        for (int i = 0; i < 3; i++) {
            fields[i] = eleInputFields.get(i).attr("id");
        }
        return fields;
    }

    /**
     * 获取属性值
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static String getProperty(String key) throws IOException {
        if (properties == null) {
            InputStream is = WebUtil.class.getResourceAsStream("crawler.properties");
            Properties prop = new Properties();
            prop.load(is);
            properties = new HashMap<String, String>((Map) prop);
            is.close();
        }
        return properties.get(key);
    }
}