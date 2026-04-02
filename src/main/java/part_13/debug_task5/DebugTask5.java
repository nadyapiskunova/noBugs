package part_13.debug_task5;

public class DebugTask5 {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        person = updateAge(person);
        System.out.println("Updated age: " + "\n" + person);
    }
    public static Person updateAge(Person person) {
        return person = new Person(person.getName(), person.getAge() + 1);
    }
}

