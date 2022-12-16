import com.didisoft.pgp.PGPException;
import com.didisoft.pgp.PGPLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

class Encryptor {

    private String publicKey = "";
    private String privateKey = "";
    private String privateKeyPassword = "";
    private PGPLib pgp = new PGPLib();
    private InputStream publicEncryptionKeyStream = null;

    public Encryptor(String publicKeyPath, String privateKeyPath, String privateKeyPass) throws FileNotFoundException {

        publicKey = publicKeyPath;
        privateKey = privateKeyPath;
        privateKeyPassword = privateKeyPass;
    }

    public String encrypt(String message) throws IOException {
        try {
            publicEncryptionKeyStream = new FileInputStream(publicKey);
            return pgp.encryptString(message, publicEncryptionKeyStream);
        } catch (PGPException e) {
            System.out.println("Some exception occured during the encryption");
        } finally {
            if (publicEncryptionKeyStream != null) {
                publicEncryptionKeyStream.close();
            }
        }
        return null;
    }

    public String decrypted(String encryptedMessage) throws IOException {
        try {
            return pgp.decryptString(encryptedMessage,
                    privateKey,
                    privateKeyPassword);
        }
        catch (PGPException e) {
            System.out.println("В процессе шифрования возникла ошибка.");
            e.printStackTrace();
        }
        return null;
    }
}
