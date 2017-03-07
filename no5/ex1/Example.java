/**
 * @Title: Example.java
 * @Package: no5.ex1
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-22 ÏÂÎç12:52:36
 * @version V1.0
 */
package no5.ex1;

/**
 * @author Steven Ming
 *
 */
public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChinaPeople chinaPeople = new ChinaPeople();
		AmericanPeople americanPeople = new AmericanPeople();
		BeijingPeople beijingPeople = new BeijingPeople();
		chinaPeople.speakHello();
		americanPeople.speakHello();
		beijingPeople.speakHello();
		chinaPeople.averageHeight();
		americanPeople.averageHeight();
		beijingPeople.averageHeight();
		chinaPeople.averageWeight();
		americanPeople.averageWeight();
		beijingPeople.averageWeight();
		chinaPeople.chinaGongfu();
		americanPeople.americanBoxing();
		beijingPeople.beijingOpera();
		beijingPeople.chinaGongfu();
	}

}
