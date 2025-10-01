
# **Практическая работа №3: Классы Math, Random, и Оболочки**


# Классы Math и Random, оболочки

### Цели работы

Изучить работу с Math и Random, основные ООП-концепции, программировать вычисления, познакомиться с классами-оболочками Java и форматированием вывода.

***

## Класс Math

- Методы: min, max, sqrt, pow, sin, cos, tan, round, abs и константа PI.
- Пример использования:
```java
public class JavaMathExample1 {
    public static void main(String[] args) {
        double x = 28;
        double y = 4;
        System.out.println("Maximum: " + Math.max(x, y));
        System.out.println("Square root: " + Math.sqrt(y));
        System.out.println("Power: " + Math.pow(x, y));
        ...
    }
}
```

***

## Генерация случайных чисел

**1. Класс Random**
```java
Random rand = new Random();
int rand_int = rand.nextInt(1000);   // от 0 до 999
double rand_dub = rand.nextDouble(); // [0;1)
```
**2. Метод Math.random()**
```java
Math.random(); // double [0;1)
```
**3. ThreadLocalRandom**
```java
int rand_int = ThreadLocalRandom.current().nextInt();
double rand_dub = ThreadLocalRandom.current().nextDouble();
boolean rand_bool = ThreadLocalRandom.current().nextBoolean();
```

***

## Классы оболочки

У каждого примитивного типа — объектный тип-оболочка:

| Примитив | Оболочка  |
| -------- | --------- |
| byte     | Byte      |
| short    | Short     |
| int      | Integer   |
| long     | Long      |
| float    | Float     |
| double   | Double    |
| boolean  | Boolean   |
| char     | Character |

**Автоупаковка и автораспаковка:**
```java
Integer a = i; // автоупаковка
int b = a;     // автораспаковка
```
**Примеры методов:**
```java
Integer.parseInt("0011", 2); // 3
Integer.toString(15);        // "15"
```

***

## Форматирование вывода

- Использование `printf()`:
```java
System.out.printf("e = %.3f%n", Math.E);
System.out.printf("exp(%.3f) = %.3f%n", x, Math.exp(x));
```
- Спецификаторы: `%c`, `%d`, `%f`, `%s` и др.

**Пример с индексацией:**
```java
String greetings = String.format("Hello %2$s, welcome to %1$s!", "MIREA", "students");
```

**Класс Formatter:**
```java
Formatter fmt = new Formatter();
fmt.format("This %s is about %s %c ", "course", "java", '8');
```
**Числовое форматирование:**
```java
NumberFormat nf = NumberFormat.getInstance();
System.out.println(nf.format(number));
```
**Локализация:**
```java
NumberFormat.getCurrencyInstance(Locale.FRANCE);
NumberFormat.getPercentInstance(locFR);
```

***

## Задания на практическую работу №3

### Math/Random

1. Массив вещественных чисел: генерация, сортировка, вывод (Random и Math.random()).
2. Класс Point, класс Circle (центр — точка), Tester с массивом Circle, методы поиска и сортировки по радиусу.
3. Массив из 4 случайных целых [10;99], проверка на строго возрастающую последовательность.
4. Ввод размера массива, создание и обработка четных элементов.
5. То же — с четными из случайного массива.

***

### Классы оболочки

1. Создать объекты Double через valueOf, парсинг строки, преобразования, вывод.
2. Заполнить таблицу методов-оболочек (byteValue, doubleValue и т.д.).

***

### Форматирование строк

1. Класс конвертор валют.
2. Мини-приложение интернет-магазин с расчетом товара и выбором валюты.
3. Класс сотрудника Employee; массив объектов; класс Report с форматированным выводом salary (строгое десятичное выравнивание).
