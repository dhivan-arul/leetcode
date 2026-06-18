class Solution {
    public boolean isPowerOfThree(int n) {
      //  return n>0 && 1162261467%n==0;
      if(n<=0){
        return false;
      }
      long power=1;
      while(power<n){
        power=power*3;
      }
      return power==n;
    }
}