package task2.point;

import java.util.Scanner;

public class Task3 {

    private Circle[] circles;
    private int numberOfCircles;

    public Task3(int capacity) {
        circles = new Circle[capacity];
        numberOfCircles = 0;
    }

    public void addCircle(Circle circle) {
        if (numberOfCircles < circles.length) {
            circles[numberOfCircles] = circle;
            numberOfCircles++;
        } else {
            System.out.println("Массив полон. Нельзя добавить больше окружностей.");
        }
    }

    public void displayCircles() {
        for (int i = 0; i < numberOfCircles; i++) {
            System.out.println("Окружность " + (i + 1) + ":");

            System.out
                    .println("\tЦентр: (" + circles[i].getCenter().getX() + ", " + circles[i].getCenter().getY() + ")");
            System.out.println("\tРадиус: " + circles[i].getRadius());
            System.out.println("\tПериметр: " + Math.round(circles[i].Perimeter(circles[i].getRadius())));
            System.out.println("\tПлощадь: " + Math.round((circles[i].Square(circles[i].getRadius()))));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите кол-во кругов: ");
        int x = scan.nextInt();

        Task3 tester = new Task3(x);

        for (int i = 0; i < x; i++) {
            System.out.println("Для №" + (i + 1));
            System.out.print("\tВведите координату X: ");
            int cord_x = scan.nextInt();
            // System.out.print("\n");
            System.out.print("\tВведите координату Y: ");
            int cord_y = scan.nextInt();
            System.out.print("\tВведите радиус окружности: ");
            int radius = scan.nextInt();

            Point center = new Point(cord_x, cord_y);
            Circle circleObject = new Circle(center, radius);
            tester.addCircle(circleObject);

        }
        tester.displayCircles();

        scan.close();
    }
}