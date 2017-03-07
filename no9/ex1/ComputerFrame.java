/**
 * @Title: ComputerFrame.java
 * @Package: no9.ex1
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-2-23 下午12:09:41
 * @version V1.0
 */
package no9.ex1;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

/**
 * @author Steven Ming
 * @datetime 2017-2-23 下午12:09:41
 */
public class ComputerFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    JMenuBar menubar;
    JMenu choiceGrade;
    JMenuItem grade1, grade2;
    JTextField textOne, textTwo, textResult;
    JButton getProblem, giveAnwser;
    JLabel operatorLabel, message;
    Teacher teacherZhang;
    ComputerFrame() {
        teacherZhang = new Teacher();
        teacherZhang.setMaxInteger(20);
        setLayout(new FlowLayout());
        menubar = new JMenuBar();
        choiceGrade = new JMenu("选择级别");
        grade1 = new JMenuItem("幼儿级别");
        grade2 = new JMenuItem("儿童级别");
        grade1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherZhang.setMaxInteger(10);
            }
        });
        grade2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherZhang.setMaxInteger(50);
            }
        });
        choiceGrade.add(grade1);
        choiceGrade.add(grade2);
        menubar.add(choiceGrade);
        setJMenuBar(menubar);
        textOne = new JTextField(5);
        textTwo = new JTextField(5);
        textResult = new JTextField(5);
        operatorLabel = new JLabel("+");
        operatorLabel.setFont(new Font("Arial", Font.BOLD, 20));
        message = new JLabel("你还没有回答呢");
        getProblem = new JButton("获取题目");
        giveAnwser = new JButton("确认答案");
        add(getProblem);
        add(textOne);
        add(operatorLabel);
        add(textTwo);
        add(new JLabel("="));
        add(textResult);
        add(giveAnwser);
        add(message);
        textResult.requestFocus();
        textOne.setEditable(false);
        textTwo.setEditable(false);
        getProblem.setActionCommand("getProblem");
        textResult.setActionCommand("answer");
        giveAnwser.setActionCommand("answer");
        teacherZhang.setJTextField(textOne, textTwo, textResult);
        teacherZhang.setJLabel(operatorLabel, message);
        getProblem.addActionListener(teacherZhang);
        giveAnwser.addActionListener(teacherZhang);
        textResult.addActionListener(teacherZhang);
        setVisible(true);
        validate();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
