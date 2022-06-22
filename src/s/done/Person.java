package s.done;

public class Person {
    String firstName;
    String lastName;



    //leave only methods that directly relate to the Person class
    public void printUsername() {
        System.out.println(String.format("Your username is %s %s", getFirstName(), getLastName()));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
