class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n=nums.length;
        int i=0;
        int j=n-1;
        int[] arr=new int[2];
        while(i<j){
            if(nums[i]+nums[j]==target){
                arr[0]=i+1;
                arr[1]=j+1;
                return arr;
            }
            if(nums[i]+nums[j]<target){
                i++;
            }
            if(nums[i]+nums[j]>target){
                j--;
            }
            
        }
        return null;
        
    }
}