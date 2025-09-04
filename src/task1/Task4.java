package task1;

import java.util.Scanner;
import java.lang.Math;

public class Task4 {
    static double HactharmonicSeriesorial(int n, int p){
        
        return 1/Math.pow(n, p);
    }

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите параметр степени вашего гармонического ряда: ");
        int p = scan.nextInt();
        
        // выводим 10 первых элементов гармонического ряда из функций
        for (int i = 1; i <= 10; i++){
            System.out.println("1/(" + i + "^" + p + ") = " + HactharmonicSeriesorial(i, p));
        }

        scan.close();
    }
}
