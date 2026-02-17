import java.util.Scanner;
import java.util.Random;

// 1️⃣ Guess the Even Number Game
// Create a class EvenGuessGame:
// Requirements:
// Constructor → generate a random even number between 1 to 100
// takeUserInput() → user input
// isCorrectNumber() → check guess
// Count number of attempts
// Hint: “Too small / Too large

// I used a constructor to generate a random even number.
// User input is stored in an instance variable, and the comparison logic is handled in a separate method.
// The game continues until maximum attempts.

class LimitedEvenGuessGame{
    private Scanner sc = new Scanner(System.in);
    private int userInput;
    private int computerInput;
    private int attempts = 0;
    private int maxAttempts = 5;

    public LimitedEvenGuessGame(){
        Random rndm = new Random();
        computerInput = rndm.nextInt(50)*2 + 2;
    }

    public void takeUserInput(){
        System.out.print("Enter the guessed even number: ");
        userInput = sc.nextInt();
        attempts++;
    }
    public boolean isCorrectNumber(){
        if(userInput == computerInput){
            System.out.println("You win!");
            System.out.println("You guessed the number in " + attempts + " attempts.");
            return true;
        }
        if(attempts > maxAttempts){
            System.out.println("Game Over!");
            System.out.println("The correct number was: "+ computerInput);
            return true;
        }
        if(userInput > computerInput){
            System.out.println("too high! try again.");
        }
        else{
            System.out.println("too small! try again.");
        }
        return false;
    }
}
public class AccessModifierPractice {
    public static void main(String[]args){
        LimitedEvenGuessGame gm = new LimitedEvenGuessGame();
        boolean isCorrect = false;
        do{
            gm.takeUserInput();
            isCorrect = gm.isCorrectNumber();
        }while(!isCorrect);
    }
}




/* // I used a constructor to generate a random number.
// User input is stored in an instance variable, and the comparison logic is handled in a separate method.
// The game continues until the correct number is guessed.

class GuessGame{
    private int computerNumber;
    private int userNumber;
    private int noOfGuesses;

    public GuessGame(){
        Random rndm = new Random();
        computerNumber = rndm.nextInt(100) + 1;
        noOfGuesses = 0;
    }
    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the guess number: ");
        userNumber = sc.nextInt();
        noOfGuesses++;
    }
    public boolean isCorrectNumber(){
        if(computerNumber == userNumber){
            System.out.println(" 🎉🥳Congratulations🎉👏🎊 You,  guessed correct number!");
            System.out.println("You guessed the number in "+ noOfGuesses + " attempts.");
            return true;
        }
        else if(computerNumber > userNumber){
            System.out.println("your number is too small! try again.");
        }
        else{
            System.out.println("Your number too high! try again.");
        }
        return false;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }
    public int getNoOfGuesses(){
        return noOfGuesses;
    }
}
public class AccessModifierPractice {
    public static void main(String[] args){
        GuessGame gm = new GuessGame();
        boolean isCorrect = false;
        while(!isCorrect){
            gm.takeUserInput();
            isCorrect = gm.isCorrectNumber();
        }
    }
}
*/





/* // instead of making multiple setter we use constructor
//  Constructor is used to initialize object at the time of creation and helps avoid multiple setters.
class MyEmployee{
    private int id; // instance variable
    private String name;
    public MyEmployee(){ // automatically called
        id = 97;
        name ="Virendra Maurya";
    }
    public MyEmployee(int myId){ // automatically called
        id = myId;
        name ="Viru Bhai";
    }
    public MyEmployee(int myId, String myName){ // automatically called
        id = myId;
        name =myName;
    }
    public int getId(){ // getter
        return id;
    }
    public String getName(){
        return name;
    }
}
public class AccessModifierPractice {
    public static void main(String[] args){
        //MyEmployee emp =  new MyEmployee(); // called constructor
        //MyEmployee emp =  new MyEmployee(112); // called constructor
        MyEmployee emp =  new MyEmployee(61, "Viru Don"); // called constructor
        int id = emp.getId();
        String nm = emp.getName();

        System.out.println("the employee id is: "+id);
        System.out.print("The name of the employee is: "+ nm);
    }
}*/


/*class MyEmployee{
    private int id; // instance variable
    private String name;

    public void setId(int id){ // setter
        this.id = id; // instance variable = local variable
        return;
    }
    public int getId(){ // getter
        return id;
    }
    public void setName(String nm){
        name = nm;  // not need for this keyword the instance variable and parameterd(local = nm) variable name is not same.
    }
    public String getName(){
        return name;
    }
}
public class AccessModifierPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MyEmployee emp =  new MyEmployee();
        System.out.print("Enter the id of the employee.");
        emp.setId(sc.nextInt());
        int id = emp.getId();
        sc.nextLine();

        System.out.print("Enter the name of the employee.");
        emp.setName(sc.nextLine());
        String nm = emp.getName();

        System.out.println("the employee id is: "+id);
        System.out.print("The name of the employee is: "+ nm);
    }
}*/
