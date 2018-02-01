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
    public static WebElement home(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//IMG[@src='data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iaXNvLTg4NTktMSI/Pgo8IS0tIEdlbmVyYXRvcjogQWRvYmUgSWxsdXN0cmF0b3IgMTkuMC4wLCBTVkcgRXhwb3J0IFBsdWctSW4gLiBTVkcgVmVyc2lvbjogNi4wMCBCdWlsZCAwKSAgLS0+CjxzdmcgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIiB4bWxuczp4bGluaz0iaHR0cDovL3d3dy53My5vcmcvMTk5OS94bGluayIgdmVyc2lvbj0iMS4xIiBpZD0iQ2FwYV8xIiB4PSIwcHgiIHk9IjBweCIgdmlld0JveD0iMCAwIDMzIDMzIiBzdHlsZT0iZW5hYmxlLWJhY2tncm91bmQ6bmV3IDAgMCAzMyAzMzsiIHhtbDpzcGFjZT0icHJlc2VydmUiIHdpZHRoPSI1MTJweCIgaGVpZ2h0PSI1MTJweCI+CjxwYXRoIGQ9Ik0yNy42NDksMzNoLTcuMjE2Yy0wLjI3NiwwLTAuNS0wLjIyNC0wLjUtMC41VjIyLjMyaC02Ljg2N1YzMi41YzAsMC4yNzYtMC4yMjQsMC41LTAuNSwwLjVINS4zNDggIGMtMC4yNzYsMC0wLjUtMC4yMjQtMC41LTAuNVYxNS44OTNIMC43M2MtMC4yMDUsMC0wLjM4OS0wLjEyNS0wLjQ2NS0wLjMxNWMtMC4wNzUtMC4xOS0wLjAyNy0wLjQwNywwLjEyMS0wLjU0OEwxNi4xNTQsMC4xMzcgIGMwLjE5My0wLjE4MywwLjQ5NC0wLjE4MiwwLjY4OCwwbDE1Ljc3MiwxNC44OTNjMC4xNDgsMC4xNDEsMC4xOTYsMC4zNTgsMC4xMjEsMC41NDhjLTAuMDc2LDAuMTktMC4yNiwwLjMxNS0wLjQ2NSwwLjMxNWgtNC4xMjEgIFYzMi41QzI4LjE0OSwzMi43NzYsMjcuOTI1LDMzLDI3LjY0OSwzM3ogTTIwLjkzMywzMmg2LjIxNlYxNS4zOTNjMC0wLjI3NiwwLjIyNC0wLjUsMC41LTAuNWgzLjM2M0wxNi40OTgsMS4xODhMMS45ODgsMTQuODkzaDMuMzYgIGMwLjI3NiwwLDAuNSwwLjIyNCwwLjUsMC41VjMyaDYuMjE4VjIxLjgyYzAtMC4yNzYsMC4yMjQtMC41LDAuNS0wLjVoNy44NjdjMC4yNzYsMCwwLjUsMC4yMjQsMC41LDAuNVYzMnoiIGZpbGw9IiNGRkZGRkYiLz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPC9zdmc+Cg==']"));
        return element;
    }
    public static WebElement yoda(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//IMG[@src='data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iaXNvLTg4NTktMSI/Pgo8IS0tIEdlbmVyYXRvcjogQWRvYmUgSWxsdXN0cmF0b3IgMTkuMC4wLCBTVkcgRXhwb3J0IFBsdWctSW4gLiBTVkcgVmVyc2lvbjogNi4wMCBCdWlsZCAwKSAgLS0+CjxzdmcgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIiB4bWxuczp4bGluaz0iaHR0cDovL3d3dy53My5vcmcvMTk5OS94bGluayIgdmVyc2lvbj0iMS4xIiBpZD0iQ2FwYV8xIiB4PSIwcHgiIHk9IjBweCIgdmlld0JveD0iMCAwIDQ5MCA0OTAiIHN0eWxlPSJlbmFibGUtYmFja2dyb3VuZDpuZXcgMCAwIDQ5MCA0OTA7IiB4bWw6c3BhY2U9InByZXNlcnZlIiB3aWR0aD0iNTEycHgiIGhlaWdodD0iNTEycHgiPgo8cGF0aCBkPSJNNDg0LjM0LDMwLjA0OUM0NDUuNTksMTAuMTA5LDQwNC42MzIsMCwzNjIuNjI0LDBjLTQwLjUzLDAtODAuMDgzLDkuNDE0LTExNy42MTgsMjcuOTg1QzIwNy40NzEsOS40MTQsMTY3LjkxNywwLDEyNy4zNzcsMCAgQzg1LjM2OSwwLDQ0LjQxMSwxMC4xMDksNS42NjEsMzAuMDQ5QzIuMTc5LDMxLjgzNywwLDM1LjQxNiwwLDM5LjMydjQ0MC4yNTVjMC42NDQsMTAuNzc4LDEwLjc1NSwxMS41MzEsMTUuMTkxLDkuMjcgIGM3MS43MTMtMzYuNTQ0LDE1Mi44NS0zNi44MDUsMjI0LjM4MiwwYzEuNDk3LDAuNzczLDQuMjQ5LDEuMzAxLDUuMzQ3LDEuMTE2YzEuODc5LDAuMTM0LDMuNzktMC4yMjUsNS41MTctMS4xMTYgIGM3MS41NTQtMzYuODE2LDE1Mi44MTktMzYuODE2LDIyNC4zNzMsMGMxLjQ5NywwLjc3MywzLjEzNiwxLjE1NSw0Ljc2NCwxLjE1NWMxLjg4NCwwLDEwLjQyNi0xLjk2OCwxMC40MjYtMTAuNDI2VjM5LjMyICBDNDkwLDM1LjQxNiw0ODcuODIyLDMxLjgzNyw0ODQuMzQsMzAuMDQ5eiBNMjMzLjkxMyw0NjMuMDRjLTY4LjQxOC0zMC4yNTQtMTQ0LjY0NS0zMC4yNjMtMjEzLjA2MywwVjQ1Ljc2NSAgYzY4LjE4NC0zMy4wNjksMTQ0LjkxLTMzLjA1OCwyMTMuMDYzLDBWNDYzLjA0eiBNNDY5LjE0OSw0NjMuMDRjLTM0LjIwOC0xNS4xMjktNjkuOTY1LTIyLjc4Ni0xMDYuNTI1LTIyLjc4NiAgYy0zNi41NjEsMC03Mi4zMTgsNy42NTctMTA2LjUyNiwyMi43ODZWNDUuNzY1YzY4LjE3NC0zMy4wNjksMTQ0Ljg3OC0zMy4wNjksMjEzLjA1MSwwVjQ2My4wNHoiIGZpbGw9IiNGRkZGRkYiLz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPC9zdmc+Cg==']"));
        return element;
    }
    public static WebElement back_to_discovery(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//DIV[text()='Back to Discovery']"));
        return element;
    }
    public static WebElement session_navigator(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//DIV[@class='_-fk-cs-components-packages-sa-widgets-core-ContactBag-ContactBag_caretClass _-fk-cs-components-packages-sa-widgets-core-node_modules-fk-cs-dropdown-dropdown_caretButton']"));
        return element;
    }
    public static WebElement excalate_issue(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//IMG[@src='data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABQAAAATCAYAAACQjC21AAAAAXNSR0IArs4c6QAAAcJJREFUOBGd090rQ3Ecx/GdbRYTUyullGQt2Twku5HbeUjKtQsp5A9Q/gUPF0opRUmJCynJlRAuzKVk2Z24cONGSsrT5v1ZpuOcPfGt1875/c739933d36bw/HHSKVSPjhzLcv5INsCChnMj2JIzxm7UKH7TBRdkIUeFq2iDt2My7i6Mc/9MNfigwXa5hYUcSygHxE0YgXprgtWJTGEM2Qiyc0M5hDFLoLYRrVazho89PFgAlPwm5L0HgN4QgxejOAIfbZ3SKFKjPHwHLMwF2OYjhY+VbALe6jFHYI/HVIkwsQrNhBGvtDBKDdsGMY+az+5T8LtZFCCZQZqvw36tkKhEy+Fn7UhriquV/SgLTdjHOpW7+MGxUQVSfrp1GMdvThUkXeoXRVvhTptR6FQR1p7gDe42f6lilxjE4oBHOMet7jAKU6QwAsyoQ514l4KpaC89IT+QtpqFM9Qhx0IQFvSX8uDK8TRhE7oIGowSbFHrrmDL+iBNZasK0hogMs6bxuT5EYM5hi0JWaZsP2wlcMWPrgsWvK1xf8HrXmRMLW4Vky1rB1qIV3qRKdNRcwnbJr+fatjzxt0qHdXjp3vL8mb/wUG1QE3Zk17GQAAAABJRU5ErkJggg==']"));
        return element;
    }
    public static WebElement take_a_break(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/header/div[2]/div[2]/div/div/div/div[1]/div/div"));
        return element;
    }
    public static WebElement show_selector(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//SPAN[@class='_-sa-flipkart-src-Components-SelectorPanel-HiddenPanel-HiddenPanel_labelClass'][text()='Show selectors']"));
        return element;
    }
    public static WebElement profile_button(WebDriver driver)
    {
        element=driver.findElement(By.xpath("(//I[@class='fa fa-caret-down'])[2]"));
        return element;
    }
    public static WebElement logged_in_user_name(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//SPAN[@class='node_modules-fk-cs-dropdown-dropdown_options'][text()='rahul.kant']"));
        return element;
    }
    public static WebElement account(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//SPAN[@class='node_modules-fk-cs-dropdown-dropdown_options'][text()='Account']"));
        return element;
    }
    public static WebElement change_password(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//SPAN[@class='node_modules-fk-cs-dropdown-dropdown_options'][text()='Change Password']"));
        return element;
    }
    public static WebElement click_on_logout(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//SPAN[@class='node_modules-fk-cs-dropdown-dropdown_options'][text()='Logout']"));
        return element;
    }

}
