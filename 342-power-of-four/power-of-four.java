class Solution {
    public boolean isPowerOfFour(int n) {
      if(n<=0){
        return false;
      } 
      long power=1;
    while(  power<n) {
       power=power*4;
    } 
    return power==n;
    }
}