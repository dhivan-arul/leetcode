class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int t=0;
        for(int i=0;i<=nums.length-1;i++){
            if(n%(i+1)==0){
            t+=nums[i]*nums[i];
        }
        }
        return t;
    }
}