class Solution {
    public int maximumDifference(int[] arr) {
        
        
        int res =0;
        int minval=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            res=Math.max(res,arr[i]-minval);
            minval=Math.min(minval,arr[i]);
            
            
        }
        if(res==0){
            return -1;
        }
        
        return res;
    }
}