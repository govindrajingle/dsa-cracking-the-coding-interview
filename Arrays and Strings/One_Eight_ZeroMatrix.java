// Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and 
// column are set to 0

//just copy and pasted

import java.util.Arrays;

public class One_Eight_ZeroMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}};
        System.out.println("Original Matrix");
        printMatrix(matrix);
        setZeros(matrix);
        System.out.println("Zero Matrix");
        printMatrix(matrix);
    }
    static void setZeros(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean [] zeroRows = new boolean[rows];
        boolean [] zeroCols = new boolean[cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j] == 0){
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }
        // set rows to zero
        for(int i=0; i<rows; i++){
            if(zeroRows[i]){
                Arrays.fill(matrix[i], 0);
            }
        }
        // set cols to zero
        for(int j=0; j<cols; j++){
            if(zeroCols[j]){
                for(int i=0; i<rows; i++){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    static void printMatrix(int [][] matrix){
        for(int[] row : matrix){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
