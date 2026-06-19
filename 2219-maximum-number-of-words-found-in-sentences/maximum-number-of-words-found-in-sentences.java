class Solution {
    public int mostWordsFound(String[] sentences) {
        int co1=0;
        for(String s:sentences){
            int c2=1;
        for(int i=0;i<s.length();i++){
             
             if(s.charAt(i)==' '){
                c2++;
             }
        }
       co1= Math.max(co1,c2);
    }
    return co1;
    }
}