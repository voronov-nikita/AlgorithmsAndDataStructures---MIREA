package task2.author;

public class Task1 {
    public static void main(String[] args) {
        Author author1 = new Author("Воронов Никита", "voronov_n@mirea.ru", 'M');
        Author author2 = new Author("Никита Воронов", "nikita_v@mirea.ru", 'F');


        // получение имен обоих авторов строчка за строчкой
        System.out.println("Имя автора №1: " + author1.getName());
        System.out.println("Имя автора №2: " + author2.getName());

        System.out.println("Email автора №1: " + author1.getEmail());
        System.out.println("Email автора №2: " + author2.getEmail());


        author1.setEmail("voronovnr_1@mail.ru");
        System.out.println("Новый Email автора №1 - " + author1.getEmail());
        
        author2.setEmail("voronov.n.r@edu.mirea.ru");
        System.out.println("Новый Email автора №2 - " + author2.getEmail());

        System.out.println("Пол автора №1: " + author1.getGender());
        System.out.println(author1.toString());

        System.out.println("Пол автора №2: " + author2.getGender());
        System.out.println(author2.toString());

    }
}
