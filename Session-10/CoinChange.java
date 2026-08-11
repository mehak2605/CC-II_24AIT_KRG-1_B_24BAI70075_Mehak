class Solution {
    public int solve(int coins[], int i, int amount, int dp[][])
    {
        if(amount==0)
        return 0;
        if(amount<0 || i>=coins.length)
        return Integer.MAX_VALUE;

        if(dp[i][amount]!=-1)
        return dp[i][amount];

        int notpick=solve(coins, i+1, amount, dp);
        int pick=Integer.MAX_VALUE;
        if(coins[i]<=amount)
        {    
            int res=solve(coins, i, amount-coins[i], dp);
            if(res!=Integer.MAX_VALUE)
            pick=1+res;
        }
        return dp[i][amount]=Math.min(notpick, pick);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n+1][amount+1];
        for(int row[]: dp)
        {
            Arrays.fill(row, -1);
        }
        int ans=solve(coins, 0, amount, dp);
        return (ans==Integer.MAX_VALUE)?-1:ans;
    }
}