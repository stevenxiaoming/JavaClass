/**
 * @Title: SaveMoney.java
 * @Package: no5.ex2
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-22 ����1:03:48
 * @version V1.0
 */
package no5.ex2;

/**
 * @author Steven Ming
 *
 */
public class SaveMoney {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int amount = 8000;
		ConstructionBank bank1 = new ConstructionBank();
		bank1.savedMoney = amount;
		bank1.year = 8.236;
		bank1.setInterestRate(0.035);
		double interest1 = bank1.computerInterest();
		BankOfDalian bank2 = new BankOfDalian();
		bank2.savedMoney = amount;
		bank2.year = 8.236;
		bank2.setInterestRate(0.035);
		double interest2 = bank2.computerInterest();
		System.out.printf("����������Ϣ���%fԪ\n",interest2-interest1);;
	}
}
