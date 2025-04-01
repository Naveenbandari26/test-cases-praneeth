public class Test {

    // Method to calculate the maximum profit
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0; // Edge case: if only one price, no transaction possible

        int p = 0, mini = prices[0];
        for (int i = 1; i < prices.length; i++) {
            mini = Math.min(mini, prices[i]);
            p = Math.max(p, prices[i] - mini);
        }
        return p;
    }

    // Test helper function
    public static void test(int testCaseNum, int[] prices, int expected) {
        test_max_profit sol = new test_max_profit();
        int result = sol.maxProfit(prices);
        if (result == expected) {
            System.out.println("✅Test Case " + testCaseNum + " PASSED");
        } else {
            System.out.println("❌ Test Case " + testCaseNum + " FAILED (Expected " + expected + ", Got " + result + ")");
        }
    }

    // Function to run test cases
    public static void runTests() {
        int testCaseNum = 1;

        // **Basic Test Cases**
        test(testCaseNum++, new int[]{7, 1, 5, 3, 6, 4}, 5);
        test(testCaseNum++, new int[]{7, 6, 4, 3, 1}, 0);
        test(testCaseNum++, new int[]{1, 2, 3, 4, 5}, 4);
        test(testCaseNum++, new int[]{5}, 0);
        test(testCaseNum++, new int[]{3, 8, 1, 10}, 9);
        test(testCaseNum++, new int[]{2, 4, 1, 7, 5, 3, 6, 8}, 7);

        // **Edge Cases**
        int[] prices8 = new int[100000];
        for (int i = 0; i < 100000; i++) {
            prices8[i] = i % 10;
        }
        test(testCaseNum++, prices8, 9);

        int[] prices9 = new int[100000];
        for (int i = 0; i < 100000; i++) {
            prices9[i] = 5;
        }
        test(testCaseNum++, prices9, 0);

        // **Corrected Large Fluctuation Test**
        test(testCaseNum++, new int[]{100000, 50000, 1000000, 20000, 999999}, 979999);

        test(testCaseNum++, new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE}, 0);

        int[] prices12 = new int[100000];
        for (int i = 0; i < 100000; i++) {
            prices12[i] = 100000 - i;
        }
        test(testCaseNum++, prices12, 0);

        test(testCaseNum++, new int[]{1, 2, 1, 1000000, 1, 2, 1}, 999999);

        System.out.println("\nAll test cases executed!");
    }

    public static void main(String[] args) {
        runTests();
    }
}
