package task2.author;

// класс автора
public class Author {
    private String name;
    private String email;
    private char gender;

    // метод инициализации
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // геттер получения имени
    public String getName() {
        return name;
    }

    // геттер получения email
    public String getEmail() {
        return email;
    }

    // сеттер email
    public void setEmail(String email) {
        this.email = email;
    }

    // геттр на гендер
    public char getGender() {
        return gender;
    }

    // переопределяем стандартный метод преобразования к строке для красивого форматированного вывода
    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}


