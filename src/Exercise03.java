import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;

/**
 * Created by Troy on 9/21/16.
 */
public class Exercise03 {
    public static void main(String[] args) {
        String[] names = {"alice", "bob", "charlie","daniel","andrew","alex"};
        ArrayList<String> namesArr;


        //for each
        namesArr = new ArrayList<>(Arrays.asList(names));
        for (String name : names) {
//            String firstLetter = name.charAt(0);
            if (name.charAt(0) == 'a') {
                namesArr.remove(name);
            }
        }
        System.out.println(namesArr);

        //old school
        namesArr = new ArrayList<>(Arrays.asList(names));
        for (int i = namesArr.size() - 1; i >= 0; i--) {
            if (namesArr.get(i).charAt(0) == 'a') {
                namesArr.remove(i);
            }
        }
        System.out.println(namesArr);

        //iterators
        namesArr = new ArrayList<>(Arrays.asList(names));
        Iterator<String> iter = namesArr.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            if (name.charAt(0) == 'a') {
                iter.remove();
            }
        }
        System.out.println(namesArr);

        //stream
        namesArr = new ArrayList<>(Arrays.asList(names));
        namesArr = namesArr.stream().filter((name) -> {
            return !name.startsWith("a");
        }).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(namesArr);
    }
}
