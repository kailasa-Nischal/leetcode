class Solution {
    
  
	public int change(int amount, int[] coins) {
       int[][] dp=new int[coins.length][amount+1];
		//dp --> bottom up
        for (int i = 0; i < coins.length; i++)	dp[i][0] = 1;
        
        for (int i = coins.length-1; i>=0; i--) {
          for (int j = 1; j<=amount; j++) {
            if((j-coins[i])>=0 && (i+1)>coins.length-1)	dp[i][j]=dp[i][j-coins[i]];
            else if((j-coins[i])<0 && (i+1)<=coins.length-1)	dp[i][j]=dp[i+1][j];
            else if((j-coins[i])>=0 && (i + 1)<=coins.length-1)	dp[i][j]=dp[i][j-coins[i]]+dp[i+1][j];
          }
        }
        
        // for(int i=0;i<coins.length;i++){
        //   for(int j=0;j<amount+1;j++){
        //     System.out.println(dp[i][j]+" "+i+" "+j);
        //   }
        // }
    
        return dp[0][amount];
    }
}
