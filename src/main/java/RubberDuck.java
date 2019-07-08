public class RubberDuck extends Duck {

    public RubberDuck(){
        quackBehavior = new Squeak();
        flayBehavior = new FlayNoWay();
    }

    @Override
    public void display() {
        System.out.print("Резиновая утка: ");
    }
}
