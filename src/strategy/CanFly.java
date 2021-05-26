package strategy;

public class CanFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("i believe i can fly");
    }
}
