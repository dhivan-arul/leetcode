class Solution {
    public int[] countBits(int n) {
        int d[]=new int[n+1];
        int count=1;
        for(int i=1;i<=n;i++){
            if(count*2==i){
                count=i;
            }
            d[i]=d[i-count]+1;
        }
         return d;
    }
}