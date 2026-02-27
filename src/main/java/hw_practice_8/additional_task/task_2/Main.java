package hw_practice_8.additional_task.task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static <T> void printList(List<T> list){
        for (T element : list){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<String> listStr = new ArrayList<>(Arrays.asList("Apple", "peach", "banana"));
        printList(listStr);

        List<User> userList = new ArrayList<>(Arrays.asList(
                new User("Bloom", 18),
                new User("Leyla", 17),
                new User("Stella", 19)
        ));
        printList(userList);

    }
}
