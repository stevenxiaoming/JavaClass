/**
 * @Title: Vehicle.java
 * @Package: experiment.week2.no4.ex1
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-12 обнГ6:44:31
 * @version V1.0
 */
package no4.ex1;

/**
 * @author Steven Ming
 *
 */
public class Vehicle {
	double speed;
	int power;
	void speedUp(int s) {
		speed = speed + s;
	}
	void speedDown(int d) {
		speed = speed - d;
	}
	void setPower(int p) {
		power = p;
	}
	int getPower() {
		return power;
	}
	double getSpeed() {
		return speed;
	}
}
