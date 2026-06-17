class Solution {
    public int passThePillow(int n, int time) {
        int person=1;
        int dir=1;
        for(int i=0;i<time;i++){
             person+=dir;
             if(person==n){
                dir=-1;
             }
             else if(person==1){
                 dir=1;
             }
        }
        return person;
    }
}