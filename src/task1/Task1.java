package task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер будущего массива: ");
        // считываем размер массива
        try {
            int size = scan.nextInt();

            double[] ls = new double[size];

            // цикл для заполнения массива по размеру
            for (int i = 0; i < size; i++) {
                System.out.print("Введите элемент массива №" + (i + 1) + ": ");
                try {
                    ls[i] = scan.nextDouble();
                } catch (java.util.InputMismatchException error) {
                    System.out.print("Элементы массива должны быть числом!");
                    System.exit(-1);

                }
            }
            System.out.println("\nОтветы:");

            // вычисляем сумму
            double summ = 0;
            for (int i = 0; i < size; i++) {
                summ += ls[i];
            }
            System.out.println("Сумма элементов массива: " + summ);

            // считаем среднее
            double sred = (double) summ / size;
            System.out.println("Среднее арифметическое: " + sred);
            
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
