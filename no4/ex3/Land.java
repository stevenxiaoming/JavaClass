/**
 * @Title: Land.java
 * @Package: no4.ex3
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-15 ����12:35:48
 * @version V1.0
 */
package no4.ex3;

/**
 * @author Steven Ming
 *
 */
public class Land {
	public static void main(String[] args) {
		Village.setWaterAmount(200);
		int leftWater = Village.waterAmount;
		System.out.println("ˮ������" + leftWater + "��ˮ");
		Village zhaoZhuang,maJiaHeZhi;
		zhaoZhuang = new Village("��ׯ");
		maJiaHeZhi = new Village("��Һ���");
		zhaoZhuang.setPeopleNumber(80);
		maJiaHeZhi.setPeopleNumber(120);
		zhaoZhuang.drinkWater(50);
		leftWater = maJiaHeZhi.lookWaterAmount();
		String name = maJiaHeZhi.name;
		System.out.println(name + "����ˮ������" + leftWater + "��ˮ");
		maJiaHeZhi.drinkWater(100);
		leftWater = zhaoZhuang.lookWaterAmount();
		name = zhaoZhuang.name;
		System.out.println(name + "����ˮ������" + leftWater + "��ˮ");
		int peopleNumber = zhaoZhuang.getPeopleNumber();
		System.out.println("��ׯ���˿ڣ�" + peopleNumber);
		peopleNumber = maJiaHeZhi.getPeopleNumber();
		System.out.println("��Һ��ӵ��˿ڣ�" + peopleNumber);		
	}
}
