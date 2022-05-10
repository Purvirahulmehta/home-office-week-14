package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ReasonForTravelPage extends Utility {
    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }
//    - nextStepButton, reasonForVisitList locators and create methods
//'void selectReasonForVisit(String reason)'
//    and 'void clickNextStepButton()'
@FindBy(xpath = "//input[@id='response-0']")
    WebElement tourismvisitingfamilyandfriends;
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement workacademicvisitbusiness;
    @FindBy(xpath ="//input[@id='response-4']")
    WebElement joinpartnerorfamilyforalongstay;
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement countinuReasonForTravelPageButton;
    public void selectReasonForVisit(String reason){
        if(reason=="Tourist"){
            clickOnElement(tourismvisitingfamilyandfriends);
        }
        if(reason=="workacademicvisitbusiness"){
            clickOnElement(workacademicvisitbusiness);
        }
        if(reason=="joinpartnerorfamilyforalongstay"){
            clickOnElement(joinpartnerorfamilyforalongstay);
        }
    }
    public void clickOnCountinuButton(){
        Reporter.log("Clicking on CountinuButton"+ countinuReasonForTravelPageButton.toString()+ "<br>");
        clickOnElement(countinuReasonForTravelPageButton);
    }
}
