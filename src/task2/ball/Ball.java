package task2.ball;

public class Ball {
    // переменные координат
    private double x;
    private double y;

    // инициализация с какими-то параметрами
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // пустая инициализация
    public Ball() {
        this(0.0, 0.0);
    }

    // геттер координаты X
    public double getX() {
        return x;
    }

    // геттер координаты Y
    public double getY() {
        return y;
    }

    // сеттер координаты X
    public void setX(double x) {
        this.x = x;
    }

    // сеттер координаты Y
    public void setY(double y) {
        this.y = y;
    }

    // сеттер обоих координат одновременно
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // метод перемещения, фактически прибавить к текущим координатам дельту перемещения
    // некий аналог сложению векторов
    public void move(double xDisp, double yDisp) {
        x += xDisp;
        y += yDisp;
    }

    // красивое форматирование за счет переопределения основного метода
    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}