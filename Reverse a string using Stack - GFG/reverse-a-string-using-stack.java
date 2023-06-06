//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}

// } Driver Code Ends


class Solution {
    
    public String reverse(String S){
        //code here
        if(S.length()<=1){
            return S;
        }
        String a="";
        Stack<Character>ll=new Stack<>();
        int n=S.length();
        for(int i=0;i<n;i++){
            ll.push(S.charAt(i));
        }
        for(int i=0;i<n;i++){
            a=a+ll.pop();
        }
        return a;
    }
}