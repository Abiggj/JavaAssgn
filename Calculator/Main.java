package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int run = 1;
        int choice;
        
        UserInput userInput = new UserInput();
        Scanner scanner = new Scanner(System.in);
        // initialise the objects from UserInput class and run over until the user input 
        // for run is not satisfied as 1
        
        while(run == 1){
        
            choice = userInput.getInput();      
            userInput.print_result(choice);
        
            // uses the UserInput methods to get input and then print the calculated result
            System.out.println("\n\nENTER 1 TO USE CALCULATOR AGAIN");
            run = scanner.nextInt();
        }
    }
    
}
