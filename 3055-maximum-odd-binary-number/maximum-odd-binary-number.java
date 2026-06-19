class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one=0;
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                one++;
            }
        }
        int zero=s.length()-one;
        StringBuilder d=new StringBuilder();
        for(int i=0;i<one-1;i++){
              d.append('1');
        }
        for(int i=0;i<zero;i++){
            d.append('0');
        }
        d.append('1');
        return d.toString();
    }
}