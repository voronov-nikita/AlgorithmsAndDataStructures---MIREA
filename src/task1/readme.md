# Практическая работа №1. Знакомство со средой разработки

## Синтаксис и основные управляющие конструкции языка Java

### Цель

Введение в разработку программ на языке программирования **Java**.

***

## Теоретические сведения

**Java** — это объектно-ориентированный язык программирования с строгой инкапсуляцией и типизацией. Программы, написанные на Java, могут выполняться на различных операционных системах при наличии Java Runtime Environment (JRE).

### Необходимое ПО

Для создания и запуска программ на Java требуется:

- **Java Development Kit (JDK)**
- **Java Runtime Environment (JRE)**
- **Среда разработки** (IDE), например IntelliJ IDEA или NetBeans


#### Ссылки для скачивания:

- IntelliJ IDEA: [https://www.jetbrains.com/idea/download/\#section=windows](https://www.jetbrains.com/idea/download/#section=windows)
- NetBeans IDE: [https://netbeans.org/downloads/](https://netbeans.org/downloads/)
- JDK: [http://www.oracle.com/technetwork/java/javase/downloads/index.html](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

По умолчанию JDK устанавливается в папку
`C:\Program Files\Java` (Windows)

***

## Начало работы с IntelliJ IDEA

### Создание нового проекта (шаги)

1. Открыть программу и выбрать **Create New Project**.
2. Щёлкнуть **New** для загрузки JDK.
    - В открывшемся окне выбрать путь к скачанному SDK.
3. В выпадающем списке выбрать папку **Program Files** → **Java** → папка с JDK (например, `jdk...`).
4. Дважды нажать **Next** в правом нижнем углу.
5. Ввести название проекта и нажать **Finish**.
6. Щёлкнуть правой кнопкой мыши по папке `src`, создать новый пакет (**package**).
    - Используйте строчные буквы для имени пакета.
7. Щёлкнуть по пакету правой кнопкой, создать новый класс (**class**).
    - Имя класса должно начинаться с заглавной буквы.

### Обязательный метод

В стартовом классе должен быть статический метод:

```java
public static void main(String[] args) { }
```

Пример класса:

```java
package example;
public class Example {
    public static void main(String[] args) {
    }
}
```


***

## Переменные

Для объявления переменной указывают тип и имя.
Типы переменных:

- Целочисленные: `long`, `int`, `short`, `byte`
- С плавающей точкой: `double`, `float`
- Логический: `boolean`
- Перечисление, объектный: `Object`

Присваивание значения:

```java
float length = 2.5f;
double radius = 10024.5;
int meanOfLife = 42;
Object object = new String("Hello, world!");
String b = "Once compiled, runs everywhere?";
```


***

## Операции

- Целочисленные: `+`, `-`, `*`, `/`, `%`
- С плавающей точкой: `+`, `-`, `*`, `/`
- Со строками: только `+` (конкатенация)

***

## Массивы

Объявление массива:

```java
int[] b = new int;
```

Длина массива:
`b.length`

Доступ к элементу:
`b` (индекс с нуля)

***

## Условные конструкции

```java
if (a == b) {
    // действия, если a равно b
} else {
    // действия, если a не равно b
}
```

Операторы сравнения: `==`, `!=`, `>`, `<`, `>=`, `<=`, `!`
Тип результата: `boolean` (`true`/`false`)

***

## Циклы

### Цикл for

```java
for (int i = 0; i < 10; i++) {
    // действия в цикле
}
```


### Цикл while

```java
while (logic) {
    // тело цикла
}
```


### Цикл do while

```java
do {
    // тело цикла
} while (logic);
```


***

## Ввод/вывод и строки

Используется класс **Scanner** из `java.util`.

Пример чтения числа:

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 2;
        System.out.print("Введите целое число: ");
        if (sc.hasNextInt()) {
            i = sc.nextInt();
            System.out.println(i * 2);
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
```

Пример чтения строк и их конкатенации:

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        System.out.println(s1 + s2);
    }
}
```


***

## Методы класса String

- `int length()` — длина строки
- `boolean isEmpty()` — пуста ли строка
- `String replace(a, b)` — замена символа `a` на `b`
- `String toLowerCase()`
- `String toUpperCase()`
- `boolean equals(s)` — сравнение строк (оператор `==` не применять!)
- `int indexOf(ch)` — индекс первого вхождения символа
- `int lastIndexOf(ch)` — индекс последнего вхождения символа
- `int indexOf(ch, n)` — индекс символа, начиная с позиции `n`
- `char charAt(n)` — символ по индексу

Пример:

```java
public class Main {
    public static void main(String[] args) {
        String s1 = "firefox";
        System.out.println(s1.toUpperCase());      // FIREFOX
        String s2 = s1.replace('o', 'a');
        System.out.println(s2);                    // firefax
        System.out.println(s2.charAt(1));          // i
        int i;
        i = s1.length(); System.out.println(i);
        i = s1.indexOf('f'); System.out.println(i);
        i = s1.indexOf('r'); System.out.println(i);
        i = s1.lastIndexOf('f'); System.out.println(i);
        i = s1.indexOf('t'); System.out.println(i);
        i = s1.indexOf('r', 3); System.out.println(i);
    }
}
```


## Пример: индексы всех пробелов строки

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                System.out.println(i);
            }
        }
    }
}
```


***

## Методы в Java

Методы бывают статические и нестатические, открытые (`public`) и закрытые (`private`).
Синтаксис:

```java
public static int sum(int a, int b) {
    return a + b;
}
```

Вызов метода:

```java
int s = sum(10, 15);
```


---

# Практические задания

- [x] Создать проект в IntelliJ IDEA
- [x] Создать собственный Git-репозиторий
- [x] Написать программу: Инициализация массива чисел, подсчёт суммы и среднего арифметического через цикл `for`, вывод результата.
- [x] Написать программу: Ввод массива пользователем, подсчёт суммы через циклы `do while`, `while`, поиск максимума и минимума, вывод результата.
- [x] Написать программу: Вывести аргументы командной строки в цикле `for`.
- [x] Написать программу: Вывести первые 10 чисел гармонического ряда (оформить вывод).
- [x] Написать программу: Метод класса для вычисления факториала числа через цикл, проверить работу метода.
- [ ] Залить результаты работы через IDE в репозиторий и продемонстрировать преподавателю.

---

