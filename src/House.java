/**
 * Created by Troy on 9/12/16.
 */
//This class represents homes that people may own including number of floors, bathrooms, and bedrooms and if the house includes a backyard.
public class House {
    int numberOfBedrooms;
    boolean hasBackyard;
    String ownerOfHouse;


    House(int newNumberOfBedrooms, boolean newHasBackyard, String newOwnerOfHouse) {
        setNumberOfBedrooms(newNumberOfBedrooms);
        setHasBackyard(newHasBackyard);
        setOwnerOfHouse(newOwnerOfHouse); }

    int getNumberOfBedrooms(){
        return numberOfBedrooms;
    }

    void setNumberOfBedrooms(int newNumberOfBedrooms) {
        numberOfBedrooms = newNumberOfBedrooms;
    }

    boolean getHasBackyard(){
        return hasBackyard;
    }

    void setHasBackyard(boolean newHasBackyard) {
        hasBackyard = newHasBackyard;
    }


    String getOwnerOfHouse() {
        return ownerOfHouse;
    }
    void setOwnerOfHouse(String newOwnerOfHouse) {
        if(validOwner(newOwnerOfHouse)){
            ownerOfHouse = newOwnerOfHouse;
    }
        }


    static boolean validOwner (String name){
        return name.contains(" ");
    }


}
