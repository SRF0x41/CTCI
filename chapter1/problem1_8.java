
public class problem1_8 {

    public static void main(String[] args) {
        /*Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
        column are set to 0. */
        int[][] m = generateMatrix();
        printMatrix(m);
    }

    public static int[][] problem1_8_BF(int[][] matrix) {
        return null;
    }

    public static int[][] generateMatrix() {
        int min = 0; // Minimum value (inclusive)
        int max = 6; // Maximum value (inclusive)
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
