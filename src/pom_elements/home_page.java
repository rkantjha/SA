package pom_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
public class home_page {

    public static String yoda_url="http://10.85.52.152/flipkart/#/yoda";

    public static WebElement element=null;

    public static List<WebElement> yoda_notifications(WebDriver driver) {
        List<WebElement> elements = driver.findElements(By.xpath("/html/body/div[1]/div/div[5]/div[1]/div[2]/div/div/div[2]"));
        return elements;
    }
    public static WebElement proceed_to_sa(WebDriver driver)
    {
        element=driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/div/div/div[2]/div[2]/div"));
        return element;
    }
}
