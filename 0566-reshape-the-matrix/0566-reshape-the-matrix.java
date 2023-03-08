class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int rows = mat.length, cols = mat[0].length;
        if((r == rows && c == cols) || (rows * cols != r * c)) {
            return mat;
            }

        int newMat [][] = new int [r][c], rIndex = 0, cIndex = 0;

        for(int row = 0; row < rows; row++) {
        for(int col = 0; col < cols; col++) {
        if(cIndex == c) {
            rIndex++;
            cIndex = 0;
        }

        newMat[rIndex][cIndex++] = mat[row][col];
    }
}
return newMat;
    }
}