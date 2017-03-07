/**
 * @Title: HandleBigInteger.java
 * @Package: no8.ex4
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-2-16 下午12:41:22
 * @version V1.0
 */
package no8.ex4;

import java.math.BigInteger;

/**
 * @author Steven Ming
 * @datetime 2017-2-16 下午12:41:22
 */
public class HandleBigInteger {
    public static void main(String[] args) {
        BigInteger n1 = new BigInteger("987654321987654321987654321"),
                n2 = new BigInteger("123456789123456789123456789"),
                result = null;
        result = n1.add(n2);
        System.out.println("和:" + result.toString());
        result = n1.subtract(n2);
        System.out.println("差:" + result.toString());
        result = n1.multiply(n2);
        System.out.println("积:" + result.toString());
        result = n1.divide(n2);
        System.out.println("商:" + result.toString());
        BigInteger m = new BigInteger("1968957"),
                COUNT = new BigInteger("0"),
                ONE = new BigInteger("1"),
                TWO = new BigInteger("2");
        System.out.println(m.toString() + "的因子有:");
        for (BigInteger i = TWO; i.compareTo(m) < 0; i = i.add(ONE)) {
            if ((n1.remainder(i).compareTo(BigInteger.ZERO)) == 0) {
                COUNT = COUNT.add(ONE);
                System.out.print(" " + i.toString());
            }
        }
        System.out.println("");
        System.out.println(m.toString() + "一共有" + COUNT.toString() + "个因子");
    }
}
