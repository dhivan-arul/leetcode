class Solution {
    public int pivotIndex(int[] nums) {
        int tosum=0;
        for(int num:nums){
            tosum+=num;
        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            int rightsum=tosum-leftsum-nums[i];
            if(leftsum == rightsum){
                return i;
            }
            leftsum+=nums[i];
        }return -1;
    }
}