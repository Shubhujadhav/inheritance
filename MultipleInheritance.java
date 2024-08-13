interface Printable{
    void print();
}
interface Scannable{
    void scan();
}

class MultiFunction implements Printable,
Scannable{
    @Override
    public void print(){
        System.out.println("Printer is printing...");
    }
    @Override
    public void scan(){
        System.out.println("Scanner is Scanning...");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        MultiFunction mf = new MultiFunction();
        mf.scan();
        mf.print();
    }
}
