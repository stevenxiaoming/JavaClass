/**
 * @Title: CompareDate.java
 * @Package: no8.ex3
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-2-16 下午12:26:42
 * @version V1.0
 */
package no8.ex3;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Steven Ming
 * @datetime 2017-2-16 下午12:26:42
 */
public class CompareDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个年，月，日数据");
        System.out.println("输入年份");
        short yearOne = scanner.nextShort();
        System.out.println("输入月份");
        byte monthOne = scanner.nextByte();
        System.out.println("输入日期");
        byte dayOne = scanner.nextByte();
        System.out.println("输入第二个年，月，日数据");
        System.out.println("输入年份");
        short yearTwo = scanner.nextShort();
        System.out.println("输入月份");
        byte monthTwo = scanner.nextByte();
        System.out.println("输入日期");
        byte dayTwo = scanner.nextByte();
        Calendar calendar = Calendar.getInstance();
        calendar.set(yearOne, monthOne-1, dayOne);
        long timeOne = calendar.getTimeInMillis();
        calendar.set(yearTwo, monthTwo-1, dayTwo);
        long timeTwo = calendar.getTimeInMillis();
        Date date1 = new Date(timeOne);
        Date date2 = new Date(timeTwo);
        if (date2.equals(date1)) {
            System.out.println("两个日期的年、月、日完全相同");
        } else if (date2.after(date1)) {
            System.out.println("您输入的第二个日期大于第一个日期");
        } else if (date2.before(date1)) {
            System.out.println("您输入的第二个日期小于第一个日期");
        }
        long days = Math.abs(timeTwo - timeOne) / (1000*60*60*24);
        System.out.println(yearOne + "年" + monthOne + "月" + dayOne + "日和" 
                + yearTwo + "年" + monthTwo + "月" + dayTwo + "相隔" + days + "天");
        
    }
}
