/**
 * @Title: CalendarBean.java
 * @Package: no9.ex2
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-2-23 下午12:45:58
 * @version V1.0
 */
package no9.ex2;

import java.util.Calendar;

/**
 * @author Steven Ming
 * @datetime 2017-2-23 下午12:45:58
 */
public class CalendarBean {
    String day[];
    int year = 2005, month=0;
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public String[] getCalendar() {
        String a[] = new String[42];
        Calendar 日历 = Calendar.getInstance();
        日历.set(year, month-1, 1);
        int 星期几 = 日历.get(Calendar.DAY_OF_WEEK)-1;
        int day = 0;
        if (month == 1 || month == 3 || month == 5 
                || month == 7 || month == 8 
                || month == 10 || month == 12) {
            day = 31;
        }
        if (month == 4 || month == 6 || month == 9 
                || month ==11) {
            day = 30;
        }
        if (month == 2) {
            if ((year % 4 ==0) && (year % 100 != 0) || (year % 400 == 0)) {
                day = 29;
            } else {
                day = 28;
            }
        }
        for (int i=星期几, n=1; i<星期几 + day; i++) {
            a[i] = String.valueOf(n);
            n++;
        }
        return a;
    }
}
