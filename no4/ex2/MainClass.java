/**
 * @Title: MainClass.java
 * @Package: no4.ex2
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-15 下午12:25:57
 * @version V1.0
 */
package no4.ex2;

/**
 * @author Steven Ming
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TV haierTV = new TV();
		haierTV.setChannel(5);
		System.out.println("haierTV的频道是" + haierTV.getChannel());
		Family zhangSanFamily = new Family();
		zhangSanFamily.buyTV(haierTV);
		System.out.println("zhangSanFamily开始看电视节目");
		zhangSanFamily.seeTV();
		int m=2;
		System.out.println("zhangSanFamily将电视更换到" + m + "频道");
		zhangSanFamily.remoteControl(m);
		System.out.println("haierTV的频道是" + haierTV.getChannel());
		System.out.println("zhangSanFamily在看电视节目");
		zhangSanFamily.seeTV();
	}
}
