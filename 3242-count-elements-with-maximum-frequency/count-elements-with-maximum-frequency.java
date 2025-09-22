class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freq[]=new int[101];
        int max=0;
        for(int n:nums){
            freq[n]++;
            max =Math.max(max,freq[n]); 
        }
        int a=0;
        for(int f:freq){
            if(f==max){
                a+=max;
            }
        }
        return a;
        
    }
}