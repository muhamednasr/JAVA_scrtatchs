
class TestIf {

    public static void main(String[] args) {
      double  fn = 20, sn = 30, res; double tax = 0.0;
        res = fn + sn;


        if (res > 100) {

            tax = res * 2;

            System.out.println("the result  " + res);
            System.out.println("the tax " + tax);
        } else {
            tax = (res * 5)/100;

            System.out.println("the result  " + res);
            System.out.println("the tax " + tax);
        }



    }
}