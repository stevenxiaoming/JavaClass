/**
 * @Title: LatterLabel.java
 * @Package: no9.ex3
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-2-23 下午1:37:08
 * @version V1.0
 */
package no9.ex3;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

/**
 * @author Steven Ming
 * @datetime 2017-2-23 下午1:37:08
 */
public class LetterLabel extends JTextField implements FocusListener {

    private static final long serialVersionUID = 1L;
    LetterLabel() {
        setEditable(false);
        addFocusListener(this);
        setBackground(Color.white);
        setFont(new Font("Arial", Font.PLAIN, 30));
    }
    public static LetterLabel[] getLetterLabel(int n) {
        LetterLabel a[] = new LetterLabel[n];
        for (int k = 0; k < a.length; k ++) {
            a[k] = new LetterLabel();
        }
        return a;
    }
    public void focusGained(FocusEvent e) {
        setBackground(Color.cyan);
    }
    public void focusLost(FocusEvent e) {
        setBackground(Color.white);
    }
    public void setText(char c) {
        setText("" + c);
    }
}
