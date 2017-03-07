/**
 * @Title: Village.java
 * @Package: no4.ex3
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-15 ����12:32:13
 * @version V1.0
 */
package no4.ex3;

/**
 * @author Steven Ming
 *
 */
public class Village {
	static int waterAmount;	//ģ��ˮ����ˮ��
	int peopleNumber;		//��ׯ������
	String name;			//��ׯ������
	
	Village(String s) {
		name = s;
	}
	
	static void setWaterAmount(int m) {
		if(m>0)
			waterAmount = m;
	}
	
	void drinkWater(int n) {
		if (waterAmount-n >= 0) {
			waterAmount = waterAmount - n;
			System.out.println(name + "����" + n + "��ˮ");
		}
		else
			waterAmount = 0;
	}
	
	static int lookWaterAmount() {
		return waterAmount;
	}
	
	void setPeopleNumber(int n) {
		peopleNumber = n;
	}
	
	int getPeopleNumber() {
		return peopleNumber;
	}
}
