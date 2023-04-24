class Solution {
    public String reverseOnlyLetters(String s) {
        
 //       StringBuilder str=new StringBuilder(s);
        char c[] = s.toCharArray();
        int i = 0, j = c.length-1;
        while(i<j){
            if(Character.isLetter(c[i]) && Character.isLetter(c[j])){
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
            else{
                if(!Character.isLetter(c[i]) && Character.isLetter(c[j])){
                    i++;
                }
                else if(Character.isLetter(c[i]) && !Character.isLetter(c[j])){
                    j--;
                }
                else{
                    i++;
                    j--;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : c){
            sb.append(ch);
        }
        return sb.toString();
    }
}