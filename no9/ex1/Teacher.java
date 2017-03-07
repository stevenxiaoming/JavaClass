/**
 * @Title: Teacher.java
 * @Package: no9.ex1
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-2-23 下午12:13:16
 * @version V1.0
 */
package no9.ex1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author Steven Ming
 * @datetime 2017-2-23 下午12:13:16
 */
public class Teacher implements ActionListener {
    int numberOne, numberTwo;
    String operator = "";
    boolean isRight;
    Random random;
    int maxInteger;
    JTextField textOne, textTwo, textResult;
    JLabel operatorLabel, message;
    
    Teacher() {
        random = new Random();
    }
    
    public void setMaxInteger(int n) {
        maxInteger = n;
    }
    
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if (str.equals("getProblem")) {
            numberOne = random.nextInt(maxInteger) + 1;
            numberTwo = random.nextInt(maxInteger) + 1;
            double d = Math.random();
            if (d >= 0.5) {
                operator = "+";
            } else {
                operator = "-";
            }
            textOne.setText("" + numberOne);
            textTwo.setText("" + numberTwo);
            operatorLabel.setText(operator);
            message.setText("请回答");
            textResult.setText(null);
        } else if (str.equals("answer")) {
            String answer = textResult.getText();
            try {
                int result = Integer.parseInt(answer);
                if (operator.equals("+")) {
                    if (result == numberOne + numberTwo) {
                        message.setText("你回答正确");
                    } else {
                        message.setText("你回答错误");
                    }
                } else if (operator.equals("-")) {
                    if (result == numberOne - numberTwo) {
                        message.setText("你回答正确");
                    } else {
                        message.setText("你回答错误");
                    }
                }
            } catch (NumberFormatException ex) {
                message.setText("请输入数字字符");
            }
        }
    }
    
    public void setJTextField(JTextField ... t) {
        textOne = t[0];
        textTwo = t[1];
        textResult = t[2];
    }
    
    public void setJLabel(JLabel ... label) {
        operatorLabel = label[0];
        message = label[1];
    }
}
