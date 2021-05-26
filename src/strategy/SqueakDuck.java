package strategy;

public class SqueakDuck extends Duck{
    public SqueakDuck() {
        super(new CanFly(), new Squeak());
    }

    public SqueakDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("i should squeak");
    }
}
