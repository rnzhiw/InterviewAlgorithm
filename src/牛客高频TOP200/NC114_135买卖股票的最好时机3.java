package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC114_135买卖股票的最好时机3 {
    public static void main(String[] args) {

    }

    public int maxProfit (int[] prices) {
        if(prices.length < 2) {
            return 0;
        }
        int buy1 = -prices[0],sell1 = 0;
        int buy2 = -prices[0],sell2 = 0;
        for(int i = 1;i < prices.length;i++) {
            buy1 = Math.max(buy1,-prices[i]);
            sell1 = Math.max(sell1,buy1 + prices[i]);
            buy2 = Math.max(buy2,sell1-prices[i]);
            sell2 = Math.max(sell2,buy2 + prices[i]);
        }
        return sell2;
    }
}
