public class BestTimeToBuyAndSellStock{
    public static void main(String[] args) {
        
    }

    //optimal solution
    public int OptimalMaxProfit(int[] prices) {
        int price = Integer.MAX_VALUE;
        int diff = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<price)
                price = prices[i];
            if(prices[i]-price>diff)
                diff = prices[i] - price;
            
        }
        return diff;
    }


    //first implementation, slow O(n^2)
    public static int maxProfit(int[] prices){
        int max = Integer.MAX_VALUE;

        for(int i =0; i < prices.length -1; i++)
            for(int j = i+1; j < prices.length; j++)
                if(prices[j] - prices[i] > max)
                    max = prices[j]-prices[i];
            
        if(max < 0)
            return 0;
        return max;

    }


}