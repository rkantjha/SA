package SA_UI;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom_elements.call_to_customer;
import pom_elements.discovery_and_authentication;
import pom_elements.order_details;
import pom_elements.DTActions;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import pom_elements.payment_details;
import pom_elements.address_detail;
import java.io.IOException;
import java.util.List;

public class case_2 {

    case_1 one = new case_1();
    XSSFWorkbook wb = ExcelData.bootstrap();
    DTActions dtActions = new DTActions();
    public case_2() throws IOException {
    }

    @BeforeTest
    public static void BeforeClass() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
    }

    @Test(priority = 1, enabled = true,groups="two")
    public void UiDataVerify() throws InterruptedException {
        one.login();

        synchronized (one.driver) {one.driver.wait(10000);}

        call_to_customer.new_session(one.wb, one.driver).click();

        synchronized (one.driver) { one.driver.wait(6000); }

        WebElement searchBox = discovery_and_authentication.search_box(one.wb, one.driver);

        searchBox.sendKeys(discovery_and_authentication.Order_IDs(one.wb, 1, 1, 1));
        searchBox.sendKeys(Keys.RETURN);

        synchronized (one.driver) {one.driver.wait(10000);}

        /* Name Verification */
        String user_name=discovery_and_authentication.name(one.wb, one.driver,2,21,1).getText();
        System.out.println(user_name + "   User name is verified ");
        Assert.assertEquals("Vivek Keshri", user_name);

        synchronized (one.driver) { one.driver.wait(5000); }

        /* Account ID verification */
        String account_id = discovery_and_authentication.account_id(one.wb, one.driver,2,25,1).getText();
        System.out.println(account_id + "  Account ID is verified");
        Assert.assertEquals("ACC13518860262177453", account_id);
        //email verification
        String email_id = discovery_and_authentication.email(one.wb, one.driver,2,23,1).getText();
        System.out.println(email_id + "  Email id is verified");
        Assert.assertEquals("vivekkeshri390@gmail.com", email_id);
        //phone number verification
        String phone_no = discovery_and_authentication.phone(one.wb, one.driver,2,22,1).getText();
        System.out.println(phone_no + "   Phone number is verified");
        Assert.assertEquals("+917091765088", phone_no);
        //order id verification
        String orders_id = discovery_and_authentication.orders_id(one.wb, one.driver).getText();
        System.out.println(orders_id + "    Order ID is verified");
        Assert.assertEquals("OD111401472227234000", orders_id);

        synchronized (one.driver) { one.driver.wait(5000); }

        /* payment button enable verification */
        boolean payment_button = discovery_and_authentication.payment_button(one.wb, one.driver).isEnabled();
        Assert.assertEquals(payment_button, true);
        //cart button enable verification
        boolean cart_button = discovery_and_authentication.cart_button(one.wb, one.driver).isEnabled();
        Assert.assertEquals(cart_button, true);
        //close session button enable verification
        boolean session_complete = discovery_and_authentication.complete_session(wb, one.driver).isEnabled();
        Assert.assertEquals(session_complete, true);

        synchronized (one.driver) { one.driver.wait(5000); }

        //Home button enable check
        boolean home_button = discovery_and_authentication.home(wb, one.driver,2,29,1).isEnabled();
        Assert.assertEquals(home_button, true);
        //yoda button enable check
        boolean yoda_button = discovery_and_authentication.yoda(wb, one.driver).isEnabled();
        Assert.assertEquals(yoda_button, true);
        //back to discovery enable check
        boolean back2_discovery_button = discovery_and_authentication.back_to_discovery(wb, one.driver).isEnabled();
        Assert.assertEquals(back2_discovery_button, true);
        //session navigator enable check
        boolean session_nav = discovery_and_authentication.session_navigator(wb, one.driver).isEnabled();
        Assert.assertEquals(session_nav, true);
        // Excalate issue enable check
        boolean excalate = discovery_and_authentication.excalate_issue(wb, one.driver).isEnabled();
        Assert.assertEquals(excalate, true);
        //Take a break enable check

        synchronized (one.driver) { one.driver.wait(5000); }

        boolean take_break = discovery_and_authentication.take_a_break(wb, one.driver).isEnabled();
        Assert.assertEquals(take_break, true);

        synchronized (one.driver) { one.driver.wait(5000); }

        //show selector button enable check
        boolean show_selector = discovery_and_authentication.show_selector(wb, one.driver).isEnabled();
        Assert.assertEquals(show_selector, true);
        //profile button enable check
        boolean profile = discovery_and_authentication.profile_button(wb, one.driver).isEnabled();
        Assert.assertEquals(profile, true);
        //logged in user name enable check

        discovery_and_authentication.profile_button(one.wb, one.driver).click();//open profile menu

        boolean logged_in_user = discovery_and_authentication.logged_in_user_name(wb, one.driver).isEnabled();
        Assert.assertEquals(logged_in_user, true);
        //account menu button enable check
        boolean account_info = discovery_and_authentication.account(wb, one.driver).isEnabled();
        Assert.assertEquals(account_info, true);
        //change password enable check
        boolean pass_change = discovery_and_authentication.change_password(wb, one.driver).isEnabled();
        Assert.assertEquals(pass_change, true);
        //logout button enable check
        boolean log_out = discovery_and_authentication.change_password(wb, one.driver).isEnabled();
        Assert.assertEquals(log_out, true);

        synchronized (one.driver) { one.driver.wait(5000); }

        //session enable yes-no button enable check
        boolean assign = discovery_and_authentication.assign_yes(wb, one.driver).isEnabled();
        Assert.assertEquals(assign, true);

        //When assign is active take a break should be disabled.
        if  (assign == true) {
            one.driver.navigate().refresh();

            synchronized (one.driver) { one.driver.wait(6000); }

            discovery_and_authentication.assign_yes(wb, one.driver).click();

            synchronized (one.driver) { one.driver.wait(5000); }

             boolean yes_on = discovery_and_authentication.break_dis(wb, one.driver).isEnabled();
            Assert.assertEquals(yes_on, true);
        }
        //click on assign to no from yes
        discovery_and_authentication.assign_to_no(wb, one.driver).click();
    }

    @Test(priority = 2, enabled = true,groups="two")
    public void order_details() throws InterruptedException
    {

        //order date verification
        String ordered_on = order_details.ordered_on(wb, one.driver,2,47,1).getText();
        System.out.println(ordered_on + "    date is verified ");
        Assert.assertEquals("28 Jan 18, 10:43 PM", ordered_on);
        //total price verification
        String tp = order_details.total_price(wb, one.driver,2,48,1).getText();
        System.out.println(tp + "  total price is verified");
        Assert.assertEquals("14599", tp);
        //channel name verification
        String cv = order_details.channel(wb, one.driver,2,49,1).getText();
        System.out.println(cv + "  is the name of the channel");
        Assert.assertEquals("AndroidApp", cv);

        /* Don't remove this wait */
        synchronized (one.driver) {one.driver.wait(5000); }

        //Getting DT Actions
         List<WebElement> actions = order_details.order_verification_dt(wb, one.driver);

        //order verification dt enable check (email profile)
        boolean ov_dt = dtActions.findDTActiveStatus(actions,one.driver,"Order Verification");
        Assert.assertEquals(ov_dt, false);

        //create incident dt verification enable check(email profile)
        boolean ci_dt =  dtActions.findDTActiveStatus(actions,one.driver,"Create Incident");
        Assert.assertEquals(ci_dt, false);

        //Price adjustment dt enable check(email profile)
        boolean pa_dt = dtActions.findDTActiveStatus(actions,one.driver,"Price Adjustment");
        Assert.assertEquals(pa_dt, false);
    }

    @Test(priority = 3, enabled = true,groups="two")//logic pending
    public void payment_details() throws InterruptedException {

            //click on payment detail tab
            synchronized (one.driver) { one.driver.wait(5000); }

            payment_details.payment_details_tab(wb, one.driver).click();

            synchronized (one.driver) { one.driver.wait(5000); }

            //selling price verification
            String s_price = payment_details.selling_price(wb, one.driver,2,54,1).getText();
            System.out.println(s_price + "    selling price is verified ");
            Assert.assertEquals("14599", s_price);

            /* Don't remove this wait */
            synchronized (one.driver) {one.driver.wait(8000);}

            List<WebElement> actions_1 = payment_details.payments_details_all_DT(wb,one.driver);

            boolean payments_and_refunds = dtActions.findDTActiveStatus(actions_1,one.driver,"Payments and Refunds");
            Assert.assertEquals(payments_and_refunds, false);

            boolean down_inv = dtActions.findDTActiveStatus(actions_1,one.driver,"Download Invoice");
            Assert.assertEquals(down_inv, true);

            boolean inv_req = dtActions.findDTActiveStatus(actions_1,one.driver,"Invoice Request");
            Assert.assertEquals(inv_req, false);

            boolean cre_inc = dtActions.findDTActiveStatus(actions_1,one.driver,"Create Incident");
            Assert.assertEquals(cre_inc, false);

    }
    @Test(priority=4,enabled=true,groups="two")
    public void  address_details()throws InterruptedException
    {   synchronized (one.driver) { one.driver.wait(5000); }
        //click on address details tab
        address_detail.click_address_details_tab(wb,one.driver).click();
        synchronized (one.driver) { one.driver.wait(5000); }
        String c_a=address_detail.current_address(wb,one.driver,2,63,1).getText();
        System.out.println(c_a);
        Assert.assertEquals(c_a,"Electronic City phase 1 , Konappana agrahara ,nanjuda reddy layout " +
                "near yellamma temple ,Hosur main road Bangalore");

        synchronized (one.driver) {one.driver.wait(8000);}

        List<WebElement> actions_2 = address_detail.address_verification_dt(wb,one.driver);

        boolean addr_chan = dtActions.findDTActiveStatus(actions_2,one.driver,"Address Change");
        Assert.assertEquals(addr_chan, false);

        boolean cre_in = dtActions.findDTActiveStatus(actions_2,one.driver,"Create Incident");
        Assert.assertEquals(addr_chan, false);
    }
    @AfterTest(enabled = false,groups="two")
    public void close_and_quit()throws InterruptedException
    {
        synchronized (one.driver) {one.driver.wait(8000);}

        discovery_and_authentication.close_session(one.wb, one.driver, 2, 67, 1).click();
        System.out.println(" Quitting the session ");
        one.driver.close();
        one.driver.quit();
    }
}
