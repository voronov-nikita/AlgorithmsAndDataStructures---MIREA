package task2.ball;

public class Task2 {
    public static void main(String[] args) {

        Ball ball = new Ball(1.0, 1.0);

        System.out.println("Координаты мяча  ball: "+ ball.toString());
        ball.move(2.0,2.0);

        System.out.println("Новые координаты мяча: " + ball);
        ball.setXY(5, 15);
        
        System.out.println("Новые координаты мяча: " + ball);
    }
}