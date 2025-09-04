package task1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        try {
            // размер массива должен быть целым числом
            int size = scan.nextInt();

            // любые числа - в том числе вещественный
            double[] ls = new double[size];
            
            int indexAdd = 0;
            while (indexAdd < size) {
                try {
                    System.out.print("Введите элемент № " + (indexAdd + 1) + ": ");
                    ls[indexAdd] = scan.nextDouble();
                    indexAdd++;
                } catch (java.util.InputMismatchException error) {
                    System.out.print("Ошибка: вы ввели не число!\n ----- Программа завершена -----");
                    System.exit(-1);
                }
            }

            double sum = 0;
            double max = ls[0];
            double min = ls[0];
            int i = 0;

            do {
                sum += ls[i];
                if (ls[i] > max) {
                    max = ls[i];
                }
                if (ls[i] < min) {
                    min = ls[i];
                }
                i++;
            } while (i < size);

            System.out.println("Сумма элементов массива: " + sum);
            System.out.println("Максимальный элемент: " + max);
            System.out.println("Минимальный элемент: " + min);

        } catch (java.util.InputMismatchException error) {
            System.out.print("Ошибка! Размер массива может быть исключительно целым числом >1");
        } catch (java.lang.NegativeArraySizeException error) {
            System.out.print("Ошибка! Размер массива может быть исключительно целым числом >1");
        } catch (java.lang.ArrayIndexOutOfBoundsException error) {
            System.out.print("Ошибка! Размер массива может быть исключительно целым числом >1");
        }
        scan.close();
    }
}
