class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return false;
        }

        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                if (mat[row][col] == x) {
                    return true;
                }
            }
        }

        return false;
    }
}