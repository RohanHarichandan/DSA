class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
         int i = 0;
  while (i < flowerbed.length&&n!=0) {
    
      if (flowerbed[i]==1){
          i+=2;
          continue;
      }
      
      if (((i==0&&flowerbed[0]==0)||flowerbed[i-1]==0)&&((i==flowerbed.length-1&&flowerbed[i]==0)||flowerbed[i+1]==0)){
          n--;
          i+=1;
      }
      i++;

  }
  return n==0;
    }
}