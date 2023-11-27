// Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4 
//                bytes, write a method to rotate the image by 90 degrees. Can you do this in place? 

// Need to learn 27 Nov 23

public class One_Seven_RotateMatrix
{
	public static void main(String[] args) {
		int matrix [] [] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Original matrix");
		printMatrix(matrix);
		System.out.println("Rotated matrix");
	    bestApproachToRotate(matrix);
	}
	static void printMatrix(int [][] matrix){
		for(int i=0; i<matrix.length; i++){
		    for(int j=0; j<matrix[i].length; j++){
		        System.out.print(matrix[i][j]+" ");
		    }
		    System.out.println();
		}	    
	}
	static void transposeMatrix(int [][] matrix){
	    int rows = matrix.length;
	    int columns = matrix[0].length;
	    int transposeMatrix [][] = new int [columns][rows];
	    for(int i=0; i<columns; i++){
	        for(int j=0; j<rows; j++){
	            transposeMatrix[j][i] = matrix[i][j];
	        }
	    }
	    printMatrix(transposeMatrix);
	    System.out.println("Rotated matrix");
	    rotatedMatrix(transposeMatrix, rows, columns);
	}
	static void rotatedMatrix(int [][] matrix, int rows, int columns){
	    int rotateM [][] = new int[columns][rows];
	    for(int i=0; i<columns; i++){
	        for(int j=0; j<rows; j++){
	            rotateM[i][j] = matrix[i][rows - 1 - j];
	        }
	    }
	    printMatrix(rotateM);
	}
	static void bestApproachToRotate(int [][] matrix){
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                // left -> top
                matrix[first][i] = matrix[last - offset][first];
                // bottom -> left
                matrix[last - offset][first] = matrix[last][last - offset];
                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];
                // top -> right
                matrix[i][last] = top;
            }
        }
        printMatrix(matrix);
	}
}
