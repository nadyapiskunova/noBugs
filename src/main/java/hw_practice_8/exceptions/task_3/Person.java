package hw_practice_8.exceptions.task_3;

import hw_practice_8.exceptions.task_3.exceptions.InvalidAgeExceptions;

public class Person {
    public static void checkAgePerson(int age) throws InvalidAgeExceptions {
            if ((age < 0 || age > 150)) {
                throw new InvalidAgeExceptions("Возраст пользователя не может меньше 0 лет и больше 150 лет!");
            } else {
                System.out.println("Пользователю " + age + " лет!");
            }

    }
    public static void main(String[] args) {
        try {
            checkAgePerson(151);
        } catch (InvalidAgeExceptions e){
            System.out.print("Возраст пользователя не может меньше 0 лет и больше 150 лет!");
        }

    }

}
