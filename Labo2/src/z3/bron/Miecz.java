package z3.bron;

public class Miecz implements Wyposaz{
    @Override
    public void wyposaz () {
        System.out.println(" wyposażył się w miecz");
    }

    @Override
    public void prezentuj () {
        System.out.println("CLING CLANG!!!! ------- po ataku bronią widać ślady uderzeń na kukle treningowej");
    }
}
