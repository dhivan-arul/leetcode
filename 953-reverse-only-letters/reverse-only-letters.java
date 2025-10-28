class Solution {
    public String reverseOnlyLetters(String s) {
        char []arr=s.toCharArray();
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(Character.isLetter(arr[i])){
                while(j>=0 && !Character.isLetter(arr[j])){
                    j--;
                }
                if(j>=0){
                    arr[i]=s.charAt(j);
                    j--;   
                 }
            }
        } 
        return new String(arr);
    }
}