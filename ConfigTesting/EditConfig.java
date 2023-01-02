package ConfigTesting;

import java.io.*;
import java.util.Properties;

public class EditConfig {

    public static void main(String[] args) {
        try {
            String configFilePath = "C:\\Vihaan\\Java Examples\\ConfigTesting\\config.properties";
            FileInputStream propsInput = new FileInputStream(configFilePath);
            Properties prop = new Properties();
            prop.load(propsInput);

            prop.setProperty("DB_USER", "test");

            prop.store(new FileOutputStream(configFilePath),null);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}