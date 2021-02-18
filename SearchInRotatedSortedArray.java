class Solution {
    public int search(int[] nums, int target) {
         int index=0;
		 boolean flag = false;
		 for(int i=0;i<nums.length;i++) {
			 if(nums[i]==target) {
				 index = i;
				 flag = true;
				 break;
			 }
		 }
		 if(flag == true)
			 return index;
		 else
			 return -1;
		 
    }
}
