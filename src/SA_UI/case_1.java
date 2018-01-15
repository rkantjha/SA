package SA_UI;

import javafx.scene.layout.Priority;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom_elements.login_page;



public class case_1 {
    WebDriver driver = new FirefoxDriver();

    @BeforeTest
    public static void start(){
        System.setProperty("\"webdriver.gecko.driver\", \"/usr/local/bin/geckodriver\"", null);

    }

    @Test(priority = 1,alwaysRun = true)
    public void before_class()
    {

    }
}
