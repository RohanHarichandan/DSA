class Solution {
    public String addBinary(String a, String b) {
          StringBuilder sb=new StringBuilder();
        int i=a.length()-1,j=b.length()-1,c=0;
        while(i>-1 || j>-1){
            int sum=((i>-1)?a.charAt(i--)-'0':0)+((j>-1)?b.charAt(j--)-'0':0);
            sb.append((sum+c)%2);
            c=(sum+c<2)?0:1;
        }
        if(c==1)   sb.append(1);
        return sb.reverse().toString();
    }
}