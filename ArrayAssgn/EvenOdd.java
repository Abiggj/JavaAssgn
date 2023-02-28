package ArrayAssgn;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // two ArrayList for even and odd numbers        
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        
        Integer number;
        
        // run while the user confirms by entering 1 for run
        try (Scanner scanner = new Scanner(System.in)) {
            int run = 1;

            while(run == 1){
                // If the number is divisible by 2 it is put in the even ArrayList
                // else it is added to the odd numbers arraylist
                System.out.println("Enter the number: ");
                number = scanner.nextInt();
                if(number % 2 == 0){
                    even.add(number);
                }
                else{
                    odd.add(number);
                }
                System.out.println("Enter 1 to add more");
                run = scanner.nextInt();  
            }
        }
        
        // The numbers of both the even and the odd ArrayList are displayed separately
        System.out.println("\n\nThe array of even numbers is: ");
        for(int i = 0; i < even.size(); i++) {   
            System.out.print(even.get(i) + " ");
        }
        
        
        System.out.println("\n\nThe array of odd numbers is: ");
        for(int i = 0; i < odd.size(); i++) {   
            System.out.print(odd.get(i) + " ");
        }
        System.out.println("\n");
    }
}
