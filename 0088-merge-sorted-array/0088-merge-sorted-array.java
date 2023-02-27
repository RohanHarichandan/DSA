class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        
        int i=0;
        int j=0;
        int k=0;
        int c[]=new int[m+n];
        
      while(i<m && j<n){
          if(a[i]<b[j]){
              c[k++]=a[i++];       
          }
          else{
              c[k++]=b[j++];
          }
      }
        for(;i<m;i++){
            c[k++]=a[i];
            
        }
        for(;j<n;j++){
            c[k++]=b[j];
            
        }
       for(int x=0;x<m+n;x++){
           a[x]=c[x];
       }
    }
}