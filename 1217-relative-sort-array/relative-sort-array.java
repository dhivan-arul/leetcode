class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        int sd[]=new int[arr1.length];
        int k=0;
        // int nd=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    sd[k]=arr1[j];
                    k++;
                }
            }
        }
       for(int i=0;i<arr1.length;i++){
        int c=0;
        for(int j=0;j<arr2.length;j++){
              if(arr1[i]==arr2[j]){
                c++;
              }
        }
        if(c==0){
            sd[k]=arr1[i];
            k++;
        }
       }
        return sd;
    }
}