/**
 * @Title: ConstructionBank.java
 * @Package: no5.ex2
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-22 ����12:58:27
 * @version V1.0
 */
package no5.ex2;

/**
 * @author Steven Ming
 *
 */
public class ConstructionBank extends Bank {
	double year;
	public double computerInterest() {
		super.year = (int)year;
		double r = year-(int)year;
		int day = (int)(r*1000);
		double yearInterest = super.computerInterest();
		double dayInterest = day*0.0001*savedMoney;
		interest = yearInterest + dayInterest;
		System.out.printf("%dԪ���ڽ�������%d����%d�����Ϣ��%fԪ\n",
						savedMoney, super.year, day, interest);
		return interest;
	}
}
