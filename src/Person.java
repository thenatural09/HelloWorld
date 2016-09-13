/**
 * Created by Troy on 9/12/16.
 */
public class Person {
    String name;
    int age;
    boolean isAlive;
 //starting with methods --> getting names
    String getName(){
        return name;
    }

    //setting a field instead of getting

    void setName(String newName) {
        if(newName.contains(" ")) {
            name = newName;
        }
    }

    int getAge() {
        return age;
    }

    void setAge(int newAge) {
        if(newAge >= 18) {
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

}
