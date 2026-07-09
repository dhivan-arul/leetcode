class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max=0;
        int min=1;
        Arrays.sort(nums);
        if(nums.length<=2){
            return -1;
        }
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        
        return nums[i+1];
        }
        return 0;
    }
}