/**
 * @Title: BeijingPeople.java
 * @Package: no5.ex1
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-22 ����12:51:11
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
		System.out.println("�����˵�ƽ����ߣ�" + height + "����");
	}
	
	public void averageWeight() {
		weight = 70;
		System.out.println("�����˵�ƽ�����أ�" + weight + "ǧ��");
	}
	
	public void beijingOpera() {
		System.out.println("���������¡�����������");
	}
}
