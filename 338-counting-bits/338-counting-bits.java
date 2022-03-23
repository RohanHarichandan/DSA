class Solution {
    public int[] countBits(int num) {
        
        int x[]=new int [num+1];
        for(int i=0;i<=num;i++){
            x[i]=bits(i);
        }
        return x;
    }
    static int bits(int a){
        int count=0;
        
        while(a!=0){
            if((a&1)==1){
                count++;
            }
            a=a>>1;
        }
        return count;
    }
}