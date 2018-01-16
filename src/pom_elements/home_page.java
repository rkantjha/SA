package pom_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class home_page {

public static String yoda_url="http://10.85.52.152/flipkart/#/yoda";

public static WebElement element=null;

public static WebElement yoda_notifications_1(WebDriver driver) {
    element=driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/div/div/div[3]/div[1]/span"));
    return element;
}
public static WebElement yoda_notification_2(WebDriver driver){
    element=driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/div/div/div[3]/div[2]/span"));
    return element;
}
public static WebElement yoda_notifications_3(WebDriver driver)
{
    element=driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/div/div/div[3]/div[3]/span"));
    return element;
}
public static WebElement yoda_notifications_4(WebDriver driver)
{
    element=driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/div/div/div[3]/div[4]/span"));
    return element;
}
public static WebElement yoda_notifications_5(WebDriver driver)
{
    element=driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/div/div/div[3]/div[5]/span"));
    return element;
}
public static WebElement yoda_notifications_6(WebDriver driver) {
    element = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/div/div/div[3]/div[6]/span"));
    return element;
}
public static WebElement yoda_notifications_7(WebDriver driver) {
    element = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/div/div/div[3]/div[7]/span"));
    return element;
}
public static WebElement yoda_notifications_8(WebDriver driver)
{
    element=driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/div/div/div[3]/div[8]/span"));
    return element;
}
public static WebElement yoda_notifications_9(WebDriver driver)
{
    element=driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/div/div/div[3]/div[9]/span"));
    return element;
}
public static WebElement yoda_notifications_10(WebDriver driver)
{
    element=driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/div/div/div[3]/div[10]/span"));
    return element;
}


}
