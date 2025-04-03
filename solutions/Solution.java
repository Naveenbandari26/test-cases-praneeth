public class Solution {
    public int maxProfit(int[] prices) {

    }

    // Add a main method for testing
    public static void main(String[] args) {

    }
}

// class Solution {
//     public int maxProfit(int[] prices) {
//         if (prices.length < 2) return 0; // Edge case: If only one price, no transaction possible

//         int p = 0, mini = prices[0];
//         for (int i = 1; i < prices.length; i++) {
//             mini = Math.min(mini, prices[i]);
//             p = Math.max(p, prices[i] - mini);
//         }
//         return p;
//     }

//     // Test helper function
//     public static void test(int testCaseNum, int[] prices, int expected) {
//         Solution sol = new Solution();
//         int result = sol.maxProfit(prices);
//         if (result == expected) {
//             System.out.println("Test Case " + testCaseNum + " PASSED");
//         } else {
//             System.out.println("❌ Test Case " + testCaseNum + " FAILED (Expected " + expected + ", Got " + result + ")");
//         }
//     }