public class Test {
    public static void main(String[] args) throws Exception {
        String stringToEncrypt = "У нас получилось!";
        Encryptor enc = new Encryptor(
                "C:\\Users\\John Kapika\\YandexDisk\\Учёба\\Java\\PigeonMail all\\PigeonMail\\public.key",
                "C:\\Users\\John Kapika\\YandexDisk\\Учёба\\Java\\PigeonMail all\\PigeonMail\\private.key",
                "RealJohnKapika3115");

        String encryptedMessage = enc.encrypt(stringToEncrypt);
        System.out.println(encryptedMessage);
        System.out.println(enc.decrypted(encryptedMessage));
    }
}
