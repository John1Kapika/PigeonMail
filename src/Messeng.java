import java.io.FileNotFoundException;
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
        String encryptMesseng;
        try {
            Encryptor enc = new Encryptor(
                    "C:\\Users\\John Kapika\\YandexDisk\\Учёба\\Java\\PigeonMail all\\PigeonMail\\public.key",
                    "C:\\Users\\John Kapika\\YandexDisk\\Учёба\\Java\\PigeonMail all\\PigeonMail\\private.key",
                    "RealJohnKapika3115");
            encryptMesseng = enc.encrypt(nick1 + ": " + text + " [" + t.time + "]");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return encryptMesseng;
    }
    public void messeng1() throws IOException {
        Encryptor enc = new Encryptor(
                "C:\\Users\\John Kapika\\YandexDisk\\Учёба\\Java\\PigeonMail all\\PigeonMail\\public.key",
                "C:\\Users\\John Kapika\\YandexDisk\\Учёба\\Java\\PigeonMail all\\PigeonMail\\private.key",
                "RealJohnKapika3115");
        messeng();
        Database.txtSaveFile(m, enc.decrypted(toString()));
        System.out.println(enc.decrypted(toString()));
    }
}
