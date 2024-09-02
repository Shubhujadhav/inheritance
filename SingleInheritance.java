abstract class vehicle{
    abstract void start();
}
class Car extends vehicle{
    @Override
    void start(){
        System.out.println("car is starting.....");
    }
    void drive(){
        System.out.println("car is driving...");
    }
}
/**
 * SingleInheritance
 */
public class SingleInheritance {

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.drive();
    }
}