class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
          Set<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            set2.add(i);
        }
        //Removed Duplicates using Hashset
        Set<Integer> Main_Set = new HashSet<>();
        for (Integer var : set1) {
            if (set2.contains(var)) {
                Main_Set.add(var);
            }
        }
        int[] arr = new int[Main_Set.size()];
        int j = 0;
        for (Integer val : Main_Set) {
            arr[j] = val.intValue();
            j++;
        }
        return arr;
    }
}