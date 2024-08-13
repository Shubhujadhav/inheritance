// Base class 

class Animal{
    void makesound(){
        System.out.println("Animal makes a sound");
    }

}
// Derived class
class Dog extends Animal{
    @Override
    void makesound(){
        System.out.println("Dog makes a sound like ...BHOOOO BHOOOO");
    }
}
//Derived class
class Cat extends Animal{
    @Override
    void makesound(){
        System.out.println("cat makes a sound like ...MIVVVVVV MIVVVVVV");

    }

}
// main class

public class inheritance_1 {

    public static void main(String[] args) {
        Animal champakali = new Dog();
        Animal Rani = new Cat();
        champakali.makesound();
        Rani.makesound();
        
    }
}