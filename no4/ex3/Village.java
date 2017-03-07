/**
 * @Title: Village.java
 * @Package: no4.ex3
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-15 下午12:32:13
 * @version V1.0
 */
package no4.ex3;

/**
 * @author Steven Ming
 *
 */
public class Village {
	static int waterAmount;	//模拟水井的水量
	int peopleNumber;		//村庄的人数
	String name;			//村庄的名字
	
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
			System.out.println(name + "喝了" + n + "升水");
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
