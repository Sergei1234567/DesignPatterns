public class RedHeadDuck extends Duck {

    public RedHeadDuck(){
        quackBehavior = new Quack();
        flayBehavior = new FlayWithWings();
    }

    @Override
    public void display() {
        System.out.print("Красно головая утка: ");
    }

}
