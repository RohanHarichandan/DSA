class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> dp = new ArrayList<List<Integer>>();
        ArrayList<Integer> sp = new ArrayList<Integer>();
        sp.add(1);
        dp.add(sp);
        if(numRows == 1){
            return dp;
        }
        ArrayList<Integer> sp2 = new ArrayList<Integer>();
        sp2.add(1);
        sp2.add(1);
        dp.add(sp2);
        for(int i = 2; i < numRows; i++){
            ArrayList<Integer> sp3 = new ArrayList<Integer>();
            sp3.add(1);
            List<Integer> use = dp.get(i-1);
            int p1 = 0;
            int p2 = 1;
            while(p2 < use.size()){
                int sum = use.get(p1)+use.get(p2);
                sp3.add(sum);
                p1++;
                p2++;
            }
            sp3.add(1);
            dp.add(sp3);
        }
        return dp;
    }
}