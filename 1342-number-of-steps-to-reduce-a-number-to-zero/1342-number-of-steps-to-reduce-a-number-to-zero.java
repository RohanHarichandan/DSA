class Solution {
    public int numberOfSteps(int num) {
        
       //recursive method 
      return  helper(num,0);
        
    }
    
    static int helper(int a,int b){
        if(a==0)
            return b;
        if(a%2==0)
            return helper(a/2,++b);
        return helper(a-1,++b);
    
}
}