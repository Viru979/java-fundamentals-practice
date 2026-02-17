import java.util.Scanner;
import java.util.Arrays;

// [[12, 13, 14, 15], [24, 43, 55, 65], [67, 54, 56, 66], [97, 95, 75, 70], [85, 83, 48, 51]]

// 23 43 12
// 54 65 78
// 98 95 34
// 12 87 90


public class ArrayPractice2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of cols: ");
        int cols = sc.nextInt();
        int [][] arr = new int[rows][cols];
        System.out.println("Enter matrix elements: ");
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter the number of element in columns " + i + " :");
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Original matrix:");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The transpose of the matrix is:");
        for(int i=0; i<arr[0].length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[j][i]+ " ");
            }
            System.out.println();
        }
    }
}





/*public class ArrayPractice2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows of matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter the no of cols of matrix: ");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        // int cols;

        // for(int i=0; i<arr.length; i++){
        //     System.out.print("Enter the number elements in row "+ i +" : ");
        //     cols = sc.nextInt();
        //     arr[i] = new int[cols];
        //     System.out.println("Enter the element of row "+ i + " :");
        //     for(int j=0; j<arr[i].length; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int num = 56;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == num){
                    System.out.print("The index of "+ num + " is: "+ i +" , " +j);
                }
            }
        }
    }
}







/*public class ArrayPractice2 {
    public static void main(String args[]){
        int arr[] = {23,45,65,12,3,56,90,34,23,98,45,76};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Maximum Value of the is: "+ max);
        System.out.println("Minimum Value of the is: "+ min);

    }
}



/*public class ArrayPractice2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter the arrays element: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to find in the array: ");
        int givenNumber = sc.nextInt();
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == givenNumber){
                System.out.print("The first index of the given number is: "+ i);
                break;
            }
        }
    }
}*/
