class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int d=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                d++;
            }
            else{
             max=Math.max(max,d);
                d=0;
            }
        }
        max=Math.max(d,max);
        return  max;
    }
}