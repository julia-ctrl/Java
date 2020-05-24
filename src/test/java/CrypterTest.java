import org.junit.Assert;
import org.junit.Before;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class CrypterTest {

    private File file = new File("encryptDataTest.txt");




    @org.junit.Test
    public void writeEncryptDataToFile() {

        String dataToEncrypt="Hello,its test.";
        String  encryptData = Crypter.writeEncryptDataToFile(dataToEncrypt,file);

        Assert.assertNotEquals(encryptData,dataToEncrypt);


    }

    @org.junit.Test
    public void decryptDataFromFile() {

        String inputData="Hello.I am test.How are you?";
        String decryptDataFromFile;
       String encryptData =  Crypter.writeEncryptDataToFile(inputData,file);

        Assert.assertNotEquals(inputData,encryptData);

        decryptDataFromFile=Crypter.decryptDataFromFile(file);
        Assert.assertEquals(inputData,decryptDataFromFile);


    }
}