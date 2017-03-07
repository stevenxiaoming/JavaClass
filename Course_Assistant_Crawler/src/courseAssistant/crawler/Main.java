package courseAssistant.crawler;

/**
 * Created by He Cao on 2017/1/29.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        CourseCrawler();
    }

    private static boolean login(BasicFunction web) throws Exception {
        String validatePath = web.getCaptcha();
        System.out.println("验证码存储在: " + validatePath);

        System.out.print("学号: ");
        String username = in.next();

        System.out.print("密码: ");
        String password = in.next();

        System.out.print("验证码: ");
        String validate = in.next();

        String res = web.login(username, password, validate);
        System.out.println("登录结果: " + res);

        return web.isLogin();
    }

    public static void CourseCrawler() throws Exception {
        XKFunction XK = new XKFunction();

        if (!login(XK)) return;

        ArrayList<String[]> queryCourse = XK.getAllCourseArray();
        output(queryCourse);
    }

    private static void output(ArrayList<String[]> arrayList) throws IOException {
        try {
            String filePath = WebUtil.getProperty("FilePath");
            File file = new File("Course" + System.currentTimeMillis() + ".txt");
            PrintStream ps = new PrintStream(new FileOutputStream(file));
            for (String[] row : arrayList) {
                for (String col : row)
                    ps.print(col + "\t");
                ps.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("开课表已输出");
    }
}

