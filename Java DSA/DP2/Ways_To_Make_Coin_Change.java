package DP2;

public class Ways_To_Make_Coin_Change {
    public static int countWaysToMakeChange(int denominations[], int value){
        int[] dp = new int[value+1];
        dp[0]=1;
        for (int i=0;i<denominations.length;i++)
        {
            for (int j=0;j<=value;j++)
            {
                if (j>=denominations[i])
                {
                    dp[j]=dp[j]+dp[j-denominations[i]];
                }
            }
        }
        return dp[value];

    }


}
