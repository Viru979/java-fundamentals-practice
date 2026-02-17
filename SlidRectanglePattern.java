import java.util.Scanner;

public class SlidRectanglePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows= sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols= sc.nextInt();
        
        
        
        
        
        
        
        /*System.out.println("Here, Your hollow butterfly star pattern is: ");
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1; j<=2*(rows-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=rows; i>=1; i--){
            for(int j=1; j<=i; j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1; j<=2*(rows-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
// *      *
// **    **
// * *  * *
// *  **  *
// *  **  *
// * *  * *
// **    **
// *      *

        
        
        /*System.out.println("Here, Your butterfly star pattern is: ");
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(rows-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=rows; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(rows-i) ; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *
        
        
        
        /*System.out.println("Here, Your hollow diamond star pattern is: ");
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                if(j==1 || j==2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        for(int i=rows; i>=1; i--){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                if(j==1 || j==2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//    *
//   * *
//  *   *
// *     *
// *     *
//  *   *
//   * *
//    *
       
       
       
       
        /* // Best approach
        // If a pattern can be expressed with a formula,
        // prefer ONE loop with math over MULTIPLE loops.
        System.out.println("Here, Your diamond star pattern is: ");
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=rows; i>=1; i--){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *


        /* System.out.println("Here, Your palindrome number pyramid is: ");
        for(int i=1; i<= rows; i++){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            for(int j=2;j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
//     1
//    212
//   32123
//  4321234
// 543212345



        /*System.out.println("Here, Your pyramid is: ");
        for(int i=1; i<=rows; i++){
            for(int j=1;j<=rows-i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5


        /* This program prints a solid rhombus pattern.
// I used one loop to print spaces for shifting
// and another loop to print a fixed number of stars in each row.
        System.out.println("Here, Your solid rhombus is: ");
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=rows; j++){
                    System.out.print("* ");
            }
            System.out.println();
        }
//         * * * * *
//       * * * * *
//     * * * * *
//   * * * * *
// * * * * *


        /* for( ; ; ){
            System.out.print("Viru bhai");
        }


        /*System.out.println("Here, Your 0-1 triangle is: ");
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

       /* System.out.println("Here, Your Floyd's triangle is: ");
        int num = 1;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
    }
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

       /* System.out.println("Here, Your Right-aligned inverted half pyramid with numbers is: ");
        for(int i=rows; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

        /*System.out.println("Here, Your Right-aligned half pyramid with numbers is: ");
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
        
        
        /*System.out.println("Here, Your Right-aligned inverted half pyramid is: ");
        for(int i = rows; i>=1; i--){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
// ****
//  ***
//   **
//    *

        
        /*System.out.println("Here, Your Right-aligned half pyramid is: ");
        for(int i=1; i<=rows; i++){
            for(int j = 1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
//    *
//   **
//  ***
// ****
       
        /* //the number of stars directly depends on the outer loop variable.
        //It is more readable and easier to maintain.
        System.out.println("Here, Your inverted half pyramid is: ");
        for(int i =rows; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
// ****
// ***
// **
// *


        /*System.out.println("Here, Your half pyramid is: ");
        for(int i = 1; i<=rows; i++){
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
*/
// *
// **
// ***
// ****

        /*System.out.println("Here, Your hollow rectangle is: ");
        for(int i = 1; i<=rows; i++){
            for(int j = 1; j<= cols; j++){
                if( i ==1 || j==1 || i == rows || j == cols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
// *****
// *   *
// *   *
// *****

       /* System.out.println("Here, Your solid rectangle is: ");
        for(int i = 1; i<=rows; i++){
            for(int j=1; j<=cols; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
//       *****
//       *****
//       *****
//       *****
       // sc.close();
    }
}
