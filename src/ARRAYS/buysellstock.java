package ARRAYS;

public class buysellstock {

        public int maxProfit(int[] prices) {
            int profit = 0 ;
            int minicost = prices[0] ;
            for( int i = 0 ; i<prices.length ; i++){
                int cost = prices[i] - minicost ;
                profit = Math.max( profit , cost);
                minicost = Math.min( minicost , prices[i]);
            }

            return profit;
        }
    }

