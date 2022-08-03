public class Best_Time_to_Buy_and_Sell_Stock_121 {

    public static void main(String args[]) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
        System.out.println(maxProfit(new int[]{2,4,1}));
        System.out.println(maxProfit(new int[]{2,1,2,1,0,1,2}));
        System.out.println(maxProfit(new int[]{3,2,6,5,0,3}));
        System.out.println(maxProfit(new int[]{3,3,5,0,0,3,1,4}));
    }

    public static int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int min = prices[0],max = 0, profit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]<=min) {
                min = prices[i];
                max = 0;
            } else if(prices[i]>=max){
                max = prices[i];
                if(profit < (max - min)){
                    profit = max - min;
                }
            }
        }
        return profit;
    }
}