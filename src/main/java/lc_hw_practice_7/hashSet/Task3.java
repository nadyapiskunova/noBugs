package lc_hw_practice_7.hashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
    public Set<String> removeDuplicates(List<String> listStr){
        Set<String> setStr = new HashSet<String>();

        setStr.addAll(listStr);

        return setStr;
    }
}
