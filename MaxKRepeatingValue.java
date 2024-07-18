package DynamicProgramming;

public class MaxKRepeatingValue {
	
	
	 public static void main(String[] args)
	 {
        MaxKRepeatingValue solution = new MaxKRepeatingValue();
        String sequence1 = "ababc";
        String word1 = "ab";
        System.out.println( solution.maxRepeating(sequence1, word1)); // Output: 2
	        
	  
	    }
	 
	  public int maxRepeating(String sequence, String word)
	  {
		  int n = sequence.length();
	        int m = word.length();
	        
	        boolean[] dp = new boolean[n / m + 2]; 
	        
	        dp[1] = sequence.contains(word);
	        int maxK = dp[1] ? 1 : 0;
	        
	        for (int k = 2; k < dp.length; k++) {
	            if (dp[k - 1] && sequence.contains(word.repeat(k))) {
	                dp[k] = true;
	                maxK = k;
	            } else {
	                break; 
	            }
	        }
	        
	        return maxK;
	  }
	    
	   
}
