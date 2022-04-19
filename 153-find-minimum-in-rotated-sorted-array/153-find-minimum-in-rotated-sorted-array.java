class Solution {
    public int findMin(int[] nums) {
        
        if(nums==null || nums.length==0)
            return 0;
       int min=nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(min>nums[i])
                min=nums[i];
        }
        return min;
    }
}