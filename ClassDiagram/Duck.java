package ClassDiagram;

public class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    
    public void swim(){
        System.out.println("The duck is swimming.");
    };
    
    public void display(){
        System.out.println("This is a duck");
    };

    public void performQuack(){
        quackBehavior.quack();
    };

    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(){
        flyBehavior  = new FlyWithWings();
    }

    public void setQuackBehavior(){
        quackBehavior = new Quack();
    }
}
