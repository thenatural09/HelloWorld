import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

/**
 * Created by Troy on 9/26/16.
 */
public class Exercise04 {
    public static void main(String[] args) {
        String[] names = {"charlie","david","bob","alice","andrew"};
        ArrayList<String> sortedNames = new ArrayList<>();
//        sortedNames.set(0,"alice");
//        sortedNames.set(1,"andrew");
//        sortedNames.set(2,"bob");
//        sortedNames.set(3,"charlie");
//        sortedNames.set(4,"david");
//
//        sortedNames.clear();
        //sort names alphabetically
        for (String name : names) {
            int index = 0;
            //find the correct index
            for (String sortedName: sortedNames) {
                if (name.compareTo(sortedName) > 0) {
                    index ++;
                }
                else {
                    break;
                }
            }
            sortedNames.add(index,name);
        }
        System.out.println(sortedNames);
    }

}
