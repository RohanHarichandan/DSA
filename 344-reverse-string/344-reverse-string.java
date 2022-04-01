class Solution {
    public void reverseString(char[] s) {
        
    int i=s.length-1;
     int j=0;
        
     while(j<i){
         char temp=s[i];
         s[i]=s[j];
         s[j]=temp;
         j++;
         i--;
     }
        
    }
}