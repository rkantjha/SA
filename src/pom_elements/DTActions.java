package pom_elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DTActions {

    public boolean findDTElement(List<WebElement> actions, WebDriver driver, String dtName){
        WebElement element = null;
        Boolean found = false;
        for(int i=0; i < actions.size() ;i++) {
            element = actions.get(i);
            if(!DTActiveStatus(element)) {
                if(dtName==element.getText()) {
                    found = true;
                }
            }
        }
        return found;
    }
    public boolean DTActiveStatus(WebElement element){
        String classes= element.getAttribute("class");
        Optional<String> classFindResult = Arrays.stream(classes.split(" ")).filter(el -> el.equals("_-sa-flipkart-src-Components-DT-DTButton-DTButton_info")).findFirst();
        if(classFindResult.isPresent()){
            return false;
        }
        return true;
    }
}
