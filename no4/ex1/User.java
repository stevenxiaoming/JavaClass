/**
 * @Title: User.java
 * @Package: experiment.week2.no4.ex1
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-12 ����6:48:01
 * @version V1.0
 */
package no4.ex1;

/**
 * @author Steven Ming
 *
 */
public class User {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vehicle car1, car2;
		car1 = new Vehicle();
		car2 = new Vehicle();
		car1.setPower(128);
		car2.setPower(76);
		System.out.println("car1�Ĺ����ǣ�" + car1.getPower());
		System.out.println("car2�Ĺ����ǣ�" + car2.getPower());
		car1.speedUp(80);
		car2.speedUp(100);
		System.out.println("car1Ŀǰ���ٶȣ�" + car1.getSpeed());
		System.out.println("car2Ŀǰ���ٶȣ�" + car2.getSpeed());
		car1.speedDown(10);
		car2.speedDown(20);
		System.out.println("car1Ŀǰ���ٶȣ�" + car1.getSpeed());
		System.out.println("car2Ŀǰ���ٶȣ�" + car2.getSpeed());
	}

}
