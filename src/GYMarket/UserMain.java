package GYMarket;

/***
 * 不同顾客的购买方式
 * 顾客A：在超市购买了若干斤苹果和草莓
 * 顾客B：在超市购买了若干斤苹果、 草莓和芒果
 * 顾客C：草莓限时打8折，在超市购买了若干斤苹果、 草莓和芒果
 * 顾客D：购物满 100 减 10 块，草莓限时打8折，超市购买了若干斤苹果、 草莓和芒果
 */
public class UserMain {
    public static void main(String[] args) {
        FruitMarket market = new FruitMarket();
        Customer customerA = new Customer(market);
        Customer customerB = new Customer(market);
        Customer customerC = new Customer(market);
        Customer customerD = new Customer(market);

        // 顾客A的测试
        customerA.buyFruits(5, 3); // 购买5苹果 3草莓

        // 顾客B的测试
        customerB.buyFruits(2, 1, 2); // 购买2苹果 1草莓 2芒果

        // 顾客C的测试
        customerC.buyFruitsWithDiscount(3, 4, 2); // 购买3苹果 4草莓 2折扣芒果

        // 顾客D的测试
        customerD.buyFruitsWithDiscountAndCoupon(4, 5, 3); // 购买4苹果 5草莓 3芒果 享受折扣和优惠券
    }
}
