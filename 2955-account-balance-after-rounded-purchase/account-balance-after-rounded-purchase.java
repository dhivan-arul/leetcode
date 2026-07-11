class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int st=purchaseAmount+5;
        st=st/10; 
        st*=10;
        return 100-st;
    }
}