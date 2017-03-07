/**
 * @Title: CalendarMainClass.java
 * @Package: no9.ex2
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-2-23 下午1:10:35
 * @version V1.0
 */
package no9.ex2;

/**
 * @author Steven Ming
 * @datetime 2017-2-23 下午1:10:35
 */
public class CalendarMainClass {
    public static void main(String[] args) {
        CalendarFrame frame = new CalendarFrame();
        frame.setBounds(100, 100, 360, 300);
        frame.setVisible(true);
        frame.setYearAndMonth(2015, 5);
    }
}
