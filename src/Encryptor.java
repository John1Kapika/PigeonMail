import com.didisoft.pgp.PGPException;
import com.didisoft.pgp.PGPLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Encryptor {
    private static String publicKey = "";
    private static String privateKey = "";
    private static String privateKeyPassword = "";
    private static PGPLib pgp = new PGPLib();
    private static InputStream publicEncryptionKeyStream = null;
    public Encryptor (String publicKeyPath, String privateKeyPath, String privateKeyPass) throws FileNotFoundException{
        publicKey = publicKeyPath;
        privateKey = privateKeyPath;
        privateKeyPassword = privateKeyPass;
    }
    public static String encryptPGP(String stringToEncrypt) throws Exception {
        try {
            publicEncryptionKeyStream = new FileInputStream(publicKey);
            return pgp.encryptString(stringToEncrypt, publicEncryptionKeyStream);
        } catch (PGPException e) {
            System.out.println("Во время шифрования возникло некоторое исключение");
        } finally {
            if (publicEncryptionKeyStream != null) {
                publicEncryptionKeyStream.close();
            }
        }
        return null;
    }
    public static String decryptedPGP(String encryptedMessage) throws PGPException, IOException {
        try {
            return pgp.decryptString(encryptedMessage,
                    privateKey,
                    privateKeyPassword);
        }
        catch (PGPException e) {
            System.out.println("Во время шифрования возникло некоторое исключение");
            e.printStackTrace();
        }
        return null;
    }
}
