class Solution {
    public int minBitFlips(int start, int goal) {
        int bitflip=start^goal;
        return Integer.bitCount(bitflip);
        
    }
}