class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        
        int n=names.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(heights[i]<heights[j]){
                    int temp=heights[i];
                    heights[i]=heights[j];
                    heights[j]=temp;
                    
                    String tmp=names[i];
                    names[i]=names[j];
                    names[j]=tmp;
                }
            }
        }
        return names;
    }
}