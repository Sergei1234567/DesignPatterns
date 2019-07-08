public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        Duck readHead = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();

        mallard.display();
        mallard.swim();
        mallard.perfomQuack();
        mallard.performFlay();

        System.out.println();

        readHead.display();
        readHead.swim();
        readHead.perfomQuack();
        readHead.performFlay();

        System.out.println();

        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.perfomQuack();
        rubberDuck.performFlay();

        System.out.println();

        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.perfomQuack();
        decoyDuck.performFlay();

    }
}
