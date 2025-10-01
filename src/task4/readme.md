# **Практическая работа №4: Перечисления и наследование в Java**

# Перечисления и их использование в Java

### Цели работы

Познакомиться с новым ссылочным типом данных — перечислением, освоить их разработку и применение в Java-программах.

### Теоретические сведения

**Объявление перечисления:**
```java
public enum Level {
    HIGH,
    MEDIUM,
    LOW
}
```
Ключевое слово `enum` вместо `class` или `interface`. Использование примера:
```java
Level level = Level.HIGH;
```
**Сравнение и ветвления:**
```java
if (level == Level.HIGH) {
   // ...
} else if (level == Level.MEDIUM) {
   // ...
} else if (level == Level.LOW) {
   // ...
}
```
**Использование в switch:**
```java
switch (level) {
    case HIGH: ...; break;
    case MEDIUM: ...; break;
    case LOW: ...; break;
}
```

### Итерация по перечислениям

```java
for (Level level : Level.values()) {
    System.out.println(level);
}
// HIGH MEDIUM LOW
```

### Метод toString() и valueOf()

```java
String levelText = Level.HIGH.toString(); // HIGH
Level level = Level.valueOf("HIGH");
```

### Поля и методы перечислений

```java
public enum Level {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private final int levelCode;
    private Level(int levelCode) {
        this.levelCode = levelCode;
    }
    public int getLevelCode() {
        return this.levelCode;
    }
}
```

***

## Задания на практическую работу №4

### Задание 1: Времена года

- Создать перечисление с временами года.
- Вывести информацию о любимом времени года.
- Метод для вывода сезонного описания через switch.
- Добавить среднюю температуру и методы getDescription (с переопределением для «Лето»).
- Циклом вывести все времена года, температуру, описание.

### Задание 2: Ателье

- Перечисление размеров одежды (XXS, XS, S, M, L) со средним описанием и евро-размером.
- Интерфейсы MenClothing и WomenClothing, с методами dressMan() и dressWoman().
- Абстрактный класс Clothes (размер, стоимость, цвет).
- Наследники: TShirt, Pants, Skirt, Tie.
- Класс Atelier с методами dressWomen и dressMan (работа с массивом одежды).

### Задание 3: Интернет-магазин

- Реализовать мини-приложение с регистрацией, просмотром каталогов, выбором и покупкой товаров.

### Задание 4: Класс Computer

- Описать компьютеры через классы Processor, Memory, Monitor; использовать перечисления для марок.

***

## Практическая работа 4.1: Наследование и Абстрактные классы

### ООП наследование

- Пример базового класса Bicycle, наследника MountainBike.
- Ключевое слово `extends`.
- Описание конструкторов, методов, переопределение toString.

**Пример:**
```java
class Bicycle {
    public int gear;
    public int speed;
    public Bicycle(int gear, int speed) { ... }
    public void applyBrake(int decrement) { speed -= decrement; }
    public void speedUp(int increment) { speed += increment; }
    public String toString() { ... }
}
// MountainBike extends Bicycle
class MountainBike extends Bicycle { ... }
```

### Абстрактные классы

- Пример: abstract class Swim с абстрактным методом swim() и обычным методом run().
```java
public abstract class Swim {
    abstract void swim();
    void run() { System.out.println("Куда идешь?"); }
}
class Swimmer extends Swim { ... }
```

***

## Задания 4.1

1. Классы фигур Shape, Circle, Rectangle, Square с наследованием и переопределением методов: getArea, getPerimeter, getType, toString.
2. Класс Phone с несколькими конструкторами, перегрузкой методов, разными типами отправки сообщений.
3. Класс Person с двумя конструкторами, методами move и talk.
4. Класс Matrix: арифметика матриц, вывод, умножение.
5. Класс Reader для библиотеки: перегрузка методов на разные типы параметров.
6. Пример Employer/Manager: наследование, дополнительные выплаты.
7. Массив учащихся: отображение школьников и студентов.
8. Абстрактный класс Shape и наследование (UML).
9. Абстрактный класс Мебель: наследники, магазин FurnitureShop.
10. Абстрактный класс Транспортное средство: расчет времени и стоимости перемещений.
11. Полиморфизм, объяснение ошибок компиляции, работа с upcast/downcast (Circle/Rectangle/Square).

**Диаграмма:**

```
Shape (abstract)
   |
  ---------------------
  |         |         |
Circle  Rectangle  Square
```

***

## Примеры кода, анализ ошибок, вопросы по полиморфизму

Различные объявления, upcast/downcast, вызовы методов, объяснения возникающих ошибок.
