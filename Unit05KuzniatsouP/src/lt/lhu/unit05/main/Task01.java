package lt.lhu.unit05.main;

public class Task01 {

    public static void main(String args[]) {

        int a = (int)(Math.random() * 999);
        int b = (int)(Math.random() * 999);
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Greatest Common Factor = " + GCF(a, b) + ", Least Common Multiple = " + LCM(a, b));
    }

    static int GCF (int a, int b) {
        int min;
        int gcf = 0;
        if (a > b)
            min = b;
        else
            min = a;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                if (i > gcf)
                    gcf = i;
            }
        }
        return gcf;
    }
    static int LCM (int a, int b) {
        int lcm = 0;
        int i = 1;
        while (lcm == 0) {
            if (i % a == 0 && i % b == 0) {
                lcm = i;
            }
            i++;
        }
        return lcm;
    }
}
