
import java.util.ArrayList;


public class problem1_8 {

    public static void main(String[] args) {
        /*Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
        column are set to 0. */
        int[][] m = generateMatrix();
        System.out.println("Before ");
        printMatrix(m);
        problem1_8_BF(m);
        System.out.println("After");
        printMatrix(m);
    }

    public static void problem1_8_BF(int[][] m) {
        ArrayList<Integer[]> zeros = new ArrayList<>();
        int rows = m.length;
        int cols = m[0].length;

        // recording zeros
        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                if(m[row][col] == 0){
                    Integer[] zero = {row,col};
                    zeros.add(zero);
                }
            }
        }

        // overwritting zeros
        // overwritting rows
        for(Integer[] point: zeros){
            for(int i = 0; i < cols; i++){
                m[point[0]][i] = 0;
            }
        }
        // Overwritting cols
        for(Integer[] point: zeros){
            for(int i = 0; i < rows; i++){
                m[i][point[1]] = 0;
            }
        }
    }

    public static int[][] generateMatrix() {
        int min = 3; // Minimum value (inclusive)
        int max = 8; // Maximum value (inclusive)
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

    public static void printMatrix(int[][] m){
        String RED = "\u001B[31m";
        String RESET = "\u001B[0m"; 
        int rows = m.length;
        int cols = m[0].length;

        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                if(m[row][col] == 0){
                    System.out.print(RED + '0' + RESET);
                }
                else{
                    System.out.print(m[row][col]);
                }
            }
            System.out.println("");
        }
    }
}
