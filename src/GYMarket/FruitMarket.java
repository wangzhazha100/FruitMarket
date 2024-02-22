package GYMarket;

/***
 * 水果超市结算
 */
public class FruitMarket {
    private double applePrice = 8.0; // 苹果价格
    private double strawberryPrice = 13.0; // 草莓价格
    private double mangoPrice = 20.0; // 芒果价格
    /***
     * 总水果价格计算
     * @param apples 苹果数量
     * @param strawberries 草莓数量
     * @return
     */
    public double calculateTotalPrice(int apples, int strawberries) {
        double totalPrice = apples * applePrice + strawberries * strawberryPrice;
        return totalPrice;
    }

    private double discountRate = 0.8; // 草莓折扣率

    /***
     *  总水果价格计算
     * @param apples 苹果数量
     * @param strawberries 草莓数量
     * @param mangos 芒果数量
     * @return
     */
    public double calculateTotalPrice(int apples, int strawberries, int mangos) {
        double totalPrice = apples * applePrice + strawberries * strawberryPrice + mangos * mangoPrice;
        return totalPrice;
    }

    /***
     *  总折扣水果价格计算
     * @param apples 苹果数量
     * @param strawberries 草莓数量
     * @param mangos 芒果数量
     * @return
     */
    public double calculateTotalPriceWithDiscount(int apples, int strawberries, int mangos) {
        double totalPrice = apples * applePrice + strawberries * strawberryPrice * discountRate + mangos * mangoPrice;
        return totalPrice;
    }

    /***
     *  总折扣水果价格并且使用优惠券计算
     * @param apples 苹果数量
     * @param strawberries 草莓数量
     * @param mangos 芒果数量
     * @return
     */
    public double calculateTotalPriceWithDiscountAndCoupon(int apples, int strawberries, int mangos) {
        double totalPrice = apples * applePrice + strawberries * strawberryPrice * discountRate + mangos * mangoPrice;
        if (totalPrice >= 100) {
            totalPrice -= 10;
        }
        return totalPrice;
    }
}
