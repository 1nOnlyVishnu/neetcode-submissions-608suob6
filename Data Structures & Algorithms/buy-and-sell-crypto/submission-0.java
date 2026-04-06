class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right  = left + 1;
        int profit = 0;

        while(right < prices.length){
            if(prices[left] < prices[right]){
                int currentProfit = prices[right] - prices[left];
                profit = Math.max(currentProfit,profit);
            }else{
                left = right;
            }
            right++;
        }
        return profit;
    }
}
