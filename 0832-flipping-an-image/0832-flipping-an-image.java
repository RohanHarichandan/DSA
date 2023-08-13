class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
     
        
        
        int m=image.length;
        int n=image[0].length;
        
        for(int i=0;i<m;i++){
            int x=0;
            int y=n-1;
            for(int j=0;j<n;j++){
                if(image[i][j]==1){
                    image[i][j]=0;
                }
                else{
                    image[i][j]=1;
                }
            }
            
            while(x<=y){
               
                int temp=image[i][x];
                 image[i][x]=image[i][y];
                image[i][y]=temp;
                x++;
                y--;
            }
        }
        
        
        
        return image;
    }
}