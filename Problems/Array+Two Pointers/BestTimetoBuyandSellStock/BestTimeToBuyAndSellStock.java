package BestTimetoBuyandSellStock;
//Time Complexity=O(n)
//Space Complexity=O(1)
public class BestTimeToBuyAndSellStock {
    public static int bestTimeToBuyAndSellStock(int[]prices){
        int maxProfit=0;
        int previousPrice=prices[0];
        for (int i = 1; i <prices.length ; i++) {
              int currentProfit=prices[i]-previousPrice;
              //Conditions
            if (currentProfit>maxProfit){
                maxProfit=currentProfit;
            }if (prices[i]<previousPrice){
                previousPrice=prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[]prices={7,6,4,3,1};
        System.out.println("Maximum Profit is: "+bestTimeToBuyAndSellStock(prices));
    }
}
