 public static int traverse(int m,int n,int[][] dp,int i,int j){
		if(i>=m || j>=n)	return 0;
		if(i==m-1 && j==n-1)	return 1;
		if(dp[i][j]!=0)	return dp[i][j];
		int rgt=traverse(m, n, dp, i, j+1);
		int down=traverse(m, n, dp, i+1, j);
		return dp[i][j]=(rgt+down);
	}
	
public int uniquePaths(int m, int n) {
        int[][] dp=new int[m+1][n+1];				
	return traverse(m,n,dp,0,0);		
    }
