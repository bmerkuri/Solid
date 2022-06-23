package o.done;

public class Applicant extends Stafi {
    EmployeeType typeOfEmployee;



    public Applicant(String firstName, String lastName, EmployeeType typeOfEmployee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.typeOfEmployee = typeOfEmployee;
    }
}
