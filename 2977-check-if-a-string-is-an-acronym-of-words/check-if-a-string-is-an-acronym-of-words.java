class Solution {
    public boolean isAcronym(List<String> words, String s) {
        ArrayList<String>list=new ArrayList();
        for(String wd:words){
            list.add(wd);
        }
        String d="";
        for(int i=0;i<list.size();i++){
            d+=words.get(i).charAt(0);
        }
        if(d.equals(s)){
            return true; 
        }
        else{
            return false;
        }
            }
}