package z4.quack;

public class MuteQuack implements QuackBehavior
{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
