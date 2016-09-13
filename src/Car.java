/**
 * Created by Troy on 9/12/16.
 */
//This class represents if the cars owned by people from the Human Class incuding car Model, Make, Year and Color, if it has been in a wreck and an array of potential modefications.
public class Car {
    String company;
    String model;
    int modelYear;
    String color;
    Human owner;

    Car(String newCompany, String newModel, int newModelYear, String newColor, Human newOwner) {
        setCompany(newCompany);
        setModel(newModel);
        setModelYear(newModelYear);
        setColor(newColor);
        setOwner(newOwner);
    }

    String getCompany() {
        return company;
    }

    void setCompany(String newCompany) {
        company = newCompany;
    }

    String getModel() {
        return model;
    }

    void setModel(String newModel) {
        if(isCarFast(newModel)) {
            model = "Fast Car";
        }
        else {
            model = newModel;
        }
    }

    int getModelYear() {
        return modelYear;
    }

    void setModelYear(int newModelYear) {
        modelYear = newModelYear;
    }

    String getColor() {
        return color;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    Human getOwner() {
        return owner;
    }

    void setOwner(Human newOwner) {
        owner = newOwner;
    }

    static boolean isCarFast(String model) {
        return model.contains("Charger");
    }


}
