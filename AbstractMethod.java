abstract class Animal {
    abstract void makesound();

    }
   
    class Dog extends Animal{
        @Override
        void makesound(){
            System.out.println("dog is barkig.... ");
        }
        void raju(){
            System.out.println("raju is barking.....");
        }
        void champakali(){
            System.out.println("champakali is sleeping....");
        }
    }
    
public class AbstractMethod {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makesound();
        dog.raju();
        dog.champakali();
    }
}
