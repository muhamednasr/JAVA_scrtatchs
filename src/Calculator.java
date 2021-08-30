
public class Calculator {

    void add(int x, int y) {

        System.out.println(x + y);}
        
        
        void add(int x, int y,int z) {

        System.out.println(x + y+ z );
    }

    int subtract(int x, int y) {

        int res = x - y;
        return res;

    }

    void subAdd(int i, int i0) {
        add(i, i0);
        int t = subtract(i, i0);
        System.out.println(t);


    }
}
