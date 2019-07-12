package duck_behavior;

public class RubberDuck extends Duck {

    public RubberDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlayNoWay();
    }

    @Override
    public void display() {
        System.out.print("Резиновая утка: ");
    }
}
