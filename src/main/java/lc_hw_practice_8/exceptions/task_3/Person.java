package lc_hw_practice_8.exceptions.task_3;

import lc_hw_practice_8.exceptions.task_3.exceptions.InvalidAgePersonException;

public class Person {

    public static void checkAgePerson(int age) throws InvalidAgePersonException {
        if (age < 0 || age > 150){
            throw new InvalidAgePersonException("Возраст пользователя не может быть меньше 0 или больше 150");
        } else {
            System.out.println("Возраст пользователя: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            checkAgePerson(151);
        } catch (InvalidAgePersonException e){
            System.out.println("Возраст пользователя не может быть меньше 0 или больше 150");
        } finally {
            System.out.println("Работа метода завершена");
        }

    }
}
