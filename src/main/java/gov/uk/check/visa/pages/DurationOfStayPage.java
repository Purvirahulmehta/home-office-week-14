package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.security.cert.X509Certificate;

public class DurationOfStayPage extends Utility {
    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement longerthen6months;
    @FindBy(xpath ="//button[contains(text(),'Continue')]")
    WebElement clickOnCountinuButton;
    public void selectLongerThan6Months(){
        Reporter.log("Clicking on LongerThan6Months"+ longerthen6months.toString()+ "<br>");
        clickOnElement(longerthen6months);
    }
    public void clickOnCountinuButton(){
        Reporter.log("Clicking on CountinuButton"+ clickOnCountinuButton.toString()+ "<br>");
        clickOnElement(clickOnCountinuButton);
    }
}
