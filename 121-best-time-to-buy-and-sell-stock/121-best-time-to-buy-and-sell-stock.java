class Solution {
    public int maxProfit(int[] arr) {
        
        int profit=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else if (arr[i]-min>profit){
                profit=arr[i]-min;
            }
        }
        return profit;
    }
}