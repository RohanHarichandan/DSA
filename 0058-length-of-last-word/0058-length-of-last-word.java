class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
       
        return s.length()-1 -s.lastIndexOf(" ");
        
    }
}