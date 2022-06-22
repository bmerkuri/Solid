package s.done;

import java.util.Scanner;

public class sHelper {
    Scanner reader = new Scanner(System.in);



    //create another class which will be responsible for creating the user
    private boolean checkForNull(String str) {
        if (str == null || str.isEmpty()) return true;
        return false;
    }

    public Person createUser() throws Exception {
        System.out.println("What is your first name: ");
        String name = reader.next();
        if (checkForNull(name)) {
            throw new Exception("Please provide a name");
        }

        System.out.println("What is your last name: ");
        String surname = reader.next();
        if (checkForNull(surname)) {
            throw new Exception("Please provide a surname");
        }

        Person cperson = new Person();
        cperson.setFirstName(name);
        cperson.setLastName(surname);
        return cperson;
    }
}
