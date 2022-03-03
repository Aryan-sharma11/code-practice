class Solution {
    public int coinChange(int[] coins, int amount) 
    {
        int []dp=new int[amount+1];
    Arrays.fill(dp,Integer.MAX_VALUE);
  dp[0]=0;
    for(int i=1;i<=amount;i++)
    {
        for(int j=0;j<coins.length;j++)
        {
           
            if((i-coins[j])>=0)
            {
                 int x;
                 x=dp[i-coins[j]];
                 if(x+1<dp[i]&&x+1>0)
                 dp[i]=x+1;
                  
             }
            
        }
        if(dp[i]+1<0)
            dp[i]=-1;
        
    }
    
	   return dp[amount];         
	    
        
    }
}
