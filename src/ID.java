import java.io.IOException;

public class ID {
    public static String addressID = "C:\\Users\\John Kapika\\YandexDisk\\Учёба\\Java\\PigeonMail all\\PigeonMail\\id.txt";
    public static String userID = null;
    public static int userNewID;
    private static final int one = 1;
    public static int ID () throws IOException {
        userID = Database.txtOpenFile(addressID);
        userNewID = Integer.parseInt(userID) + one;
        Database.txtSaveNewValueFile(addressID, String.valueOf(userNewID));
        return userNewID;
    }
}
