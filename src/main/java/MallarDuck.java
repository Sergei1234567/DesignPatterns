public class MallarDuck extends Duck {

    public MallarDuck(){
        quackBehavior = new Quack();
        flayBehavior = new FlayWithWings();
    }

    @Override
    public void display() {
        System.out.print("Утка кряква: ");
    }
}
