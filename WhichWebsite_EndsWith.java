import java.util.Scanner;


public class WhichWebsite_EndsWith {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your website: ");
        String website = sc.nextLine();
        website = website.toLowerCase();

/*This program checks the domain of a website.
I used endsWith() method to identify the website type.
I also converted the input to lowercase to avoid case sensitivity issues. */

        if(website.endsWith(".com")){
            System.out.print("This is an commercial website.");
        }
        else if(website.endsWith(".org")){
            System.out.print("This is an organizational website.");
        }
        else if(website.endsWith(".in")){
            System.out.print("This is an Indian website.");
        }
        sc.close();
        
    }
}
