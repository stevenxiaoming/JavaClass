/**
 * @Title: FontFamilyNames.java
 * @Package: no9.ex4
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-3-2 上午11:59:25
 * @version V1.0
 */
package no9.ex4;

import java.awt.GraphicsEnvironment;

/**
 * @author Steven Ming
 * @datetime 2017-3-2 上午11:59:25
 */
public class FontFamilyNames {
    String allFontNames[];
    public String[] getFontName() {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        allFontNames = ge.getAvailableFontFamilyNames();
        return allFontNames;
    }
}
