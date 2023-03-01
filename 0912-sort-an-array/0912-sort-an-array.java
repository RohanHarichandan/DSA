class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        
        return nums;
    }
    
    static void mergesort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int mid=(high+low)/2;
        
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void merge(int arr[],int low,int mid,int high){
       
        int i=low;
        int j=mid+1;
        int k=0;
        int []c=new int [high-low+1];
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                c[k]=arr[i];
                k++;
                i++;
            }
            else{
                c[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            c[k]=arr[i];
            i++;
            k++;
        }
        while(j<=high){
            c[k]=arr[j];
            j++;
            k++;
        }
        for(int p=0;p<k;p++){
            arr[p+low]=c[p];
        }
    }
}