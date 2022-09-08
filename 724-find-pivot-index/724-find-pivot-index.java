class Solution {
    public int pivotIndex(int[] nums) {
        
        int sum=0;
    for(int i=0;i<nums.length;i++){
        sum+=nums[i];
    }
        int left=0;
        for(int i=0;i<nums.length;i++){
           left=left+nums[i];
            int remaining=sum-left;
            
            if(remaining==left-nums[i]){
                return i;
            }
        }
        return -1;
    }
}