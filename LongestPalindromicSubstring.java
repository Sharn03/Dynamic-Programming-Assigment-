package DynamicProgramming;

public class LongestPalindromicSubstring {
	public static void main(String[] args) {
        LongestPalindromicSubstring solution = new LongestPalindromicSubstring();

        String s1 = "babad";
        System.out.println(solution.longestPalindrome(s1));
        
    }
	
	 public String longestPalindrome(String s) {
	        if (s == null || s.length() == 0) {
	            return "";
	        }
	        
	        int n = s.length();
	        boolean[][] dp = new boolean[n][n];
	        int start = 0;
	        int maxLength = 1;
	        
	        // Initialize dp for single character substrings
	        for (int i = 0; i < n; i++) {
	            dp[i][i] = true;
	        }
	        
	        // Initialize dp for two consecutive same characters
	        for (int i = 0; i < n - 1; i++) {
	            if (s.charAt(i) == s.charAt(i + 1)) {
	                dp[i][i + 1] = true;
	                start = i;
	                maxLength = 2;
	            }
	        }
	        
	        // Check for substrings of length > 2
	        for (int len = 3; len <= n; len++) {
	            for (int i = 0; i <= n - len; i++) {
	                int j = i + len - 1;
	                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
	                    dp[i][j] = true;
	                    if (len > maxLength) {
	                        maxLength = len;
	                        start = i;
	                    }
	                }
	            }
	        }
	        
	        return s.substring(start, start + maxLength);
	    }
}
