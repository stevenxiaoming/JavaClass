package courseAssistant.crawler;

/**
 * Created by He Cao on 2017/1/29.
 */

import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class BasicFunction {
    /**
     * 登录页面的URL
     */
    protected String urlLogin;

    /**
     * 验证码图片的URL
     */
    protected String urlCaptcha;

    /**
     * 登陆后的主页URL
     */
    protected String urlIndex;

    /**
     * http客户端
     */
    protected CloseableHttpClient httpClient;

    /**
     * 学号
     */
    protected String strUserNo;

    /**
     * 构造函数
     */
    public BasicFunction() throws Exception {
        httpClient = HttpClients.createDefault();
    }

    /**
     * 保存验证码图片到本地，并返回文件绝对路径
     */
    public String getCaptcha() throws IOException {
        String fileName = WebUtil.getProperty("CaptchaFileName");
        String filePath = null;
        HttpGet getCaptcha = new HttpGet(urlCaptcha);
        CloseableHttpResponse response = httpClient.execute(getCaptcha);
        try {
            File fileCaptcha = new File(fileName);
            FileOutputStream fileOutputStream = new FileOutputStream(fileCaptcha);
            try {
                response.getEntity().writeTo(fileOutputStream);
                filePath = fileCaptcha.getCanonicalPath();
            } finally {
                fileOutputStream.close();
            }
        } finally {
            response.close();
        }
        return filePath;
    }

    /**
     * 指定学号、密码、验证码登录，登录成功返回"SUCCESS"，否则返回错误信息
     */
    public String login(String strUserNo, String strPasswd, String strCaptcha)
            throws ClientProtocolException, IOException {
        this.strUserNo = strUserNo;
        Document docLogin = WebUtil.getDocument(httpClient, urlLogin);

        String[] loginFields = WebUtil.getLoginFields(docLogin);
        List<NameValuePair> postData = new ArrayList<NameValuePair>();
        postData.add(new BasicNameValuePair(loginFields[0], strUserNo));
        postData.add(new BasicNameValuePair(loginFields[1], strPasswd));
        postData.add(new BasicNameValuePair(loginFields[2], strCaptcha));

        String strLoginResult = "SUCCESS";
        Document docLoginPage = WebUtil.postDocument(httpClient, urlLogin, postData);
        Element errLogin = docLoginPage.getElementById("divLoginAlert");
        if (errLogin != null) {
            strLoginResult = errLogin.html();
        }
        return strLoginResult;
    }

    /**
     * 访问主页，判断是否处于登录状态
     */
    public boolean isLogin() throws Exception {
        Document docIndexPage = WebUtil.getDocument(httpClient, urlIndex);
        return docIndexPage.getElementsMatchingText(strUserNo).size() != 0;
    }
}


