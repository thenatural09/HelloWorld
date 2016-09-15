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
    }
}
