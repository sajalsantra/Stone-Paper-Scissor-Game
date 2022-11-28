import java.util.Random;
import java.util.Scanner;

class newGame{
    int compInput, userInput;
    public newGame(){
        Random random = new Random();
        compInput = random.nextInt(3);
    }
    public void takeUserInput(){
        Scanner sv = new Scanner(System.in);
        System.out.println(" For Your Information: 0 is Stone, 1 is Paper, 2 is Scissors.");
        System.out.print("Chose Your Turn:" );
        userInput = sv.nextInt();
        System.out.print("Your Input Is: ");
        if(userInput==0){
            System.out.println(userInput+": Stone");
        }
        else if(userInput==1){
            System.out.println(userInput+": Paper");
        }
        else if(userInput==2){
            System.out.println(userInput+": Scissors");
        }
        else {
            System.out.println("Tour Input Is Wrong!");
            System.exit(0);
        }
    }
    public  void getIsStonePaperScissors(){
        if(compInput==userInput){
            System.out.println( "Bah! Both are Same. So, Draw.");
        }
        else if(compInput==0||userInput==1 && compInput==1||userInput==2 && compInput==2 || userInput==0){
            System.out.println("Congratulation! You Win The Game.");
        }
        else{
            System.out.println("You lose the Game ");
        }
    }
    public void printCompInput(){
        System.out.print("Computer Chose: ");
        if(compInput==0){
            System.out.println(compInput+": Stone");
        }
        else if(compInput==1){
            System.out.println(compInput+": Paper");
        }
        else {
            System.out.println(compInput+": Scissors");
        }
    }

}

public class tonePaperScissors {
    public static void main(String[] args) {
    Scanner sc = new Scanner( System.in);
        System.out.println("Welcome to Stone Paper Game!");
        newGame obj = new newGame();
        obj.takeUserInput();
        obj.printCompInput();
        obj.getIsStonePaperScissors();
    }
}
