class Solution {
    public String reverseWords(String s) {
        String[] wo=s.split(" ");
        StringBuilder sd=new StringBuilder();
        for( String wd:wo){
            sd.append(new StringBuilder(wd).reverse()).append(" ");
        }
            return sd.toString().trim();  
    }
}