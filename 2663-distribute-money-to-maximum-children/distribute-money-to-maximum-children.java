class Solution {
    public int distMoney(int money, int children) {
        int e=0;
        if(children>money){
          return -1;
        }
        else if(money==children){
            return 0;
        }
         money = money - children;
             int st = money / 7;
                  if (st > children) {
                 st = children;
              }
              money = money - (st * 7);
              children = children - st;
           if (children == 0 && money > 0) {
                  st--;
             } 
             else if (children == 1 && money == 3) {
                 st--;
                   }
                     
        return st;
    }
}
