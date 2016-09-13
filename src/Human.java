/**
 * Created by Troy on 9/12/16.
 */
//This class represents people and other corresponding classes will be things that people may own.
public class Human {
    String name;
    String gender;
    int age;

    static int minimumAge = 21;

    //Constructor
    Human(String newName, String newGender, int newAge){
        setName(newName);
        setGender(newGender);
        setAge(newAge);
    }


    //Getter and Setter for Name
    String getName(){
        return name;
    }

    void setName(String newName){
        name = newName;
    }

    //Getter and Setter for Gender
    String getGender() {
        return gender;
    }

    void setGender(String newGender) {
        gender = newGender;

    }

    //Getter and Setter for Age
    int getAge() {
        return age;
    }

    void setAge(int newAge) {
        if(newAge >= minimumAge){
            age = newAge;
        }

    }
    }

