/**
 * @Title: MainClass.java
 * @Package: no4.ex2
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-15 ����12:25:57
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
		System.out.println("haierTV��Ƶ����" + haierTV.getChannel());
		Family zhangSanFamily = new Family();
		zhangSanFamily.buyTV(haierTV);
		System.out.println("zhangSanFamily��ʼ�����ӽ�Ŀ");
		zhangSanFamily.seeTV();
		int m=2;
		System.out.println("zhangSanFamily�����Ӹ�����" + m + "Ƶ��");
		zhangSanFamily.remoteControl(m);
		System.out.println("haierTV��Ƶ����" + haierTV.getChannel());
		System.out.println("zhangSanFamily�ڿ����ӽ�Ŀ");
		zhangSanFamily.seeTV();
	}
}
