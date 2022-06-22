package s.done;

public class main {
        public static void main(String[] args) {
            sHelper sapp = new sHelper();

            try {
                Person user = sapp.createUser();
                user.printUsername();
            } catch (Exception err) {
                System.out.println(err);
            }
        }
    }

