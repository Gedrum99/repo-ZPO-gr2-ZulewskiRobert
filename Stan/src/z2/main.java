package z2;

public class main {
    public static void main(String[] args){
        Telewizor test=new Telewizor();

        Pilot testujący=new Pilot( test );

        System.out.println();
        testujący.włącz();
        testujący.włącz();
        System.out.println();
        testujący.wysNrKanału();
        System.out.println();
        testujący.kanałDoPrzodu();
        testujący.kanałDoPrzodu();
        System.out.println();
        testujący.wysNrKanału();
        System.out.println();
        testujący.kanałDoTyłu();
        testujący.kanałDoTyłu();
        testujący.kanałDoTyłu();
        System.out.println();
        testujący.wysNrKanału();
        System.out.println();
        testujący.wyłącz();
        testujący.wyłącz();
    }
}
