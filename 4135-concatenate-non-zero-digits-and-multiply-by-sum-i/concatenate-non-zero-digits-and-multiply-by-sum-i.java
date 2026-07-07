class Solution {
    public long sumAndMultiply(int n) {
        String s=Integer.toString(n);
        String d="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                d+=s.charAt(i);
            }
        }
        if(d.isEmpty()){
            return 0;
        }
        int st=0;
        for(int i=0;i<d.length();i++){
            st+=d.charAt(i)-'0';
        } 
        int m=Integer.parseInt(d);
        return(long) m*st;
           }
}