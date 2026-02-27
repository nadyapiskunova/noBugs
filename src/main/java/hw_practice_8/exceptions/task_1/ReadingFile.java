package hw_practice_8.exceptions.task_1;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
    public static void main(String[] args) {
        FileReader reader = null;
        try{
            reader = new FileReader("data.txt");
            System.out.println("Файл открыт");
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        } finally {
            try {
                if (reader != null){
                    reader.close();
                }
            } catch (IOException e){
                System.out.println("Ошибка при");
            }
        }
    }
}
