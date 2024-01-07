class Solution {
    public int reverse(int x) {
         int temp=x;
        long reverseNum=0 ;
            int  reminder ;
        while(temp!=0){
        
           reminder=temp%10;
    reverseNum=reverseNum*10+reminder;
            temp/=10;
           
           
        } if(reverseNum<Integer.MIN_VALUE || reverseNum>Integer.MAX_VALUE){
            return 0;
        }       
       else{ 
    return (int)reverseNum;
       }
    }
}