package ClassDiagram;

public class DecoyDuck extends Duck{
    DecoyDuck(){
        this.setFlyBehavior();
        this.setQuackBehavior();
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Looks like a decoy duck.");
    }

    @Override
    public void setFlyBehavior() {
        this.flyBehavior = new FlyNoWay();
    }

    @Override
    public void setQuackBehavior() {
        this.quackBehavior = new MuteDuck();
    }
}
