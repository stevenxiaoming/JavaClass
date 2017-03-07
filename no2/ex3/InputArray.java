/**
 * @Title: InputArray.java
 * @Package: experiment.week2.no2.ex3
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-12 ÏÂÎç6:02:53
 * @version V1.0
 */
package no2.ex3;

import java.util.Arrays;

/**
 * @author Steven Ming
 *
 */
public class InputArray {
	public static void main(String args[]) {
		int [] a = {1, 2, 3, 4, 500, 600, 700, 800};
		int [] b, c, d;
		System.out.println(Arrays.toString(a));
		b = Arrays.copyOf(a, a.length);
		System.out.println(Arrays.toString(b));
		c = Arrays.copyOf(a, 4);
		System.out.println(Arrays.toString(c));
		d = Arrays.copyOfRange(a, a.length-4, a.length);
		System.out.println(Arrays.toString(d));
		c[c.length-1] = -100;
		d[d.length-1] = -200;
		System.out.println(Arrays.toString(a));
	}
}
