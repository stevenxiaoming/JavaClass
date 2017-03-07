/**
 * @Title: DangerException.java
 * @Package: no7.ex2
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-1-5 ÏÂÎç12:15:24
 * @version V1.0
 */
package no7.ex2;

/**
 * @author Steven Ming
 *
 */
public class DangerException extends Exception {
	String message;
	public DangerException() {
		message = "Î£ÏÕÆ· £¡";
	}
	public void toShow() {
		System.out.print(message + " ");
	}
}
