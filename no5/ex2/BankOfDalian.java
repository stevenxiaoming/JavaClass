/**
 * @Title: BankOfDalian.java
 * @Package: no5.ex2
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-22 ����1:02:00
 * @version V1.0
 */
package no5.ex2;

/**
 * @author Steven Ming
 *
 */
public class BankOfDalian extends Bank {
	double year;
	public double computerInterest() {
		super.year = (int)year;
		double r = year-(int)year;
		int day = (int)(r*1000);
		double yearInterest = super.computerInterest();
		double dayInterest = day*0.00012*savedMoney;
		interest = yearInterest + dayInterest;
		System.out.printf("%dԪ���ڴ�������%d����%d�����Ϣ��%fԪ\n",
						savedMoney, super.year, day, interest);
		return interest;
	}
}
