public abstract class Duck {
    FlayBehavior flayBehavior;
    QuackBehavior quackBehavior;

    public Duck(){

    }
    public void performFlay(){
        flayBehavior.flay();
    }

    public void perfomQuack(){
        quackBehavior.quack();
    }

    void swim(){
        System.out.print("плавает. ");
    }

    abstract void display();

}
