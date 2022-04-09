class Solution {
    public int searchInsert(int[] nums, int target) {
        
       int l=0;
        int r=nums.length-1;
        
        while(l<=r){
            int midIndex=(l+r)/2;
            
            if(nums[midIndex]==target){
                return midIndex;
            }
            else if(nums[midIndex]>target){
                r=midIndex-1;
            }
            else{
                l=midIndex+1;
            }
        }
        return l;
    }
}