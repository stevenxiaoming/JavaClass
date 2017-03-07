/**
 * @Title: ReplaceErrorWord.java
 * @Package: no8.ex5
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-2-16 下午12:55:53
 * @version V1.0
 */
package no8.ex5;

import java.util.regex.*;

/**
 * @author Steven Ming
 * @datetime 2017-2-16 下午12:55:53
 */
public class ReplaceErrorWord {
    public static void main(String[] args) {
        String str = "忘记密码，不要惊慌失错，请登陆www.yy.cnj或登陆www.tt.cc";
        Pattern pattern;
        Matcher matcher;
        String regex = "登陆";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(str);
        while (matcher.find()) {
            String s = matcher.group();
            System.out.print(matcher.start() + "位置出现:");
            System.out.println(s);
        }
        System.out.println("将\"登陆\"替换为\"登录\"的字符串:");
        String result = matcher.replaceAll("登录");
        System.out.println(result);
        pattern = Pattern.compile("惊慌失错");
        matcher = pattern.matcher(result);
        System.out.println("将\"惊慌失错\"替换为\"惊慌失措\"的字符串:");
        result = matcher.replaceAll("惊慌失措");
        System.out.println(result);
    }
}
