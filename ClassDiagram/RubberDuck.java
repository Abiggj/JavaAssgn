package ClassDiagram;

public class RubberDuck extends Duck{

    RubberDuck(){
        this.setFlyBehavior();
        this.setQuackBehavior();

    }

    @Override
    public void display() {
        super.display();
        System.out.println("Looks like a rubber duck.");
    }

    @Override
    public void setQuackBehavior() {
        this.quackBehavior = new Squeak();
    }

    @Override
    public void setFlyBehavior() {
        this.flyBehavior = new FlyNoWay();
    }
    
}
