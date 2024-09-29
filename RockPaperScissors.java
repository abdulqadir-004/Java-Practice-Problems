import java.util.Random; //import scanner class for input
import java.util.Scanner; //import random class for random number generator
public class RockPaperScissors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        //initialize rock paper sciccors as menu
        int rock = 1;
        int paper = 2;
        int scissors = 3;
        int choice = 1; //by default set choice to 1 so game replays

        System.out.println("***WELCOME TO ROCK PAPER SCISSORS GAME***");
        //show menu
        System.out.println("***Menu***\n1- Rock\n2- Paper\n3- Scissors");
        do { 
        int pc = rand.nextInt(3)+1; //generate random numbers from 0 to 2 (added +1 to shift range to 1,2,3)
        //ask for input
        System.out.print("ENTER YOU CHOICE: ");
        int user = sc.nextInt();
        
        //check validation
        if(user<1 || user>3){
            System.out.println("WRONG INPUT. CHOOSE BETWEEN 1 to 3");
            continue; //ask again for input
        }

        //show users choice
        System.out.println("You chose: "+(user == rock? "Rock" : user == paper? "Paper" : "Scissors"));
        //show computer's choice
        System.out.println("Computer chose: "+(pc == rock? "Rock" : pc == paper? "Paper" : "Scissors"));

        //game logic
        if(user == 1 && pc == 3 || user == 3 && pc == 2 || user == 2 && pc == 1){
            System.out.println("YOHOO!! YOU WON");
        }else if(user == pc){
            System.out.println("GAME TIE!! BOTH CHOSE SAME");
        }else{
            System.out.println("OOPS!! YOU LOST");
        }
        //ask if user wants to play again
        while(true){
        System.out.print("DO YOU WANT TO PLAY AGAIN (1- YES 2- NO): ");
        choice = sc.nextInt();

        //check validation
        if(choice == 1 || choice == 2){
            break; //ask again for input
        }
        System.out.println("WRONG INPUT. CHOOSE 1 or 2");
        }
        } while (choice == 1);
        sc.close(); //close scanner
    }
}
