package ConfigTesting;

import java.io.*;
import java.util.Properties;

public class ReadConfig {

    public static void main(String[] args) {
        try {
            String configFilePath = "ConfigTesting\\config.properties";
            FileInputStream propsInput = new FileInputStream(configFilePath);
            Properties prop = new Properties();
            prop.load(propsInput);

            System.out.println(prop.getProperty("DB_USER"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}