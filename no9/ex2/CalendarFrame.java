/**
 * @Title: CalendarFram.java
 * @Package: no9.ex2
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-2-23 下午12:52:06
 * @version V1.0
 */
package no9.ex2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

/**
 * @author Steven Ming
 * @datetime 2017-2-23 下午12:52:06
 */
public class CalendarFrame extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    JLabel labelDay[] = new JLabel[42];
    JButton titleName[] = new JButton[7];
    String name[] = {"日", "一", "二", "三", "四", "五", "六"};
    JButton nextMonth, previousMonth;
    CalendarBean calendar;
    JLabel showMessage = new JLabel("", JLabel.CENTER);
    int year = 2011, month = 5;
    public CalendarFrame() {
        JPanel pCenter = new JPanel();
        pCenter.setLayout(new GridLayout(7, 7));
        for (int i = 0; i < 7; i++) {
            titleName[i] = new JButton(name[i]);
            titleName[i].setBorder(new SoftBevelBorder(BevelBorder.RAISED));
            pCenter.add(titleName[i]);
        }
        for (int i = 0; i < 42; i++) {
            labelDay[i] = new JLabel("", JLabel.CENTER);
            labelDay[i].setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
            pCenter.add(labelDay[i]);
        }
        calendar = new CalendarBean();
        nextMonth = new JButton("下月");
        previousMonth = new JButton("上月");
        nextMonth.addActionListener(this);
        previousMonth.addActionListener(this);
        JPanel pNorth = new JPanel(), 
                pSouth = new JPanel();
        pNorth.add(previousMonth);
        pNorth.add(nextMonth);
        pSouth.add(showMessage);
        add(pCenter, BorderLayout.CENTER);
        add(pNorth, BorderLayout.NORTH);
        add(pSouth, BorderLayout.SOUTH);
        setYearAndMonth(year, month);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public void setYearAndMonth(int y, int m) {
        calendar.setYear(y);
        calendar.setMonth(m);
        String day[] = calendar.getCalendar();
        for (int i = 0; i < 42; i ++) {
            labelDay[i].setText(day[i]);
        }
        showMessage.setText("日历：" + calendar.getYear() + "年" + calendar.getMonth() + "月");
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextMonth) {
            month = month + 1;
            if (month > 12) {
                month = 1;
            }
            calendar.setMonth(month);
            String day[] = calendar.getCalendar();
            for (int i = 0; i < 42; i++) {
                labelDay[i].setText(day[i]);
            }
        } else if (e.getSource() == previousMonth) {
            month = month - 1;
            if (month < 1) {
                month = 12;
            }
            calendar.setMonth(month);
            String day[] = calendar.getCalendar();
            for (int i = 0; i < 42; i++) {
                labelDay[i].setText(day[i]);
            }
        }
        showMessage.setText("日历：" + calendar.getYear() + "年" + calendar.getMonth() + "月");
    }
}
