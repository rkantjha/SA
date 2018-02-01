package pom_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class discovery_and_authentication {

    public static WebElement  element =null;
    public static String order_id_1="OD111401472227234000";//incident,return,replacement
    public static String order_id_2="OD111401472227234000";//services
    public static String order_id_3="OD110285698905463000";//refund
    public static String account_id="ACC13518860262177453";//refund

    public static WebElement search_box(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//INPUT[@type='text']"));
        return element;
    }
    public static WebElement name(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//SPAN[@class='_-fk-cs-components-packages-sa-widgets-core-CurrentIssue-CurrentIssue_userName'][text()='Vivek keshri']"));
        return element;
    }
    public static WebElement phone(WebDriver driver)
    {
        element=driver.findElement(By.xpath("(//DIV[@class='_-sa-flipkart-src-Components-CustomerCard-CustomerCardList-CustomerCardList_column'])[2]"));
        return element;
    }
    public static WebElement email(WebDriver driver)
    {
        element=driver.findElement(By.xpath("(//DIV[@class='_-sa-flipkart-src-Components-CustomerCard-CustomerCardList-CustomerCardList_column'])[3]"));
        return element;
    }
    public static WebElement orders_id(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//DIV[@class='_-fk-cs-components-packages-sa-widgets-core-RouteChain-RouteChain_text']"));
        return element;
    }
    public static WebElement incident_no(WebDriver driver)
    {
        element=driver.findElement(By.xpath(""));
        return element;
    }
    public static WebElement returns_no(WebDriver driver)
    {
        element=driver.findElement(By.xpath(""));
        return element;
    }
    public static WebElement replacement_no(WebDriver driver)
    {
        element=driver.findElement(By.xpath(""));
        return element;
    }
    public static WebElement account_id(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//SPAN[@title='Customer Id'][text()='ACC13518860262177453']"));
        return element;
    }
    public static WebElement payment_button(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//IMG[@src='data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAOCAYAAAAmL5yKAAAAt0lEQVR4AWNgYGhgYqi+asNQedmHaFxz1Ykhdxs7AxhUXXFnrL76j6nm6n9SMNDSNKgBVxNAAqTjy20wF8ThUwh03UGgk9OBNuagYTOiDGCouuTJVH1lKmP1ldOMNVfPgGgoPslQddGICAMuhzHWXHmOXe5qAlEGAG17wVR9dRVD9eVYoGE/YXIgPsUG0MMLiEBEwTVXT8ACkXA0Vl/OwBmNlCekmqseIAFykzJqZqq67E0Io2cmAA27vEtCzWu1AAAAAElFTkSuQmCC']"));
        return element;
    }
    public static WebElement cart_button(WebDriver driver)
    {
        element=driver.findElement(By.xpath("(//DIV[@class='_-fk-cs-components-packages-sa-widgets-core-Icon-Icon_icon'])[2]"));
        return element;
    }
    public static WebElement complete_session(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//IMG[@src='data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAkCAYAAADPRbkKAAACw0lEQVR4AdWYA8ycTRDH79s9fbbt76tt22ZcxCniYueytR3UQd2oCqqgtndOr83aevpujcMzx+edZILD5PdfDWxWt58W5r9vBzWLCTxf5Vc5qEMccLStOphben9joLxMKONt56C2Whr+A+n7gYHKfAUdUsRIS8J/NDP4NQOFGjKyADxiOfjPZPZnDPCMBozqgNcsBf/tvJIP9aqagtcOSlkG/jeZ7eZC7TcLr93uwYWWgG+4wnBwwF0UeAYq/wsZ/CTt8IO3GpwDbiHAa7/slL46aYc3DOM9LtRaGjxed0h/E5sVjINaRoS/bZfYxhLwdo+aSTzz9+web9eogb+WZR/prU0mPAM1iQj/gAvsF/EJs4N3BgNV+vwPt7hQ69+XwZ+SAD+WBo+PuMc7PGzAmtJw6govjPJShwzUS+CZH8kEPiac+cdRK08mvBOjBKlwgL9u3PAeHKpXk3hpx5nZUjSxjeXxvLtceHsxoe4Tz/0kU8H102QqoBYB3toxvDYdmcC7FHj9QlEuVSZhS8ucEmuZhpfeFkyomxR4LtRS2goBziFubakTVM1ocR2g6usWkAQPuIb8hH81x/cxAwyQRchgjXAx9Xf6yBHhN0lpsNh6z+n4KwPMJhZUJU4R+P+dWDLwBwMspMGr7e2kYacwhxYhMIe4E8VO6f/vRQyd+KgLwQH3/LU06ErcFIAqQmCRS/j+/UhmfMMAfcQLe/AHWfRBMkYZuVQRVX6ReGxOJK0hcU/z/U4XQXDAC5/I/C8SCh3yMgqVlwR4/4czsr4loMQpAlR+AuGziRVu/OaaFvwzISIAC/WC2NJhLpnxFxNYELsALAuRM6qJCFBXCD1FkkUI/JuUZUHdcEhsZrOSuaT3H3Mi9ATB2y5VXHQRAosiTRC4R3VPGyBhJ86EurAWXfnQAwEGOF6XwlqMHXCRLgpTyfAE9DK4NS4pB8IAAAAASUVORK5CYII=']"));
        return element;
    }




}
