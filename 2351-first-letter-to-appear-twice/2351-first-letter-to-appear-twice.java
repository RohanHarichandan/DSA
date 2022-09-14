class Solution {
    public char repeatedCharacter(String s) {
        
        HashSet<Character>ll=new HashSet<>();
        
        for(int i=0;i<s.length();i++){
        if(ll.contains(s.charAt(i))){
            return s.charAt(i);
        }    
            ll.add(s.charAt(i));
        }
    return 'v';
    }
}