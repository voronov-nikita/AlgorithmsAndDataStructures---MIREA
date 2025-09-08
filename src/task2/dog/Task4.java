package task2.dog;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    private List<Dog> dogs;

    public Task4() {
        dogs = new ArrayList<>();
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public List<Dog> getAllDogs() {
        return dogs;
    }

    public static void main(String[] args) {
        Task4 test = new Task4();

        Dog dog1 = new Dog("Rex", 3);
        Dog dog2 = new Dog("Bella", 2);

        test.addDog(dog1);
        test.addDog(dog2);

        List<Dog> dogs = test.getAllDogs();
        for (Dog dog : dogs) {
            System.out.println(dog.toString());
            System.out.println("Human age: " + dog.humanAge() + " years");
            System.out.println();
        }
    }
}