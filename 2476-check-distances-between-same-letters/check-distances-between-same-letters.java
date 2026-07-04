class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int n=ch-'a';
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(j)==ch){
                    int gap=j-i-1;
                    if(gap!=distance[n]){
                        return false;
                    }
                    break;
                }
            }
        }
        return true;
    }
}