import java.io.*;

public class Database {
    public static String users = "C:\\Users\\John Kapika\\YandexDisk\\Учёба\\Java\\PigeonMail all\\PigeonMail\\users.txt";
    // метод сохраняет текстовый файл (txt) по адресу: address
    public static void txtSaveFile (String address, String txt) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(address,true);
        String greetings = txt + "\r\n";
        fileOutputStream.write(greetings.getBytes());
        fileOutputStream.close();
    }
    public static void txtSaveNewValueFile (String address, String txt) throws IOException {
            BufferedWriter writer = new BufferedWriter(new FileWriter(address));
            writer.write(txt);
            writer.close();
    }
    public static String txtOpenFile (String address){
        String txt = "";
        try(FileReader reader = new FileReader(address))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);

                txt = txt + String.valueOf((char)c);
            }
        }
        catch(NumberFormatException | IOException ex){

            System.out.println(ex.getMessage());
        }
        return txt;
    }
}