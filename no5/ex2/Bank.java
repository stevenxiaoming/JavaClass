/**
 * @Title: Bank.java
 * @Package: no5.ex2
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-22 ÏÂÎç12:56:13
 * @version V1.0
 */
package no5.ex2;

/**
 * @author Steven Ming
 *
 */
public class Bank {
	int savedMoney;
	int year;
	double interest;
	double interestRate = 0.29;
	
	public double computerInterest() {
		interest = year*interestRate*savedMoney;
		return interest;
	}
	
	public void setInterestRate(double rate) {
		interestRate = rate;
	}
}
