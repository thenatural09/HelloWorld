import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Troy on 9/20/16.
 */
public class Exercise02 {
    public static void main(String[] args) {
        Email[] emails = {
                new Email("alice@gmail.com","Hello","hello",false),
                new Email("bob@gmail.com","Hello","hello",false),
                new Email("charlie@gmail.com","Hello","hello",false),
                new Email("alice@gmail.com","Hello","hello",false),
                new Email("bob@gmail.com","Hello","hello",false)
        };

        // hash map that looks like this:
        // "alice@gmail.com" -> arraylist of two emails
        //"bob@gmail.com" -> arraylist of two emails
        //"charlie@gmail.com" -> arraylist of one email

        HashMap<String, ArrayList<Email>> emailMap = new HashMap<>();

        for (Email e : emails) {
            ArrayList<Email> emails1 = emailMap.get(e.destination);
            if (emails1 == null) {
                emails1 = new ArrayList<>();
                emailMap.put(e.destination, emails1);
            }
            emails1.add(e);
        }
        emailMap.clear();

        for (Email e : emails) {
            if (!emailMap.containsKey(e.destination)) {
                emailMap.put(e.destination, new ArrayList<>());
            }
            emailMap.get(e.destination).add(e);
        }
        System.out.println(emailMap);
    }
}
