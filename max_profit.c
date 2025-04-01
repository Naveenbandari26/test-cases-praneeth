// max_profit.c
#include <stdio.h>
#include <limits.h>

int maxProfit(int prices[], int size) {
    if (size < 2) return 0;

    int p = 0, mini = prices[0];
    for (int i = 1; i < size; i++) {
        if (prices[i] == INT_MIN) continue;  // Ignore invalid prices
        if (prices[i] < mini) mini = prices[i];
        if (prices[i] - mini > p) p = prices[i] - mini;
    }
    return p;
}
