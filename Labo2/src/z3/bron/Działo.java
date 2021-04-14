package z3.bron;

public class Działo implements Wyposaz {
    @Override
    public void wyposaz () {
        System.out.println(" wyposażył się w działo");
    }

    @Override
    public void prezentuj () {
        System.out.println("BOOM!!!! ------- po wystrzale z broni słychać głośny huk");
    }
}
