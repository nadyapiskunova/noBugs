package hw_practice_5.task_2_pet;

public class Main {
    public static void main(String[] args) {
        Pet cat = new Cat();
        Pet dog = new Dog();

        PetManager petManager = new PetManager();
        petManager.interact(cat);
        petManager.interact(dog);
    }


}
