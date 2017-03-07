/**
 * @Title: BeijingPeople.java
 * @Package: no5.ex1
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-22 下午12:51:11
 * @version V1.0
 */
package no5.ex1;

/**
 * @author Steven Ming
 *
 */
public class BeijingPeople extends ChinaPeople {	
	public void averageHeight() {
		height = 172.5;
		System.out.println("北京人的平均身高：" + height + "厘米");
	}
	
	public void averageWeight() {
		weight = 70;
		System.out.println("北京人的平均体重：" + weight + "千克");
	}
	
	public void beijingOpera() {
		System.out.println("花脸、青衣、花旦和老生");
	}
}
