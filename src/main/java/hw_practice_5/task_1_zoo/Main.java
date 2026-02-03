package hw_practice_5.task_1_zoo;

public class Main {
    public static void main(String[] args) {
        Animal elephant = new Elephant();
        Animal bird = new Bird();

        Zoo zoo = new Zoo();
        zoo.addAnimal(elephant);
        zoo.showBehavior();


        zoo.addAnimal(bird);
        zoo.showBehavior();
    }
}
