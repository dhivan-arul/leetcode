class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int sc1=0;
        int sc2=0;
        for(int i=0;i<player1.length;i++){
            if((i>0 && player1[i-1]==10)||(i>1&&player1[i-2]==10)){
                sc1+=player1[i]*2;
            }
            else{
                sc1+=player1[i];
            }
        }
        for(int i=0;i<player2.length;i++){
         if((i>0 && player2[i-1]==10)||(i>1&&player2[i-2]==10)){
           sc2+=player2[i]*2;
        }
        else{
            sc2+=player2[i];
        }                                                                                             }
        if(sc1>sc2){return 1;}
        else if(sc2>sc1){return 2;}
        else{return 0;}
    }
}
