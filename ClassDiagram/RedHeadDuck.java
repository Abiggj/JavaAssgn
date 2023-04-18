package ClassDiagram;

public class RedHeadDuck extends Duck{
    
    RedHeadDuck(){
        this.setFlyBehavior();
        this.setQuackBehavior();
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Looks like a Red Head.");
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
