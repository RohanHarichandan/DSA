class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        if(arr.length<3)
            return 0;
        int low=0;
        int high=arr.length-1;
        
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                return mid;
            if(arr[mid]>arr[mid-1])
                low=mid+1;
            if(arr[mid]<arr[mid-1])
                high=mid;
        }
        return low;
    }
    
}