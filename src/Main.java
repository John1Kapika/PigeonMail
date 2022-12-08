import java.io.IOException;

public class Main {
    public static String user;

    public static void main(String[] args) throws IOException {

        User users = new User();
        Registration R = new Registration();
        R.reg();

        Messeng mes = new Messeng();
        mes.messeng1();


    }
}