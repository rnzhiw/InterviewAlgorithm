package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC108_134买卖股票的最好时机2 {
    public static void main(String[] args) {

    }

    public int maxProfit (int[] prices) {
        if(prices == null || prices.length == 0) {
            return 0;
        }
        int res = 0;
        for(int i = 1;i < prices.length;i++) {
            if(prices[i] > prices[i - 1]) {
                res = res + prices[i] - prices[i - 1];
            }
        }
        return res;
    }
}
