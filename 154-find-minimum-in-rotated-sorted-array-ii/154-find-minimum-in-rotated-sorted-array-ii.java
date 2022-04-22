class Solution {
    public int findMin(int[] nums) {
        
        int small=nums[0];
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<small)
                small=nums[i];
        }
        return small;
    }
}