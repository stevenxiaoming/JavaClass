/**
 * @Title: GuessNumber.java
 * @Package: experiment.week2.no3.ex2
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-12 下午6:33:24
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
		System.out.println("给你一个1至100之间的整数，请猜这个数");
		int realNumber = random.nextInt(100)+1;
		int yourGuess = 0;
		System.out.println("输入您的猜测：");
		yourGuess = reader.nextInt();
		while(realNumber != yourGuess){
			if(yourGuess > realNumber){
				System.out.println("猜大了，再输入您的猜测：");
				yourGuess = reader.nextInt();
			} else if(yourGuess < realNumber) {
				System.out.println("猜小了，再输入您的猜测：");
				yourGuess = reader.nextInt();
			}
		}
		System.out.println("猜对了！");
	}

}
