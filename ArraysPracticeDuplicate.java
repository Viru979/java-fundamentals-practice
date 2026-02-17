import java.util.Scanner;
import java.util.Arrays;


public class ArraysPracticeDuplicate {
    public static void main(String[] args){
        //float arr[] = {5, 3, 8, 12, 53, 65, 2};
        
        
        /*//float arr[] = {5, 8, 12, 53, 65,82};
        //float arr[] = {521, 87, 55, 53, 35,22};
        boolean isDescending = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                isDescending = false;
                break;
            }
        }
        if(isDescending){
            System.out.print("Array is in Descending order.");
        }else{
            System.out.print("Array is not in Descending order.");
        }
        
        
        
        
        /* check array is ascending or not
        boolean isAscending = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]> arr[i+1]){
                isAscending = false;
                break;
            }
        }
        if(isAscending){
            System.out.print("Array is in ascending order.");
        }
        else{
            System.out.print("Array is not in Ascending order.");
        }
        
        
        
        /*
        // cheking sorted array
        boolean isAscending = true;
        boolean isDescending = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]> arr[i+1]){
                isAscending = false;
            }
            if(arr[i]<arr[i+1]){
                isDescending = false;
            }
        }
        if(isAscending || isDescending){
            System.out.print("Array is sorted.");
        }
        else{
            System.out.print("Array is not sorted.");
        }
        
        
        
        
        /*float min = Integer.MAX_VALUE;
        for(float i: arr){
            if(min>i){
                min = i;
            }
        }
        System.out.print("The minimum element of array is: "+ min);
        
        
        
        /*float max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.print("Maximum value of array is: "+ max);


       /* // method first   reverse an array using swapping with third variable
        // For floating-point arrays, XOR swapping is not possible,
        // so using a temporary variable is the correct approach.
        //I used in-place swapping to reverse the array with constant space.
        System.out.println(Arrays.toString(arr));
        int l= arr.length;
        for(int i=0; i<(arr.length)/2; i++){
            float temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
        
        //second method
        // reverse an array using swapping without third variable.
        //This method works without extra space but may cause overflow.
        int l = arr.length;
        for(int i=0; i<(l/2); i++){
            arr[i] = arr[i] + arr[l - i - 1];
            arr[l - i - 1] = arr[i]- arr[l-i-1];
            arr[i] = arr[i] - arr[l-i-1];
        }
        System.out.print(Arrays.toString(arr));

        // third method
        int arr[] = {5, 3, 8, 12, 53, 65, 2}; //Bitwise operators work only on integer and boolean types.
        //XOR swapping avoids extra space and overflow issues.
        int l = arr.length;
        for(int i=0; i<(l/2); i++){
            arr[i] = arr[i] ^ arr[l-i-1];
            arr[l-i-1] = arr[i] ^ arr[l-i-1];
            arr[i] = arr[i] ^ arr[l-i-1];
        }
        System.out.print(Arrays.toString(arr));
        

        /* float sum = 0;
        float avg;
        for(int i=0; i<arr.length; i++){
            sum +=arr[i];
        }
        System.out.print("the average of the array is: " + sum/arr.length);

        /* int num = 12;
        boolean isInArray = false;
        for(int i=0; i<arr.length; i++){
            if(num == arr[i]){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.print("The number is present in the array.");
        }else{
            System.out.print("The number is not present in the array.");
        }
        


        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of array 1: ");
        int rows1 = sc.nextInt();

        System.out.print("Enter the number of rows of array 2: ");
        int rows2 = sc.nextInt();

        float arr1[][] = new float[rows1][];// [[1.0, 2.0, 3.0], [4.0, 5.0, 6.0]] ❌
        float arr2[][] = new float[rows2][]; // {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}} ✅
        
        // loop for first array creation
        for(int i=0; i<arr1.length; i++){
            System.out.print("Enter the number of element in rows "+ i + " for array 1: ");
            int cols1 = sc.nextInt();

            arr1[i] = new float[cols1];
            System.out.println("Enter the element of row "+ i+ " for array 1: ");
            for(int j=0; j<arr1[i].length; j++){
                arr1[i][j] = sc.nextFloat();
            }
        }

        // loop for second array creation
        for(int i=0; i<arr2.length; i++){
            System.out.print("Enter the number of element of rows " + i+ " for array 2: ");
            int cols2 =sc.nextInt();
            arr2[i] =new float[cols2];

            System.out.println("Enter the element of rows "+ i + " for array 2: ");
            for(int j=0; j<arr2[i].length; j++){
                arr2[i][j] = sc.nextFloat();
            }
        }
        // print both arrays
        System.out.println("The first array is:" + Arrays.deepToString(arr1));
        System.out.println("The Second array is: " + Arrays.deepToString(arr2));
        
        // sum of matrix
        float sum_arr[][] = {{0.0f, 0.0f, 0.0f},{0.0f, 0.0f, 0.0f}};

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                sum_arr[i][j] = arr1[i][j] + arr2[i][j];
                //System.out.print(sum_arr[i][j]+ " ");// but this is not good approach due to not reusable of code 
            }
        }
        System.out.println("The sum of array 1 and array 2 is: ");
        for(int i=0; i<sum_arr.length; i++){
            for(int j=0; j<sum_arr[i].length; j++){
                System.out.print(sum_arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(sum_arr));

        



        
        
        
        
        
        /*Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        float arr[] = new float[size];// {23.4f, 34.1f, 2.6f, 45.43f, 67.5f, 67.0f, 6.8f};
        float sum = 0;
        float avg;
        System.out.print("Enter the element of array: \n");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextFloat();
            sum = sum + arr[i];
        }
        System.out.println("The array is: " + Arrays.toString(arr));
        System.out.println("The sum of array is: "+sum);
        System.out.print("The average of array is: " + (sum/arr.length));
        sc.close();*/
    }
}
