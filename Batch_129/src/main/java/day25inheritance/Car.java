package day25inheritance;


public class Car extends Vehicle {
    public int price = 11000;
    public void engine(){
        System.out.println("Car engine");
    }

    public Car() {
  super(10000);

        System.out.println("Car 1");
    }

    public Car(String make) {
    this();
        System.out.println("Car 2 : " + make);
    }
}
