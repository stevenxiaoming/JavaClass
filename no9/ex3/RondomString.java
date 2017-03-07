/**
 * @Title: RondomString.java
 * @Package: no9.ex3
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-2-23 下午1:43:47
 * @version V1.0
 */
package no9.ex3;

/**
 * @author Steven Ming
 * @datetime 2017-2-23 下午1:43:47
 */
public class RondomString {
    String str = "";
    public String getRondomString(String s) {
        StringBuffer strBuffer = new StringBuffer(s);
        int m = strBuffer.length();
        for (int k = 0; k < m; k ++) {
            int index = (int) (Math.random()*strBuffer.length());
            char c = strBuffer.charAt(index);
            str = str + c;
            strBuffer = strBuffer.deleteCharAt(index);
        }
        return str;
    }
}
