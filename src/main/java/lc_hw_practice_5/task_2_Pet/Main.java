package lc_hw_practice_5.task_2_Pet;

public class Main {
    public static void main(String[] args) {
        Pet cat = new Cat();
        Pet dog = new Dog();

        ManagePet managePet = new ManagePet();

        managePet.interactPet(cat);

        System.out.println();

        managePet.interactPet(dog);

    }

}
