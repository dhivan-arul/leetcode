class Solution {
    public boolean isBalanced(String num) {
        char ch[]=num.toCharArray();
       int sd=0;
       int sk=0;
       for(int i=0;i<num.length();i+=2 ){
                sd+=ch[i]-'0';
         }
         for(int i=1;i<num.length();i+=2){
          
               sk+=ch[i]-'0';
         }
         if(sd==sk){
            return true;
         }
         return false;
    }
}