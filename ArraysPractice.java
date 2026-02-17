import java.util.Scanner;
import java.util.Arrays; // it use Arrays.toString() to print the entire array in one line.
//Arrays.toString() works only for one-dimensional arrays.
// for multidimensional use Arrays.deepToString().
public class ArraysPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int marks[] = new int[size];//{4, 3, 5, 7, 6, 56, 45}; 
        // In Java, square brackets are used for type declaration,
        // while curly braces are used for array initialization.(allocation)
        System.out.println("the size of the array is: "+ marks.length);
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<marks.length; i++){
            marks[i] = sc.nextInt();
        }

        System.out.println("Print arrays element using for loop and elements are: ");
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        System.out.println("Print arrays element using for each loop and elements are: ");
        for(int element: marks){
            System.out.println(element);
        }
        System.out.println("Print Arrays element in reverse order: ");
        for(int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }

        System.out.println(marks); // it prints only memory reference of array  while ArrayList prints entire elements in one line.
        
        System.out.println(Arrays.toString(marks));
        
        /*marks[0] = 100;
        marks[1] = 13;
        marks[2] = 8;
        marks[3] = 26;
        System.out.println(marks[4]);
        System.out.println(marks[3]);
        System.out.println(marks[5]);
        System.out.println(marks[7]);
        System.out.println(marks[45]);
        System.out.println(marks);*/

        sc.close();
    }
}
