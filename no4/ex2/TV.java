/**
 * @Title: TV.java
 * @Package: no4.ex2
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-15 ����12:20:26
 * @version V1.0
 */
package no4.ex2;

/**
 * @author Steven Ming
 *
 */
public class TV {
	int channel;
	void setChannel(int m) {
		if(m>=1) {
			channel = m;
		}
	}
	
	int getChannel() {
		return channel;
	}
	
	void showProgram() {
		switch(channel) {
		case 1 :
			System.out.println("�ۺ�Ƶ��");
			break;
		case 2 :
			System.out.println("����Ƶ��");
			break;
		case 3 :
			System.out.println("����Ƶ��");
			break;
		case 4 :
			System.out.println("����Ƶ��");
			break;
		case 5 :
			System.out.println("����Ƶ��");
			break;
		default :
			System.out.println("�����տ�" + channel + "Ƶ��");
		}
	}
}
