import java.util.Arrays;

public class MaxShareProfit {
    public static void main(String[] args) {
                int[] prices=new int[]{7,1,5,3,6,4};
                int min_price = prices[0];
                int maxprof = 0;


                for(int i=1;i<prices.length;i++){
                    maxprof = Math.max(maxprof,prices[i]-min_price);
                    min_price = Math.min(prices[i],min_price);
                }

        System.out.println(maxprof);

    }
}
