class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        
//         for(int i=0;i<k;i++){
            
//             int max=arr[1];
//             for(int i=0;i<arr.length;i++){
//                 if(max<arr[i]){
//                     max=arr[i];
//                 }
//             }
//         }
        
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}