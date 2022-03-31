class Solution {
    public int numberOfSteps(int num) {
        
        if(num==0)
            return 0;
        
        int count=0;
        while(num!=0){
            if((num&1)==0){
                num=(num>>1);
            }
            else{
                num=num-1;
            }
            count++;
        }
        return count;
    }
}