# max_profit.py

class Solution:
    def maxProfit(self, prices):
        p=0
        # initializing the minimum price to the first element
        sell=0
        mini=prices[0]
        for i in range(1,len(prices)):
            mini=min(mini,prices[i])
            sell=prices[i]-mini
            if(p<sell):
                p=sell
        return p
