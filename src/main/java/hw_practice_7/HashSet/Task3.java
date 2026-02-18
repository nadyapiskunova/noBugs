package hw_practice_7.HashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {

    public Set<String> removeDuplicates(List<String> input){
        Set<String> result = new HashSet<>();
        result.addAll(input);

        return result;
    }


}
