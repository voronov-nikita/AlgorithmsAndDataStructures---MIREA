package task1;

import java.util.Scanner;

public class Task5 {
    // функция вычисления факториала
    static int calculateFactorial(int n){
        int res = 1;
        for (int i = 1; i <=n; i ++){
            res = res*i;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(calculateFactorial(num));
        
        scan.close();
    }
}
