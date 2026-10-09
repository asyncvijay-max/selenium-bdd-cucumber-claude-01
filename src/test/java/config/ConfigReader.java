package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    //Singleton approach
    //Object of ConfigReader is created when the Class Loads
    //final since it cannot be changed.
    private static final ConfigReader configReader = new ConfigReader();
    private final Properties properties = new Properties();


    //private constructor
    private ConfigReader()
    {
        // mvn test -Denv=uat
        // if not mentioned ,e.g. mvn test ( then qa will be the default)
        String env = System.getProperty("env","qa");
        String filePath = "config/" + env + ".properties";


        try(InputStream in = getClass().getClassLoader().getResourceAsStream(filePath);)
        {
            if(in == null){
                throw new RuntimeException("Config file not found: " +filePath);
            }

            properties.load(in);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static ConfigReader getConfigReader()
    {
        return configReader;
    }

    public String getBaseUrl()  {

        String url =  properties.getProperty("baseUrl");

        if(url == null)
        {
            throw new RuntimeException("Missing config value");
        }

        return url;

    }

    // PASSWORD never store in properties file.(IMP). Set it as environment variable

    // Password comes only from an environment variable
    public String getPassword() {
        String pwd = System.getenv("APP_PASSWORD");
        if (pwd == null) {
            throw new RuntimeException("Set the APP_PASSWORD environment variable");
        }
        return pwd;
    }


}
