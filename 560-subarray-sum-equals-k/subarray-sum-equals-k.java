class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int max=0;
            for(int j=i;j<n;j++){
                max=max+nums[j];
                if(max==k)sum++;
            }
        }
        return sum;
    }
}