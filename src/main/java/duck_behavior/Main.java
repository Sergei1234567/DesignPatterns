package duck_behavior;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        Duck readHead = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();
        Duck modelDuck = new ModelDuck();

        mallard.display();
        mallard.swim();
        mallard.performQuack();
        mallard.performFlay();

        System.out.println();

        readHead.display();
        readHead.swim();
        readHead.performQuack();
        readHead.performFlay();

        System.out.println();

        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performQuack();
        rubberDuck.performFlay();

        System.out.println();

        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.performQuack();
        decoyDuck.performFlay();

        System.out.println();

        modelDuck.display();
        modelDuck.performFlay();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFlay();
    }
}
