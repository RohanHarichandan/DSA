class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        HashMap<Integer,Integer>ll=new HashMap<>();
        int arr[]=new int[2];
        
        for(int i=0;i<nums.length;i++){
            if(ll.containsKey(target-nums[i])){
                arr[1]=i;
                arr[0]=ll.get(target-nums[i]);
            }
            ll.put(nums[i],i);
        }
        
         
     
        return arr;
    }
}
