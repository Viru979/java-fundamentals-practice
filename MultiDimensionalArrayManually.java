import java.util.Scanner;
import java.util.Arrays;  //for multidimensional use Arrays.deepToString().
// A 2D array stores data in rows and columns.
// It is useful for representing tables or matrices.
// In Java, it is implemented as an array of arrays

public class MultiDimensionalArrayManually {
    public static void main(String[] args){
        //int flats[][] = {{101, 102}, {201,202,203, 204}, {301, 303, 305}};  irregular 2-D array.
        // {{001, 002, 003}, {101, 102, 103}, {201, 202, 203}, {301, 302, 303}, {401, 402, 403}}; regular 2-D array
        int flats[][] = new int[5][];
        
        flats[0] = new int[2];
        flats[1] = new int[3];
        flats[2] = new int[7];
        flats[3] = new int[1];
        flats[4] = new int[5];
        
        flats[0][0] = 001;
        flats[0][1] = 002;

        flats[1][0] = 101;
        flats[1][1] = 102;
        flats[1][2] = 103;

        flats[2][0] = 201;
        flats[2][1] = 202;
        flats[2][2] = 203;
        flats[2][3] = 206;
        flats[2][4] = 223;
        flats[2][5] = 245;
        flats[2][6] = 211;

        flats[3][0] = 301;

        flats[4][0] = 401;
        flats[4][1] = 442;
        flats[4][2] = 453;
        flats[4][3] = 402;
        flats[4][4] = 467;

        //System.out.print(Arrays.toString(flats));// not works
        System.out.print(Arrays.deepToString(flats));

        for(int i=0; i<flats.length; i++){
            for(int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
