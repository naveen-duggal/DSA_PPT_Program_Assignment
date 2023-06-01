package in.ineuron;

public class TransposeMatrix {
	 public static int[][] transpose(int[][] matrix) {
	        int rows = matrix.length;
	        int columns = matrix[0].length;

	        int[][] transposeMatrix = new int[columns][rows];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                transposeMatrix[j][i] = matrix[i][j];
	            }
	        }

	        return transposeMatrix;
	    }

	    public static void main(String[] args) {
	        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	        int[][] transposeMatrix = transpose(matrix);

	        System.out.println("Transpose of the matrix:");
	        for (int[] row : transposeMatrix) {
	            for (int element : row) {
	                System.out.print(element + " ");
	            }
	            System.out.println();
	        }
	    }
	}


// This code is contributed by Naveen Duggal..
