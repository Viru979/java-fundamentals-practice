import java.util.Scanner;
import java.util.Random;



public class RockPaperScissors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter user choice (rock, paper, scissors): ");
        String userChoice = sc.nextLine().toLowerCase();

        Random rndm = new Random();
        String options[] = {"rock", "paper", "scissors"};
        String computerChoice = options[rndm.nextInt(3)];
        System.out.println("Computer choice is: "+ computerChoice);

        if(userChoice.equals(computerChoice)){
            System.out.print("Match tie!");
        }
        else if(
            (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock"))
        ){
            System.out.print("User wins!");
        }
        else if(
            (userChoice.equals("rock") && computerChoice.equals("paper")) ||
            (userChoice.equals("paper") && computerChoice.equals("scissors")) ||
            (userChoice.equals("scissors") && computerChoice.equals("rock"))
        ){
            System.out.print("Computer wins!");
        }
        else{
            System.out.print("Please Enter valid choice.");
        }
        sc.close();
    }
}