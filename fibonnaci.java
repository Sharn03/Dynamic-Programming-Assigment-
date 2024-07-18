package DynamicProgramming;

import java.util.Arrays;

public class fibonnaci {

	public static void main(String[] args) {
		int n = 6;
		int dp[] = new int[n+1];
		
		for(int i = 0;i<dp.length;i++)
		{
			dp[i] = -1;
		}
		
		int ans = fibo(n,dp);
		System.out.println(ans);
	}

	private static int fibo(int n, int[] dp) {
		
		if(n<=1)
		{
			return n;
		}
		
		//checking if the dp array has value for which n has already computed
		if(dp[n] != -1)
		{
			return n;
		}
		
		return fibo(n-1,dp)+fibo(n-2,dp);
		
	}

}
