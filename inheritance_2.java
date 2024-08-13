//Base class

class Vehicle{
    void start(){
        System.out.println("vehicle is starting....");

    }
}
// Derived class 
class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("car is starting");

    }
}
// Derived class
class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("bike is started....");
    }
}

// main class 
public class inheritance_2 {   
    public static void main(String[] args) {
        Vehicle rani = new Vehicle();
        Vehicle Thar = new Car();
        Vehicle activa = new Bike();
      

        rani.start();
        Thar.start();
        activa.start();
       
    }
    
}
