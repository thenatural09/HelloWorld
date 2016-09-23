import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Troy on 9/21/16.
 */
public class ReadWriteJson {
    public static void main(String[] args) throws IOException {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice Smith", 30, true));
        people.add(new Person("Bob Jones", 30, true));
        people.add(new Person("Charlie Brown", 30, true));
        PeopleWrapper pw = new PeopleWrapper(people);

        File f = new File("people.json");

        // write json
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.deep(true).serialize(pw);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();

        // read json
        FileReader fr = new FileReader(f);
        int fileSize = (int) f.length();
        char[] contents = new char[fileSize];
        fr.read(contents, 0, fileSize);
        JsonParser parser = new JsonParser();
        PeopleWrapper pw2 = parser.parse(contents, PeopleWrapper.class);
        System.out.println(pw2);
    }
}
