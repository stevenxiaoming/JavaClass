/**
 * @Title: ChinaPeople.java
 * @Package: no5.ex1
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-22 ����12:45:29
 * @version V1.0
 */
package no5.ex1;

/**
 * @author Steven Ming
 *
 */
public class ChinaPeople extends People {
	public void speakHello() {
		System.out.println("����");
	}
	
	public void averageHeight() {
		height = 168.78;
		System.out.println("�й��˵�ƽ����ߣ�" + height + "����");
	}
	
	public void averageWeight() {
		weight = 65;
		System.out.println("�й��˵�ƽ�����أ�" + weight + "ǧ��");
	}
	
	public void chinaGongfu() {
		System.out.println("�����ӣ�վ���ɣ�˯�繭");
	}
}
