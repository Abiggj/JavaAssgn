package ClassDiagram;

public class MallardDuck extends Duck{
    
    MallardDuck(){
        this.setFlyBehavior();
        this.setQuackBehavior();
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Looks like a Mallard.");
    }

    @Override
    public void setFlyBehavior() {
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void setQuackBehavior() {
        this.quackBehavior = new Quack();
    }
    
}
