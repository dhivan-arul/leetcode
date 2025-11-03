class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
           int greateridx=-1,j=nums2.length-1;
           while(j>=0 &&nums2[j]!=nums1[i]){
            if(nums2[j]>nums1[i]){
                greateridx=nums2[j];
            }
            j--;
           }
           arr[i]=greateridx;
        }
        return arr;
    }
}