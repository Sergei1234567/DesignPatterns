package duck_behavior;

public class RedHeadDuck extends Duck {

    public RedHeadDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlayWithWings();
    }

    @Override
    public void display() {
        System.out.print("Красно головая утка: ");
    }

}
