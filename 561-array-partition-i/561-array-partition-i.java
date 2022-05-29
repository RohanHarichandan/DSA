class Solution {
    public int arrayPairSum(int[] nums) {
     
         int[] hash=new int[20001];
         for(int ele:nums){
             hash[ele+10000]++;
         }
         int sum=0;
         int p=0;
         for(int i=0;i<20001;i++){
             if(hash[i]==0) continue;
             while(hash[i]!=0){
                 if(p%2==0){
                     sum+=(i-10000);
                 }
                 p++;
                 hash[i]--;
             }
         }
         return sum;
    }
}