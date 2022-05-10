package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Tourisum extends Utility {
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement youWillNotNeedAVisaToComeToTheUK;
    public String verifyMessage(){
        Reporter.log("getting verifyMessage text from "+youWillNotNeedAVisaToComeToTheUK.toString()+"<br>");
        return getTextFromElement(youWillNotNeedAVisaToComeToTheUK);
    }
}
