class NumMatrix {
 int a[][];
    public NumMatrix(int[][] m) {
        
        int k=m.length,p=m[0].length;
        a=new int[k+1][p+1];
        for(int i=1;i<=k;i++)
        {
            for(int j=1;j<=p;j++)
            {
                a[i][j]=m[i-1][j-1]+a[i-1][j]+a[i][j-1]-a[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int r1, int c1, int r2, int c2) {
        
         return a[r2+1][c2+1]+a[r1][c1]-a[r2+1][c1]-a[r1][c2+1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */