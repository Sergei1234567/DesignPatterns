package duck_behavior;

public class DecoyDuck extends Duck {

    public DecoyDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlayNoWay();
    }

    @Override
    public void display() {
        System.out.print("Утка манок: ");
    }
}
