import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер будущего массива: ");
        // считываем размер массива
        int size = scan.nextInt();

        int[] ls = new int[size];

        // цикл для заполнения массива по размеру
        for (int i = 0; i < size; i++){
            System.out.print("Введите элемент массива №" + (i+1)+": ");
            ls[i] = scan.nextInt();
        }

        System.out.println("\nОтветы:");

        // вычисляем сумму
        int summ = 0;
        for (int i = 0; i < size; i++){
            summ += ls[i];
        }
        System.out.println("Сумма элементов массива: " + summ);

        // считаем среднее
        float sred = (float)summ/size;
        System.out.println("Среднее арифметическое: " + sred);

    }
}
