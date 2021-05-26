package strategy;

public class PlasticDuck extends Duck{

    public PlasticDuck() {
        super(new CantFly(), new Mute());
    }

    public PlasticDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("i'm a plastic duck");
    }
}
