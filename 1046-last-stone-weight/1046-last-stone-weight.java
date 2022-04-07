class Solution {
    public int lastStoneWeight(int[] stones) {
       
        
     PriorityQueue<Integer> pq=new PriorityQueue<Integer>((a,b)->(b-a));
        
        for(int stone:stones){
        pq.offer(stone);
        }
        
        while(pq.size()>1){
            int largestEl=pq.poll();
            int secondLargestEl=pq.poll();
            if(largestEl==secondLargestEl){
                continue;
            }
            else{
                int diff=largestEl-secondLargestEl;
                pq.offer(diff);
            }
        }
        return pq.size()==0 ? 0: pq.poll();
    }
}