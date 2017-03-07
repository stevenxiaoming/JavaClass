/**
 * @Title: Family.java
 * @Package: no4.ex2
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-15 обнГ12:23:39
 * @version V1.0
 */
package no4.ex2;

/**
 * @author Steven Ming
 *
 */
public class Family {
	TV homeTV;
	void buyTV(TV tv) {
		homeTV=tv;
	}
	
	void remoteControl(int m) {
		homeTV.setChannel(m);
	}
	
	void seeTV(){
		homeTV.showProgram();
	}
}
