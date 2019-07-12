package duck_behavior;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlayNoWay();
        quackBehavior = new Quack();
    }

    protected void display() {
        System.out.print("Утка модэль: ");
    }
}
