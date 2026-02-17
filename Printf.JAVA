import java.util.Scanner;

public class Printf{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        float c = 54.74f;
        System.out.printf("The value of a is %d and the value of b is %f", a, b);
        System.out.format("The value of a is %d and the value of b is %f", a, b);
        System.out.printf("The value of a is %d and the value of c is %f", a, c);
        System.out.format("The value of a is %d and the value of c is %f", a, c);
    }
}