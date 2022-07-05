public static int funcCoin(int amt,int[] coins,int[] dp){
		if(amt<0)	return -1;
		if(amt==0)	return 0;
		if(dp[amt]!=-2)	return dp[amt];	
		int ans=Integer.MAX_VALUE;
		for (int i = 0; i < coins.length; i++) {
			int curr=1+funcCoin(amt-coins[i], coins,dp);
			if(curr>0)  ans=(int)Math.min(ans,curr);
		}
		if(ans!=Integer.MAX_VALUE)  return dp[amt]=ans;
    	return -1;
	}
	public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
		Arrays.fill(dp,-2);
        return funcCoin(amount,coins,dp);
    }
