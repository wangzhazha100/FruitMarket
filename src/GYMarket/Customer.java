package GYMarket;

/***
 * 顾客行为
 */
public class Customer {
    private FruitMarket market;

    public Customer(FruitMarket market) {
        this.market = market;
    }

    /***
     * 买水果
     * @param apples 苹果数量
     * @param strawberries 草莓数量
     */
    public void buyFruits(int apples, int strawberries) {
        double totalPrice = market.calculateTotalPrice(apples, strawberries);
        System.out.println("苹果和草莓的总价: $" + totalPrice);
    }

    /***
     * 买水果
     * @param apples 苹果数量
     * @param strawberries 草莓数量
     * @param mangos 芒果数量
     */
    public void buyFruits(int apples, int strawberries, int mangos) {
        double totalPrice = market.calculateTotalPrice(apples, strawberries, mangos);
        System.out.println("苹果、草莓和芒果的总价: $" + totalPrice);
    }

    /***
     * 买折扣水果
     * @param apples 苹果数量
     * @param strawberries 草莓数量
     * @param mangos 芒果数量
     */
    public void buyFruitsWithDiscount(int apples, int strawberries, int mangos) {
        double totalPrice = market.calculateTotalPriceWithDiscount(apples, strawberries, mangos);
        System.out.println("苹果、草莓和芒果的总价折扣: $" + totalPrice);
    }

    /***
     * 买折扣水果并使用优惠券
     * @param apples 苹果数量
     * @param strawberries 草莓数量
     * @param mangos 芒果数量
     */
    public void buyFruitsWithDiscountAndCoupon(int apples, int strawberries, int mangos) {
        double totalPrice = market.calculateTotalPriceWithDiscountAndCoupon(apples, strawberries, mangos);
        System.out.println("苹果、草莓和芒果的折扣和优惠券的总价: $" + totalPrice);
    }
}

