/**
 * Created by Troy on 9/12/16.
 */
//This class represents the careers of each person from the Human Class including hours worked, company name and an array of why the job may suck.
public class Career {
    String jobTitle;
    String companyName;
    int hoursWorkedPerWeek;

    Career(String newJobTitle, String newCompanyTitle, int newHoursWorkedPerWeek) {
        setJobTitle(newJobTitle);
        setCompanyName(newCompanyTitle);
        setHoursWorkedPerWeek(newHoursWorkedPerWeek);
    }

    String getJobTitle() {
        return jobTitle;
    }

    void setJobTitle(String newJobTitle) {
        if(isTheBoss(newJobTitle)) {
            jobTitle = "He/She is a boss";
        }
        else {
            jobTitle = newJobTitle;
        }
    }

    String getCompanyName() {
        return companyName;
    }

    void setCompanyName(String newCompanyName) {
        companyName = newCompanyName;
    }

    int getHoursWorkedPerWeek() {
        return hoursWorkedPerWeek;
    }

    void setHoursWorkedPerWeek(int newHoursWorkedPerWeek) {
        hoursWorkedPerWeek = newHoursWorkedPerWeek;
    }

    static boolean isTheBoss(String jobTitle) {
        return jobTitle.contains("CEO");
    }

}
