class Solution {
public:
    void sortColors(vector<int>& nums) {
      
        int n=nums.size();
        int i=0,j=n-1,ind=0;
        
        
        while(ind<=j){
            if(nums[ind]==0){
                swap(nums[ind],nums[i]);
                i++;
                ind++;
            }
            else if(nums[ind]==2){
                swap(nums[ind],nums[j]);
                j--;
            }
            else{
            ind++;}
        }
    }
};