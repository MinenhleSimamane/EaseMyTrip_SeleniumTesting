package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {
    protected Properties properties;
    public WebDriver driver;
    public Base() {
        loadConfigProperties();
    }
    private void loadConfigProperties() {
        try {
            properties = new Properties();
            FileInputStream configFile = new FileInputStream("src/main/java/config/properties/config.properties");
            properties.load(configFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //method for accessing the property file
    public String getTest(String key){
        return properties.getProperty(key);
    }



    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.easemytrip.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }


    public void closeSetUp() {
        driver.close();
    }



}
