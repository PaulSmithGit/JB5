package lt.lhu.unit05.main;

import java.util.Random;

public class Task02 {

    public static void main(String args[]) {
        int[] array = new int[3];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000);
        }
        System.out.print("Массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%3d] ", array[i]);
        }
        System.out.println("\n");
        System.out.println("Минимальное число = " + Minimum(array));
        System.out.println("Максимальное число = " + Maximum(array));
        System.out.println("Сумма = " + (Minimum(array)+Maximum(array)));
    }
    static int Minimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    static int Maximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}

