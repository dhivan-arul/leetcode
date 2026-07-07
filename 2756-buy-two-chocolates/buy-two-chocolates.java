class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int st=0;
        int must=0;
        for(int i=0;i<prices.length;i++){
            st+=prices[i];
            must++;
            st=Math.abs(st);
            if(must==2){
            if(st<=money){
               return money-st;
            }
            else {
                return money;
            }
            }
        }
       return money;
    }
}