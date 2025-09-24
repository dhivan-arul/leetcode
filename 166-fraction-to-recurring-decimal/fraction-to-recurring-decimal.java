import java.util.HashMap;

class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        result.append(num / den);
        long rem = num % den; 
        if (rem == 0) {
            return result.toString(); // No fractional part
        }
        result.append(".");
        HashMap<Long, Integer> map = new HashMap<>();
        while (rem != 0) {
            if (map.containsKey(rem)) {
                result.insert(map.get(rem), "(");
                result.append(")");
                break;
            }
            map.put(rem, result.length());
            rem *= 10;
            result.append(rem / den);
            rem %= den;
        }
        return result.toString();
    }
}
