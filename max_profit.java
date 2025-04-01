public class max_profit {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0; // Edge case: If only one price, no transaction possible

        int p = 0, mini = prices[0];
        for (int i = 1; i < prices.length; i++) {
            mini = Math.min(mini, prices[i]);
            p = Math.max(p, prices[i] - mini);
        }
        return p;
    }
}
