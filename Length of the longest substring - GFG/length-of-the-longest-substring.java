//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    int longestUniqueSubsttr(String S){
        
        int n=S.length();
        Set ss=new HashSet<>();
        int i=0,j=0;
        int len=0;
        
        while(j<n){
            while(!ss.add(S.charAt(j))){
                ss.remove(S.charAt(i));
                i++;
                
            }
            int max=j-i+1;
            len=Math.max(max,len);
            j++;
        }
     return len;   
    }
}