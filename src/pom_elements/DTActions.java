package pom_elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DTActions {

    //For order details
    public boolean findDTActiveStatus(List<WebElement> actions, WebDriver driver, String dtName){
        WebElement element = null;
        Boolean found = false;
        for(int i=0; i < actions.size() ;i++) {
            element = actions.get(i);
            if(element.getText().equals(dtName)){
                found = true;
                break;
            }else if(!DTActiveStatus(element) && element.getText().contains(dtName)){
                found = false;
                break;
            }
        }
        return found;
    }

    //for order details
    public boolean DTActiveStatus(WebElement element){
        String classes= element.getAttribute("class");
        Optional<String> classFindResult = Arrays.stream(classes.split(" ")).filter(el -> el.equals("_-sa-flipkart-src-Components-DT-DTButton-DTButton_isDisabled")).findFirst();
        return !classFindResult.isPresent();
    }

}
