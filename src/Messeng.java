import java.io.IOException;
import java.util.Scanner;

public class Messeng {
    static String nick;
    private static String nick1;
    private static String text;
    public static String m = "C:\\Users\\John Kapika\\YandexDisk\\Учёба\\Java\\PigeonMail all\\PigeonMail\\messeng.txt";

    static void NICKNAME () {
        nick1 = nick;
    }
    public void messeng (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Сообщение: ");
        text = sc.nextLine();
        }
        Time t = new Time();
    public String toString() {
        return nick1 + ": " + text + " [" + t.time + "]";
    }
    public void messeng1() throws IOException {
        messeng();
        Database.txtSaveFile(m, toString());
        System.out.println(toString());
    }
}
