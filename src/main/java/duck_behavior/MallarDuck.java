package duck_behavior;

public class MallarDuck extends Duck {

    public MallarDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlayWithWings();
    }

    @Override
    public void display() {
        System.out.print("Утка кряква: ");
    }
}
