import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Troy on 9/14/16.
 */
public class Main {
    public static void main(String[] args) {
        String [] names = new String[3];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";

        //while loop
        int index = 0;
        while(index < names.length) {
            System.out.println(names[index]);
            index++;
        }

        //traditional for loop
        for(int i = 0; i < names.length; i++) {
            if (i != 1) {
                System.out.println(names[i]);
            }
        }

        //new for loop
        for(String name : names) {
            System.out.println(name);
        }

        //int -> Integer
        //boolean --> Boolean


        String number = "10";
        int intNumber = Integer.valueOf(number);
        System.out.println(intNumber);

        //arraylists and hashmaps
        ArrayList<String> names2 = new ArrayList();
        names2.add("Alice");
        names2.add("Bob");
        names2.add("Charlie");

        names2.remove(1);
        System.out.println(names2);
        //System.out.println(names2.get(0));


        HashMap<String,Object> person = new HashMap();
        person.put("name","Alice");
        person.put("age",30);
        person.put("location","Charleston");
        System.out.println(person.get("name"));

        //person.put("names", name2);
        //names2.add(person);

        String alice = names2.get(0);
        String alice2 = (String) person.get("name");
        System.out.println(alice);
        System.out.println(alice2);
    }
}
