public class DecoyDuck extends Duck {

    public DecoyDuck(){
        quackBehavior = new Quack();
        flayBehavior = new FlayNoWay();
    }

    @Override
    public void display() {
        System.out.print("Утка манок: ");
    }
}
