import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger nums1=new BigInteger(num1);
         BigInteger nums2=new BigInteger(num2);
          BigInteger sum=nums1.add(nums2);
          return sum.toString();   
    }
}