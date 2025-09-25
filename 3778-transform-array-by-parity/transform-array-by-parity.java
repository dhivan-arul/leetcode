class Solution {
    public int[] transformArray(int[] nums) {
        int even=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]%2)==0){
                nums[even]=0;
                even++;
            }
            if(i==nums.length-1){
                while(even<nums.length){
                    nums[even]=1;
                    even++;
                }
            }
        } return nums; 
    }
}