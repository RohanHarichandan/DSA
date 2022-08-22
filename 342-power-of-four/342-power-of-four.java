class Solution {
    public boolean isPowerOfFour(int n) {
        
        
               int bits=(int)(Math.log(n)/Math.log(2)+1);
        return (n & (n-1))==0 && n>0 && (bits & 1)==1; 

    }
}