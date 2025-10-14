


public class problem1_7 {

    public static void main(String[] args) {
        /*Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
        bytes, write a method to rotate the image by 90 degrees. Can you do this in place? */

    }


    public static int[][] generateMatrix() {
        int min = 3; // Minimum value (inclusive)
        int max = 3; // Maximum value (inclusive)
        int randRow = (int) (Math.random() * (max - min + 1) + min);
        int randCol = (int) (Math.random() * (max - min + 1) + min);
        int[][] m = new int[randRow][randCol];
        for(int row = 0; row < randRow; row++){
            for(int col = 0; col < randCol; col++){
                int rand = (int) (Math.random() * 10);
                m[row][col] = rand;
            }
        }
        return m;
    }
    public static void problem1_7_BF(byte[][] matrix){

    }

    public static void printMatrix(int[][] m){
        String RED = "\u001B[31m";
        String RESET = "\u001B[0m"; 
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
