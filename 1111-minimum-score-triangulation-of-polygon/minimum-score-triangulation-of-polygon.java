class Solution {
    public int minScoreTriangulation(int[] values) {
        int n=values.length;
        int [][] dp=new int[n][n];
        for(int l=3;l<=n;l++){
            for(int i=0;i+l-1<n;i++){
                int j=i+l-1;
                int d=Integer.MAX_VALUE;
                for(int k=i+1;k<j;k++){
                    int cost=dp[i][k]+dp[k][j]+values[i]*values[k]*values[j];
                    if(cost<d)d=cost;
                    }
            dp[i][j]=d;
        }
        }
        return n==0?0:dp[0][n-1];
    }
}