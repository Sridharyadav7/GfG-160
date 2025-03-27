class Solution {
    public int maximumProfit(int prices[]) {
        List<Integer> profit = new ArrayList<>();
        int buy=0;
        int sell=1;
        while(sell<prices.length){
            if(prices[sell]>prices[buy]){
                profit.add(prices[sell]-prices[buy]);
                buy++;
                sell++;
            }
            else{
                sell++;
                buy++;
            }
        }
        int maxProfit=0;
        for(int i=0;i<profit.size();i++){
            maxProfit+=profit.get(i);
        }
        return maxProfit;
    }
}