package DynamicProgramming;

public class MaximumSubarraySum {
	
	   
    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum subarray sum: " + maxSubArray(nums1));
    }
	 public static int maxSubArray(int[] nums) {
	        // Initialize variables to track maxEndingHere and maxSoFar
	        int maxEndingHere = nums[0];
	        int maxSoFar = nums[0];
	        
	        // Iterate through the array starting from the second element
	        for (int i = 1; i < nums.length; i++) {
	            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
	            maxSoFar = Math.max(maxSoFar, maxEndingHere);
	        }
	        
	        return maxSoFar;
	    }
	 
}
