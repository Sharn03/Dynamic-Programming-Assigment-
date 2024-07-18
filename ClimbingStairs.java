package DynamicProgramming;

public class ClimbingStairs {
	public static void main(String[] args) {
		  int n1 = 2;
	      System.out.println(climbStairs(n1));
	}
	
	 public static int climbStairs(int n) {
	        if (n == 0) return 1;
	        if (n == 1) return 1;
	        
	        int[] dp = new int[n + 1];
	        dp[0] = 1; // Base case: 1 way to be on the ground (do nothing)
	        dp[1] = 1; // Base case: 1 way to reach the first step (take 1 step)
	        
	        for (int i = 2; i <= n; i++) {
	            dp[i] = dp[i - 1] + dp[i - 2];
	        }
	        
	        return dp[n];
	    }
}
