package z3;

import z3.CarSpeed;

public class Car {
    String name;
    CarSpeed CarSpeed;

    public Car(String name,CarSpeed speed) {
        this.name=name;
        this.CarSpeed=speed;
    }

    public int getMaxSpeed(){
        System.out.println("Speed "+ this.CarSpeed.MaxSpeed());
        return this.CarSpeed.MaxSpeed();
    }
    public void getCarName() {
        System.out.println(this.name);
    }
}