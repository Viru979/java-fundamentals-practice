public class VarArgs {

    // Varargs allow a method to accept zero or more arguments.
    // Internally, varargs are treated as arrays.
    // Instead of creating multiple overloaded methods for the same work with the same type of variables and return types, we can use varargs.
    public static int sum(int ...arr){
        int add =0;
        for(int i : arr){
            add += i;
        }
        return add;
    }
    // public static int sum(){
    //     return 0;
    // }
    // public static int sum(int a){
    //     return a;
    // }
    // public static int sum(int a, int b){
    //     return a + b;
    // }
    // public static int sum(int a, int b, int c){
    //     return a + b + c;
    // }
    // public static int sum(int a, int b, int c, int d){
    //     return a + b + c + d;
    // }
    // public static int sum(int a, int b, int c, int d, int e){
    //     return a + b + c + d + e;
    // }
    
    
    public static void main(String[] args){
        System.out.println("The sum of 0 is: "+ sum());
        System.out.println("The sum of 3 is: "+ sum(3));
        System.out.println("The sum of 3 and 4 is: "+ sum(3, 4));
        System.out.println("The sum of 3 and 4 is: "+ sum(3, 4, 5));
        System.out.println("The sum of 3 and 4 is: "+ sum(3, 4, 7, 2));
        System.out.println("The sum of 3 and 4 is: "+ sum(3, 4, 7, 2, 9));
    }
}
