package ClassDiagram;

public class MuteDuck implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("[quiet silent silence]");
    }
    
}
