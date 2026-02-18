package practice_7.photo_editor;

import java.util.Stack;

public class PhotoEditor {
    // хранить последние дейсвтия
    public Stack<String> actions;

    public PhotoEditor(){
        this.actions = new Stack<>();
    }

    //добавление нового действия
    public void addNewActions(String action){
        actions.push(action);
    }

    // иметь возможность откатить последние действия
    public void undoLastActions(){
        actions.pop();
    }

    public void printActions(){
        System.out.println("Все действия: ");
        actions.forEach(System.out::println);
    }

}
