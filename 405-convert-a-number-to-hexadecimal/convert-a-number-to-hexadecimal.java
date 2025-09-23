class Solution {
   public String toHex(int num) {
    if (num == 0) return "0";
    String hex = "";
    while (num != 0) { hex = "0123456789abcdef".charAt(num & 15) + hex; num >>>= 4; }
    return hex;
}
}
