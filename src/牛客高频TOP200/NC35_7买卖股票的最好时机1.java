package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC35_7买卖股票的最好时机1 {
    public static void main(String[] args) {

    }

    public int maxProfit (int[] prices) {
        int min = prices[0],money = 0;
        for(int i = 0;i < prices.length;i++) {
            min = Math.min(min,prices[i]);
            money = Math.max(money,prices[i] - min);
        }
        return money;
    }
}
