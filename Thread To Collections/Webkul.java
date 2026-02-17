import java.util.Scanner;

public class Webkul {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=1; i<=(n+1)/2; i++){
            for(int j=1;j<= n+3-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=1; i<=n-1; i++){
            for(int j=1; j<=3*n; j++){
                if(j==n || j==2*n){
                    System.out.print("@");
                }
                else if(i==n-1 && (j<=n || j>2*n)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }








/*public class Webkul {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        // set 4
        for(int i=1; i<=(n+1)/2; i++){
            for(int j=1; j<=n+3-i ; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+3; j++){
                if(i==n || j==1 || j==n+3){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

// 7
//          *
//         ***
//        *****
//       *******
// *        *
// *        *
// *        *
// *        *
// *        *
// *        *
// **********


/*public class Webkul {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        if(n%2 ==0 || n <3){
            return;
        }
        try{
            for(int i=1; i<=(n+1)/2; i++){
                for(int j=1; j<=(n+1)/2-i; j++){
                    System.out.print("  ");
                }
                for(int j=1; j<=2*i-1; j++){
                    System.out.print(" *");
                }
                System.out.println();
            }

            for(int i=1; i<=n; i++){
                for(int j=1; j<(n/2)+1; j++){
                    System.out.print("  ");
                }
                for(int j=1; j<=n+3; j++){
                    if(j==1 || i==n || j==n+3){
                        System.out.print(" e");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            sc.close();
        }*/
    }
}

// 5
//      *
//    * * *
//  * * * * *
//      e             e
//      e             e
//      e             e
//      e             e
//      e e e e e e e e
