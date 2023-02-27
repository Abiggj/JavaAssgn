package Calculator;

import java.util.Scanner;

public class UserInput {
    // class attributes of choice(operation) and the left/right operands
    float left, right, result;
    int choice;
    Scanner scanner = new Scanner(System.in);

    int getInput(){
        // output the operations to be selected one by one
        System.out.println("Enter choice of operation-\n1 for addition");
        System.out.println("2 for substraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for division");
        choice = scanner.nextInt();
        // repeat input of choice until the correct is entered
        if(choice < 1 || choice > 4){
            System.out.println("Please enter correct choice\n\n");
            return getInput();
        }
        return choice;
    }

    void print_result(int choice){
        // use the Attributes to get the operands' input
        System.out.println("Enter the first number: ");
        left = scanner.nextFloat();
        System.out.println("Enter the Second number: ");
        right = scanner.nextFloat();

        // use the Calculator object to select the type of operation to be performed
        Calculator calculator = new Calculator(left, right);
        if(choice == 1){
            result = calculator.addition(left, right);
        }
        else if(choice == 2){
            result = calculator.substraction(left, right);
        }
        else if(choice == 3){
            result = calculator.multiplication(left, right);
        }
        else if(choice == 4){
            result = calculator.division(left, right);
        }
        
        System.out.println("The answer is:");
        System.out.println(result);
    }
    
}
