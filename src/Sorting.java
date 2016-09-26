import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Troy on 9/26/16.
 */
public class Sorting {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("alice","charlie","bob"));
        Collections.sort(names);
        System.out.println(names);

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice Smith",30,true));
        people.add(new Person("Charlie Ward",25,true));
        people.add(new Person("Bob Ward",45,true));
        Collections.sort(people);
        System.out.println(people);
    }
}
