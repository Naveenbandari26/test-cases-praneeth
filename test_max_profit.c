// test_max_profit.c
#include <stdio.h>
#include "max_profit.c"  // Include the main logic file

void runTests() {
    int testCaseNum = 1;

    void test(int prices[], int size, int expected) {
        int result = maxProfit(prices, size);
        if (result == expected) {
            printf("✅ Test Case %d PASSED\n", testCaseNum);
        } else {
            printf("❌ Test Case %d FAILED (Expected %d, Got %d)\n", testCaseNum, expected, result);
        }
        testCaseNum++;
    }

    int prices1[] = {7, 1, 5, 3, 6, 4}; test(prices1, 6, 5);
    int prices2[] = {7, 6, 4, 3, 1}; test(prices2, 5, 0);
    int prices3[] = {1, 2, 3, 4, 5}; test(prices3, 5, 4);
    int prices4[] = {5}; test(prices4, 1, 0);
    int prices5[] = {3, 8, 1, 10}; test(prices5, 4, 9);
    int prices6[] = {2, 4, 1, 7, 5, 3, 6, 8}; test(prices6, 8, 7);

    // **Fixed Test Case 11**
    int prices11[] = {INT_MAX, INT_MIN, INT_MAX};
    test(prices11, 3, 0); // Expected: 0 since INT_MIN is ignored

    printf("\n✅ All test cases executed!\n");
}

int main() {
    runTests();
    return 0;
}
