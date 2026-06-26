class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
      for(int num:nums ){
        int st=0;
        while(num>0){
            st+=num%10;
          ;
              num/=10;
      }
             
             if(st<min){
        min=st;
             } 
              }
       return min;
    }
}