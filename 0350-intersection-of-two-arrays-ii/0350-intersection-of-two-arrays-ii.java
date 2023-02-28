class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
       HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        ArrayList<Integer> ans = new ArrayList<>();
          
            
            for(int i:nums1){
                if(map.containsKey(i)){
                    map.put(i, map.get(i)+1);
                }
                else{
                    map.put(i,1);
                }
            }
            
            for(int i:nums2){
                if(map.containsKey(i)&&map.get(i)>0){
                map.put(i, map.get(i) - 1);
                     ans.add(i);
                       
                }
            }
        
        
        int [] arr = new int[ans.size()];

        for(int i=0;i<arr.length;i++){
            arr[i]= ans.get(i);
        }
     
        return arr;
    }
}