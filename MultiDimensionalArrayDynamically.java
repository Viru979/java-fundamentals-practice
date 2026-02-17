import java.util.Scanner;
import java.util.Arrays;  //for multidimensional use Arrays.deepToString().
// Arrays.toString() prints only one-dimensional arrays correctly.
// For multidimensional arrays, we must use Arrays.deepToString()
// because Java represents them as arrays of arrays.

public class MultiDimensionalArrayDynamically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        int flats[][] = new int[rows][];
        for(int i=0; i<flats.length; i++){
            System.out.print("Enter the number of element in row " + i + " :");
            int cols = sc.nextInt();
            flats[i] = new int[cols];

            System.out.println("Enter the elements for row " + i + " :");
            for(int j=0; j<flats[i].length; j++){
                flats[i][j] = sc.nextInt();
            }

        }
        System.out.println(Arrays.deepToString(flats));
        for(int i=0; i<flats.length; i++){
            for(int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j] +" ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
