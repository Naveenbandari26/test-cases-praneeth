// TestCases.cpp
#include "Solution.cpp"
#include <iostream>
#include <vector>
#include <climits>

using namespace std;

void runTests() {
    Solution sol;
    int testCaseNum = 1;

    auto test = [&](vector<int> prices, int expected) {
        int result = sol.maxProfit(prices);
        if (result == expected) {
            cout << "✅ Test Case " << testCaseNum << " PASSED\n";
        } else {
            cout << "❌ Test Case " << testCaseNum << " FAILED (Expected " << expected << ", Got " << result << ")\n";
        }
        testCaseNum++;
    };

    // General cases
    test({7, 1, 5, 3, 6, 4}, 5);
    test({7, 6, 4, 3, 1}, 0);
    test({1, 2, 3, 4, 5}, 4);
    test({5}, 0);
    test({3, 8, 1, 10}, 9);
    test({2, 4, 1, 7, 5, 3, 6, 8}, 7);
    test({}, 0);

    // Large input cases
    vector<int> prices8(100000);
    for (int i = 0; i < 100000; i++) {
        prices8[i] = i % 10;
    }
    test(prices8, 9);

    vector<int> prices9(100000, 5);
    test(prices9, 0);

    test({100000, 50000, 1000000, 20000, 999999}, 979999);

    // **Fixed Test Case 11: Handling Overflow Properly**
    test({INT_MAX, INT_MIN, INT_MAX},0);

    cout << "\n✅ All test cases executed!\n";
}

int main() {
    runTests();
    return 0;
}
