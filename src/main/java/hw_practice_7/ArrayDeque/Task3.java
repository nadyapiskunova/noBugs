package hw_practice_7.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task3 {
    private ArrayDeque<String> queue = new ArrayDeque<String>();

    Scanner scanner = new Scanner(System.in);

    public void addElements(){
        System.out.println("Добавьте элемент, для остановки ввода напишите stop");
        while (true){
            System.out.print("Добавьте элемент в начало очереди: ");
            String elementFirst = scanner.nextLine();
            if(elementFirst.equalsIgnoreCase("stop")){
                break;
            }

            System.out.print("Добавьте элемент в конец очереди: ");
            String elementLast = scanner.nextLine();
            if(elementLast.equalsIgnoreCase("stop")){
                break;
            }

            queue.addFirst(elementFirst);
            queue.addLast(elementLast);
        }
        System.out.println();
    }

    public void removeElements(){
        while (!queue.isEmpty()) {
            System.out.println("Извлекаю первый элемент: " + queue.removeFirst());
            System.out.println("Извлекаю последний элемент: " + queue.removeLast());
        }
    }


}
