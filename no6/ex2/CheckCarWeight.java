/**
 * @Title: CheckCarWeight.java
 * @Package: no6.ex2
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-29 ����12:17:05
 * @version V1.0
 */
package no6.ex2;

interface ComputerWeight {
	public double computeWeight();
}

class Television implements ComputerWeight {
	public double computeWeight() {
		return 3.5;
	}
}

class Computer implements ComputerWeight {
	public double computeWeight() {
		return 2.67;
	}
}

class WashMachine implements ComputerWeight {
	public double computeWeight() {
		return 13.8;
	}
}

class Truck {
	ComputerWeight [] goods;
	
	double totalWeights = 0;
	Truck(ComputerWeight[] goods) {
		this.goods = goods;
	}
	
	public void setGoods(ComputerWeight[] goods) {
		this.goods = goods;
	}
	
	public double getTotalWeights() {
		totalWeights = 0;
		for(int i=0; i<goods.length; i++)
			totalWeights += goods[i].computeWeight();
		return totalWeights;
	}
}

/**
 * @author Steven Ming
 *
 */
public class CheckCarWeight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerWeight[] goods = new ComputerWeight[650];
		for(int i=0;i<goods.length; i++) {
			if(i % 3 == 0)
				goods[i] = new Television();
			else if(i % 3 == 1)
				goods[i] = new Computer();
			else if(i % 3 == 2)
				goods[i] = new WashMachine();
		}
		Truck truck = new Truck(goods);
		System.out.printf("\n����װ�صĻ���������%-8.5f kg\n",truck.getTotalWeights());
		goods = new ComputerWeight[68];
		for(int i=0; i<goods.length; i++) {
			if(i % 2 ==0)
				goods[i] = new Television();
			else
				goods[i] = new WashMachine();
		}
		truck.setGoods(goods);
		System.out.printf("����װ�صĻ���������%-8.5f kg\n",truck.getTotalWeights());
	}
}
