package io.ms.leetcodechallenges.february2022;

public class BestTimeToBuyAndSellStock_121 {

    public static void main(String[] args) {

        int [] prices = {7,1,5,3,6,4};

        int result = maxProfit(prices);

        System.out.println(result);
    }

    public static int maxProfit(int[] prices) {

        if(prices == null || prices.length ==0){
            return 0;
        }

        int largestDifference =0;
        int minDifference = Integer.MAX_VALUE;

        for(int buyDay=0;buyDay<prices.length;buyDay++){

            if(prices[buyDay] < minDifference){
                minDifference = prices[buyDay];
            }else{
                largestDifference = Math.max(largestDifference,prices[buyDay]- minDifference);
            }
        }

        return largestDifference;
    }
}
