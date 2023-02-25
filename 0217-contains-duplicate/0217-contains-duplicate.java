class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> ss=new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(ss.contains(nums[i])){
                return true;
            }
            ss.add(nums[i]);
        }
        return false;
    }
}