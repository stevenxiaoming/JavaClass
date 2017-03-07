/**
 * @Title: Machine.java
 * @Package: no7.ex2
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-1-5 下午12:17:04
 * @version V1.0
 */
package no7.ex2;

/**
 * @author Steven Ming
 *
 */
public class Machine {
	public void checkBag (Goods goods) throws DangerException {
		if(goods.isDanger()) {
			DangerException danger = new DangerException();
			throw danger;
		}
		else {
			System.out.print(goods.getName() + "不是危险品 ！");
		}
	}
}
