# test_max_profit.pyy

from max_profit import Solution

# Test helper function
def test(testCaseNum, prices, expected):
    sol = Solution()
    result = sol.maxProfit(prices)
    if result == expected:
        print(f"✅ Test Case {testCaseNum} PASSED")
    else:
        print(f"❌ Test Case {testCaseNum} FAILED (Expected {expected}, Got {result})")

# Function to run test cases
def runTests():
    testCaseNum = 1

    # **Basic Test Cases**
    test(testCaseNum, [7, 1, 5, 3, 6, 4], 5)
    testCaseNum += 1
    test(testCaseNum, [7, 6, 4, 3, 1], 0)
    testCaseNum += 1
    test(testCaseNum, [1, 2, 3, 4, 5], 4)
    testCaseNum += 1
    test(testCaseNum, [5], 0)
    testCaseNum += 1
    test(testCaseNum, [3, 8, 1, 10], 9)
    testCaseNum += 1
    test(testCaseNum, [2, 4, 1, 7, 5, 3, 6, 8], 7)
    testCaseNum += 1

    # **Edge Cases**
    test(testCaseNum, [100000, 50000, 1000000, 20000, 999999], 979999)
    testCaseNum += 1
    test(testCaseNum, [999999, 1, 1000000], 999999)
    testCaseNum += 1
    test(testCaseNum, [5] * 100000, 0)
    testCaseNum += 1
    test(testCaseNum, list(range(100000)), 99999)
    testCaseNum += 1
    test(testCaseNum, list(range(100000, 0, -1)), 0)
    testCaseNum += 1
    test(testCaseNum, [1, 2, 1, 1000000, 1, 2, 1], 999999)
    testCaseNum += 1

    print("\n✅ All test cases executed!")

if __name__ == "__main__":
    runTests()
