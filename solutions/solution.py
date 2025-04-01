# max_profit.py
#main function

class Solution:
    def maxProfit(self, prices):
        if len(prices) < 2: 
            return 0  # Edge case: No transaction possible with one price
        
        p, mini = 0, prices[0]
        for price in prices[1:]:
            mini = min(mini, price)
            p = max(p, price - mini)
        return p
