/**
 * @Title: AmericanPeople.java
 * @Package: no5.ex1
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-22 下午12:48:59
 * @version V1.0
 */
package no5.ex1;

/**
 * @author Steven Ming
 *
 */
public class AmericanPeople extends People {
	public void speakHello() {
		System.out.println("How do you do");
	}
	
	public void averageHeight() {
		height = 176;
		System.out.println("American's average height:" + height + "cm");
	}
	
	public void averageWeight() {
		weight = 75;
		System.out.println("American's average weight"+ weight + "kg");
	}
	
	public void americanBoxing() {
		System.out.println("直拳、勾拳、组合拳");
	}
}
