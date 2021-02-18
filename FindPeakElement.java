/*A peak element is an element that is strictly greater than its neighbors.

Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞.
*/
 
class Solution {
    public int findPeakElement(int[] nums) {
        
      int max = nums[0];
        
		 int mindex = 0;
		 for(int i=0;i<nums.length;i++) {
			 if(max<nums[i]) {
				 max= nums[i];
				 mindex = i;
			 }
		 }
	
         return mindex;
    }
}
