class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int k=0;
        for(int i=1;i<=n;i++){
            char ch=s.charAt(i-1);
            int diff=123-ch;
            k+=diff*i;
        }
        return k;
        
    }
}