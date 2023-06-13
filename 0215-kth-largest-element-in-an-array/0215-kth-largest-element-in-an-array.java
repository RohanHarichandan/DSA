class Solution {
    public int findKthLargest(int[] arr, int k) {
         Arrays.sort(arr);
        int n=arr.length;
        int kthArr[] = new int [k];
        int index = 0;
        for(int i = n-1; i >= n- k; i--){
            kthArr[index++] = arr[i];
        }
        return kthArr[k-1];
    }
}