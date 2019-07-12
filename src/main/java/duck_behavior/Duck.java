package duck_behavior;

public abstract class Duck {
    FlayBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public void performFlay() {
        flyBehavior.flay();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlayBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    void swim() {
        System.out.print("плавает. ");
    }

    protected abstract void display();

}
