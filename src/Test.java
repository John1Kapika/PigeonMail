public class Test {
    public static void main(String[] args) throws Exception {
        String stringToEncrypt = "У нас получилось!";
        Encryptor enc = new Encryptor(
                "C:\\Users\\John Kapika\\Documents\\Primer1Maks\\src\\public.key",
                "C:\\Users\\John Kapika\\Documents\\Primer1Maks\\src\\private.key",
                "johnkapika");

        String encryptedMessage = enc.encryptPGP(stringToEncrypt);
        System.out.println(encryptedMessage);
        System.out.println(enc.decryptedPGP(encryptedMessage));
    }
}
