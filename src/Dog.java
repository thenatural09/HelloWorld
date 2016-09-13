/**
 * Created by Troy on 9/12/16.
 */
//This class represents the dog owned by people in the Human class including the dog's name, type and color and who the owner is.
public class Dog {
    String name;
    String type;
    String color;

    Dog(String newName, String newType, String newColor) {
        setName(newName);
        setType(newType);
        setColor(newColor);
    }

    String getName() {
        return name;
    }

    void setName(String newName) {
        name = newName;
    }

    String getType() {
        return type;
    }

    void setType(String newType) {
        if(isScaryDog(newType)) {
            type = "Scary Dog";
        }

        else type = newType; {
        }
        //Jeez that was hard...
    }

    String getColor() {
        return color;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    static boolean isScaryDog(String type){
        return type.contains("Pit Bull");
    }

}
