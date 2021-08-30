
public class TestOop {

    public static void main(String[] args) {
 
        //object from calculator
        Calculator c1 = new Calculator();
        c1.add(40, 20);
        c1.add(60, 100);
        int sub = c1.subtract(70, 90);
        System.out.println(sub);
        c1.subAdd(10, 50);


    }
}
