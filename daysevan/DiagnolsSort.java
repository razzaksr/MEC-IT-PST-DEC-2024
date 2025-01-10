package daysevan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DiagnolsSort {
    public static void main(String[] args) {
        int[][] mat1 = {
            {3, 3, 1, 1},
            {2, 2, 1, 2},
            {1, 1, 1, 2}
        };
        int[][] result1 = diagonalSort(mat1);
        for(int[] row:result1){System.out.println(Arrays.toString(row));}

        int[][] mat2 = {
            {11, 25, 66, 1, 69, 7},
            {23, 55, 17, 45, 15, 52},
            {75, 31, 36, 44, 58, 8},
            {22, 27, 33, 25, 68, 4},
            {84, 28, 14, 11, 5, 50}
        };
        int[][] result2 = diagonalSort(mat2);
        for(int[] row:result2){System.out.println(Arrays.toString(row));}
    }

    public static int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        // Sort diagonals starting from the first row
        for(int row=0;row<m;row++){
            for (int col = 0; col < n; col++) {
                sortDiagonal(mat, row, col);
            }
        }
        // Sort diagonals starting from the first column
        // for (int row = 1; row < m; row++) {
        //     sortDiagonal(mat, row, 0);
        // }
        return mat;
    }

    private static void sortDiagonal(int[][] mat, int row, int col) {
        int m = mat.length;
        int n = mat[0].length;
        List<Integer> diagonal = new ArrayList<>();

        int r = row, c = col;
        // Collect the diagonal elements
        while (r < m && c < n) {
            diagonal.add(mat[r][c]);
            r++;
            c++;
        }

        // Sort the diagonal elements
        Collections.sort(diagonal);

        // Place the sorted elements back in the matrix
        r = row;
        c = col;
        int index = 0;
        while (r < m && c < n) {
            mat[r][c] = diagonal.get(index++);
            r++;
            c++;
        }
    }
}
