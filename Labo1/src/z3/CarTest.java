package z3;

public class CarTest {
    public static void main(String[] args){
        Car Sedan=new Car("Sedan W12",new CarSpeedA());
        Car Golf=new Car("Golf P30",new CarSpeedB());

        Sedan.getCarName();
        Sedan.getMaxSpeed();

        System.out.println("==================wwwrrrmmmmmmm====================");

        Golf.getCarName();
        Golf.getMaxSpeed();
    }
}
