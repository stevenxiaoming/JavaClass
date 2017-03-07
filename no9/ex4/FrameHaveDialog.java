/**
 * @Title: FrameHaveDialog.java
 * @Package: no9.ex4
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-3-2 上午11:51:23
 * @version V1.0
 */
package no9.ex4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 * @author Steven Ming
 * @datetime 2017-3-2 上午11:51:23
 */
public class FrameHaveDialog extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    JTextArea text;
    JButton buttonFont;
    FrameHaveDialog() {
        buttonFont = new JButton("设置字体");
        text = new JTextArea("Java 2实用教程（第4版）");
        buttonFont.addActionListener(this);
        add(buttonFont, BorderLayout.NORTH);
        add(text);
        setBounds(60, 60, 300, 300);
        setVisible(true);
        validate();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonFont) {
            FontDialog dialog = new FontDialog(this);
            dialog.setVisible(true);
            if (dialog.getState() == FontDialog.YES) {
                text.setFont(dialog.getFont());
                text.repaint();
            }
            if (dialog.getState() == FontDialog.NO) {
                text.repaint();
            }
        }
    }
}
