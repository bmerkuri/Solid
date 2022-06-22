package d.done;

public class Email extends MessInterface {
    @Override
    public void sendMessage(Person person, String message) {
        System.out.println(String.format("Simulating sending an email to %s", person.email));

    }
}
