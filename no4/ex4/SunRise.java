/**
 * @Title: SunRise.java
 * @Package: no4.ex4
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-15 обнГ12:54:39
 * @version V1.0
 */
package no4.ex4;

/**
 * @author Steven Ming
 *
 */
public class SunRise {
	public static void main(String[] args) {
		SquareEquation equation = new SquareEquation(4, 5, 1);
		equation.getRoots();
		equation.setCoefficient(-3, 4, 5);
		equation.getRoots();
	}
}
