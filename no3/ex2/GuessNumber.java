/**
 * @Title: GuessNumber.java
 * @Package: experiment.week2.no3.ex2
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-12 ����6:33:24
 * @version V1.0
 */
package no3.ex2;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Steven Ming
 *
 */
public class GuessNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Random random = new Random();
		System.out.println("����һ��1��100֮�����������������");
		int realNumber = random.nextInt(100)+1;
		int yourGuess = 0;
		System.out.println("�������Ĳ²⣺");
		yourGuess = reader.nextInt();
		while(realNumber != yourGuess){
			if(yourGuess > realNumber){
				System.out.println("�´��ˣ����������Ĳ²⣺");
				yourGuess = reader.nextInt();
			} else if(yourGuess < realNumber) {
				System.out.println("��С�ˣ����������Ĳ²⣺");
				yourGuess = reader.nextInt();
			}
		}
		System.out.println("�¶��ˣ�");
	}

}
