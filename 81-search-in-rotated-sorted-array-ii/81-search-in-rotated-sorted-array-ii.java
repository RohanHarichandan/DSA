class Solution {
    public boolean search(int[] nums, int target) {
        
         int start = 0, end = nums.length;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) return true;
            if (nums[mid] > nums[start]) { 
                
                if (target < nums[mid] && target >= nums[start]) end = mid;
                else start = mid + 1;
            } else if (nums[mid] < nums[start]) { 
               
                if (target > nums[mid] && target < nums[start]) start = mid + 1;
                else end = mid;
            } else { 
                start++;
            }
        }
        return false;
    }
}