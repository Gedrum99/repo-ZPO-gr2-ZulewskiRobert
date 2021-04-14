package z1.quack;

public class FakeQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Qwak");
    }
}
