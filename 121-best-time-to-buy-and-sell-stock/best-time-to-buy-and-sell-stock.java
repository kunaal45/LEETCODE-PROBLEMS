class Solution {
    public int maxProfit(int[] prices) {
        int maxp = Integer.MIN_VALUE;
        int minprice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            minprice=Math.min(minprice,prices[i]);

            int profit = prices[i] - minprice;

            maxp =Math.max(maxp,profit);
        } 
        return maxp;
    }
}