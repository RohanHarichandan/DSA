class Solution {
    public int climbStairs(int n) {
        
      if (n<=1) {
            return 1;
        }
        int s1 = 1;
        int s2 = 2;
        for (int i = 3; i <= n; i++) {
            int s3 = s1 + s2;
            s1 = s2;
            s2 = s3;
        }
        return s2;
    }
}