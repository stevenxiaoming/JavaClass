/**
 * @Title: NewYear.java
 * @Package: no7.ex1
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-29 下午12:42:40
 * @version V1.0
 */
package no7.ex1;

class MobileShop {
	InnerPurchaseMoney purchaseMoney1;
	InnerPurchaseMoney purchaseMoney2;
	
	private int mobileAmount;
	MobileShop() {
		purchaseMoney1 = new InnerPurchaseMoney(20000);
		purchaseMoney2 = new InnerPurchaseMoney(10000);
	}
	
	void setMobileAmount(int m) {
		mobileAmount = m;
	}
	
	int getMobileAmount() {
		return mobileAmount;
	}
	
	class InnerPurchaseMoney {
		int moneyValue;
		InnerPurchaseMoney(int m) {
			moneyValue = m;
		}
		
		void buyMobile() {
			if(moneyValue >= 20000) {
				mobileAmount = mobileAmount - 6;
				System.out.println("用价值" + moneyValue + "的内部购物券买了6部手机");
			}
			else if(moneyValue < 20000 && moneyValue >= 10000) {
				mobileAmount = mobileAmount - 3;
				System.out.println("用价值" + moneyValue + "的内部购物券买了3部手机");
			}
		}
	}
}

/**
 * @author Steven Ming
 *
 */
public class NewYear {
	public static void main(String[] args) {
		MobileShop shop = new MobileShop();
		shop.setMobileAmount(30);
		System.out.println("手机专卖店目前有" + shop.getMobileAmount() + "部手机");
		shop.purchaseMoney1.buyMobile();
		shop.purchaseMoney2.buyMobile();
		System.out.println("手机专卖店目前有" + shop.getMobileAmount() + "部手机");		
	}
}
