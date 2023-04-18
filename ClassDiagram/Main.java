package ClassDiagram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        int duckChoice;
        System.out.println("Choose your duck: ");
        System.out.println("1.Mallard\n2.Red Head\n3.Rubber\n4.Decoy");
        try (Scanner sc = new Scanner(System.in)) {
            duckChoice = sc.nextInt();
            switch(duckChoice){
                case 1:
                duck = new MallardDuck();
                break;
                case 2:
                duck = new RedHeadDuck();
                break;
                case 3:
                duck = new RubberDuck();
                break;
                case 4:
                duck = new DecoyDuck();
                break;
                default:
                System.out.println("Not a valid choice");
            }
            int behaviorChoice = 1;
            while(behaviorChoice != 0){
                System.out.println("Choose a behavior: ");
                System.out.println("1.Swim\n2.Display\n3.Quack\n4.Fly\n0.exit");
                behaviorChoice = sc.nextInt();
                switch(behaviorChoice){
                    case 1:
                    duck.swim();
                    break;
                    case 2:
                    duck.display();
                    break;
                    case 3:
                    duck.performQuack();
                    break;
                    case 4:
                    duck.performFly();
                    break;
                    case 0:
                    break;
                    default:
                    System.out.println("Not a valid choice.");

                }
            }
        }
    }
    
}
