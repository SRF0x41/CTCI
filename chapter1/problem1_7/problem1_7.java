
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class problem1_7 {

    public static void main(String[] args) throws IOException {
        /*Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
        bytes, write a method to rotate the image by 90 degrees. Can you do this in place? */

        // if(args.length < 2){
        //     System.out.println("Not enought arguments");
        //     return;
        // }

        // BufferedImage image;
        // int min;
        // try {
        //     image = ImageIO.read(new File(args[0]));
        //     int height = image.getHeight();
        //     int width = image.getWidth();
        //     min = Math.min(height, width);
        //     image = image.getSubimage(0, 0, min,min);
        // } catch (Exception e) {
        //     System.out.println("Inavlid image ");
        //     return;
        // }

        // // single dimmension byte array
    
        // byte[] pixels = ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
        // byte[][] pixel_matrix = new byte[min][min];

        // for(int row = 0; row < min; row++){
        //     for(int col = 0; col < min; col++){
        //         pixel_matrix[row][col] = pixels[(row*min) + col];
        //     }
        // }



        // /*  1234
        //  *  5678
        //  *  
        //  *  51
        //  *  62
        //  *  73
        //  *  84
        //  */

        


    }



    public static void problem1_7_BF(byte[][] matrix){

    }

    public static int[][] transposeMatrix(int[][] matrix){

    }

    public static BufferedImage MatrixToImage(byte[][] matrix){
        int x = matrix.length;
        byte[] raw_bytes = new byte[x*x];
        for(int i = 0; i < x*x; i++){
            raw_bytes[i] = matrix[i / x][i];
        }
        BufferedImage image = null;
        try {
            ByteArrayInputStream bim = new ByteArrayInputStream(raw_bytes);
            image = ImageIO.read(bim);
            bim.close();
        } catch (Exception e) {
        }
        
        
        return image;
    }
}
