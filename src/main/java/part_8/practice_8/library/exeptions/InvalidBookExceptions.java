package part_8.practice_8.library.exeptions;

// непроверяемый -> Error, RuntimeException
public class InvalidBookExceptions extends RuntimeException {

    public InvalidBookExceptions(String message){
        super(message);
    }
}
