class Solution {
    
    
    public int countPrimes(int n) {
      
        
       if(n<2){
           return 0;
       }
     
        
        int count=0;
        boolean isPrime[]=new boolean[n];
        Arrays.fill(isPrime,true);
        
           isPrime[0]=false;
           isPrime[1]=false;
        
        for(int i=2;i*i<=n-1;i++){
            for(int j=2*i;j<=n-1;j+=i){
                isPrime[j]=false;
            }
        }
        for(int i=0;i<n;i++){
         
        if(isPrime[i]==true){
         count++;
         }
        }
        return count;
    }
}