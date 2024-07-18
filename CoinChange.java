package DynamicProgramming;

import java.util.Arrays;

public class CoinChange {
	
	public static void main(String[] args) {
		
        int[] coins = {1, 2, 5};
        int amount = 11;
        
        System.out.println(coinChange(coins, amount));
    }
	 public static int coinChange(int[] coins, int amount) {
	        // Create a dp array to store minimum coins required for each amount from 0 to amount
	        int[] dp = new int[amount + 1];
	        
	        // Initialize dp array with a value greater than amount (impossible value)
	        Arrays.fill(dp, amount + 1);
	        
	        // Base case: 0 coins needed to make amount 0
	        dp[0] = 0;
	        
	        // Iterate through all amounts from 1 to amount
	        for (int i = 1; i <= amount; i++) {
	            // Iterate through each coin denomination
	            for (int coin : coins) {
	                if (coin <= i) {
	                    // Update dp[i] only if using current coin results in fewer coins
	                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
	                }
	            }
	        }
	        
	        // If dp[amount] is still amount + 1, it means amount cannot be formed using given coins
	        return dp[amount] > amount ? -1 : dp[amount];
	    }
	    
}
