/**
 * @Title: ComputePrice.java
 * @Package: no8.ex2
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-2-16 下午12:16:55
 * @version V1.0
 */
package no8.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Steven Ming
 * @datetime 2017-2-16 下午12:16:55
 */
public class ComputePrice {
    public static void main(String[] args) {
        String menu = "北京烤鸭：189元 西芹炒肉:12.9元 酸莱鱼:69元 铁板牛柳:32元";
        Scanner scanner = new Scanner(menu);
        String regex = "[^0123456789.]+";
        scanner.useDelimiter(regex);
        double sum = 0;
        while (scanner.hasNext()) {
            try {
                double price = scanner.nextDouble();
                sum = sum + price;
                System.out.println(price);
            } catch (InputMismatchException exp) {
                @SuppressWarnings("unused")
                String t = scanner.next();
            }
        }
        System.out.println("菜单总价格:" + sum + "元");
        
    }
}
