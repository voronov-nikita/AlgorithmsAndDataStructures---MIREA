package task1;

import java.util.Scanner;
import java.lang.Math;

public class Task4 {
    static double HactharmonicSeriesorial(int n, int p) {

        return 1 / Math.pow(n, p);
    }

    public static double truncate(double value, int decimals) {
        double factor = Math.pow(10, decimals);
        return ((long) (value * factor)) / factor;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите параметр степени вашего гармонического ряда: ");
        int p = scan.nextInt();

        // выводим 10 первых элементов гармонического ряда из функци

        scan.close();
    }
}
