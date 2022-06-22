package d.done;

public class MessInterface {
    public void sendMessage(Person person, String message) {

    }

    //we declared an interface MessInterface so that we wouldnt tightly couple the classes together
    //thus making it hard to test and to switch class
    //with this interface the classes are decoupled and they communicate through this abstraction

}
