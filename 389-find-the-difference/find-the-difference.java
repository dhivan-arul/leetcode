class Solution {
    public char findTheDifference(String s, String t) {
        for(int i=0;i<t.length();i++){
            int cot=0;
            int cos =0;
            for(int j=0;j<t.length();j++){
                if(t.charAt(i)==t.charAt(j)){
                    cot++;
                }
            }
                for(int j=0;j<s.length();j++){
                    if(t.charAt(i)==s.charAt(j)){
                        cos++;
                    }
                }
            
            if(cot>cos){
                return t.charAt(i);
            }
        }
        return ' ';
    }
}