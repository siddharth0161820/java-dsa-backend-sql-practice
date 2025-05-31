//Time Complexity=O(n)
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int previousPrice=prices[0];
        //Apply Loop
        for(int i=0;i<prices.length;i++){
            int currentProfit=prices[i]-previousPrice;
            if(currentProfit>maxProfit){
               maxProfit=currentProfit;
            }else if(prices[i]<previousPrice){
                 previousPrice=prices[i];
            }
        }
        return maxProfit;
    }
}
