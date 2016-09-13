/**
 * Created by Troy on 9/12/16.
 */
public class Person {
    String name;
    int age;
    boolean isAlive;

    //static fields
    static int minimumAge = 18;

    //Constructors ---> can still add setter methods as shown
    Person(String newName, int newAge, boolean newIsAlive) {
        setName(newName);
        setAge(newAge);
        setIsAlive(newIsAlive);
    }



 //starting with methods --> getting names
    String getName(){
        return name;
    }

    //setting a field instead of getting

    void setName(String newName) {
        if(isValidName(newName)) {
            name = newName;
        }
    }

    int getAge() {
        return age;
    }

    void setAge(int newAge) {
        if(newAge >= minimumAge) {
            age=newAge;
        }

    }

    boolean getIsAlive() {
        return isAlive;
    }

    void setIsAlive(boolean newIsAlive) {
        if (age > 100) {
            isAlive = false;

        } else {
            isAlive = newIsAlive;
        }
    }
//making a method static so that it is stand alone without an object
    static boolean isValidName(String name) {
        return name.contains(" ");
    }

}
