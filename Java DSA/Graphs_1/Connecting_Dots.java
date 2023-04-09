package Graphs_1;

public class Connecting_Dots {
    int solve(String[] board , int n, int m)
    {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        char [][]arr = new char[n][m];
        for(int i = 0;i < n; i ++){
            for(int j = 0; j < m; j++){
                arr[i][j]  = board[i].charAt(j);
            }
        }
        return solve(arr, n, m);
    }
    int l=0;
    void solve1(char b[][],int n, int m,int i,int j,char c,int t,int[][]d)
    {
        if (i<0||i>=n||j<0||j>=m) return ;

        if (b[i][j]!=c) return ;

        if (d[i][j]!=0) { if (d[i][j]-t+1>=4) l++; return ;    }
        if (l>0) return ;
        t++;
        d[i][j]=t;
        solve1(b,n,m,i+1,j,c,t,d);
        solve1(b,n,m,i,j+1,c,t,d);
        solve1(b,n,m,i-1,j,c,t,d);
        solve1(b,n,m,i,j-1,c,t,d);
    }


    int solve(char b[][],int n, int m)
    {
        int d[][]=new int[n][m];
        for (int i=0;i<n;i++){
            // d[i]=new int[m];
            for (int j=0;j<m;j++)
                d[i][j]=0;
        }

        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m&&l==0;j++)
            {
                if (d[i][j]==0)
                    solve1(b,n,m,i,j,b[i][j],0,d);
                if (l>0) break;
            }
        }
        if (l>0) return 1; else return 0;
    }
}
