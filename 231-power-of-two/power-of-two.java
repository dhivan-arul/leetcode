class Solution {
    public boolean isPowerOfTwo(int n) {
        //return n>0 &&(n&(n-1))==0;
        if(n<=0){
            return false;
        }
        long power=1;
        while(power<n){
            power=power*2;
        }
        return power==n;
    }
}