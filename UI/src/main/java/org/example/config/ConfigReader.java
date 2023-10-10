package org.example.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;   // to import config data from java util (config.properties)

    static {    // static block - to keep config data
        try {
            String path = "C:\\Users\\User\\IdeaProjects\\SummerSDET2023\\UI\\src\\main\\resources\\config.properties";
            FileInputStream inputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static String getProperty(String key)    // this getProperty is a method
    {
        return properties.getProperty(key).trim();  // this getProperty is on object
    }

    public static void main(String[] args) {
        System.out.println(getProperty("browser"));
    }
}
