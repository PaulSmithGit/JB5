package lt.lhu.unit05.main;

public class Task03 {

    public static void main(String args[]) {
        int a = (int)(Math.random() * 9999);
        int b = (int)(Math.random() * 9999999);
        System.out.print("a = " + a + ", b = " + b + " => ");
        System.out.println(Digits(a, b));
    }
    static String Digits(int a, int b) {
        String result = new String();
        while (a != 0 && b !=0 ) {
            a /= 10;
            b /= 10;
            if (a == 0 && b == 0) {
                result = "Количество разрядов равное";
            }
            else {
                if (b == 0) {
                    result = "В первом числе разрядов больше";
                }
                else {
                      result = "Во втором числе разрядов больше";
               }
            }
        }
        return result;
    }
}
