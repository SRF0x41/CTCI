public class problem1_7 {

    public static void main(String[] args) {
        /*Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
        bytes, write a method to rotate the image by 90 degrees. Can you do this in place? */

        int[][] m = generateMatrix();
        System.out.println("Before");
        printMatrix(m);
        System.out.println("After Brute Force Method");
        printMatrix(problem1_7_BF(m));

    }

    public static int[][] problem1_7_BF(int[][] m){
        int rows = m.length;
        int cols = m[0].length;
        int[][] transposed_m = new int[rows][cols];
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                transposed_m[c][rows - r - 1] = m[r][c];
            }
        }
        return transposed_m;
    }

    public static int[][] generateMatrix() {
        int n = 3;
        int[][] m = new int[n][n];
        for(int r = 0; r < n; r++){
            for(int c = 0; c < n; c++){
                m[r][c] = (int) (Math.random() * 10);
            }
        }
        return m;
    }

    public static void printMatrix(int[][] m){
        int rows = m.length;
        int cols = m[0].length;
        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                    System.out.print(m[row][col]);
            }
            System.out.println("");
        }
    }
    
}
