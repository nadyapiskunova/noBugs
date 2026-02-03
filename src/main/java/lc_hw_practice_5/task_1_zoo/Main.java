package lc_hw_practice_5.task_1_zoo;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal elephant = new Elephant();

        Zoo zoo = new Zoo();

        zoo.addAnimal(bird);
        zoo.showBehaviour();

        System.out.println();

        zoo.addAnimal(elephant);
        zoo.showBehaviour();

    }
}
