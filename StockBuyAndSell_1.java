class Solution {
    public int maximumProfit(int prices[]) {
        int sell=1;
        int buy=0;
        int profit=0;
        while(sell<prices.length){
            if(prices[sell]>prices[buy] && prices[sell]-prices[buy]>profit){
                profit=prices[sell]-prices[buy];
                sell++;
            }
            else if(prices[sell]<=prices[buy]){
                buy=sell;
                sell++;
            }
            else sell++;
        }
        return profit;
    }
}