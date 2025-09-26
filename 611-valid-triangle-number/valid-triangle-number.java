class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int c=0;
        for(int i=n-1;i>=0;i--){
        int left =0;
        int right =i-1;
        while(left<right){
            if(nums[left]+nums[right]>nums[i]){
                c+=right-left;
                right--;  
            }
            else{
                left++;
            }
        }
    }return c;  
    }
}