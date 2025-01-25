import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

    String answer = scan.nextLine();


    if(answer.equals("yes")){
        System.out.println("Great!");
        System.out.println("rock - paper - scissors, shoot!");
        String yourChoice = scan.nextLine();
        String computerMove= computerChoice();
        printResult(yourChoice, computerMove, result(yourChoice, computerMove));

    }else{
        System.out.println("Darn, some other time...!");
    }
              

        scan.close();
    }


     public static String computerChoice(){
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        

        if(randomNumber == 0){
            return "rock";
        } else if (randomNumber == 1) {
            return "paper";
        } else if (randomNumber == 2) {
            return "scissors";
        } else {
            return "Invalid option";
        }
        
     }


    public static String result(String yourChoice, String computerChoice) {
        
        if (yourChoice.equals("rock") && computerChoice.equals("scissors") ||
         yourChoice.equals("paper") && computerChoice.equals("rock") ||
         yourChoice.equals("scissors") && computerChoice.equals("paper")){
          return "You win!";
         }      
         else if(computerChoice.equals("rock") && yourChoice.equals("scissors") || 
         computerChoice.equals("paper") && yourChoice.equals("rock") ||
         computerChoice.equals("scissors") && yourChoice.equals("paper")){
        return "You lose";
         }  
         else if (yourChoice.equals(computerChoice)) {
            return "It's a tie";
         }  
         else{
            return"INVALID CHOICE";
            
         }

        
      }
 


     public static void printResult(String yourChoice, String computerChoice, String result){
        System.out.println("You chose: " + yourChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(result);
        
     }

}
