package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {
    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }
//    -nationalityDropDownList, nextStepButton locators and create
//    methods 'void selectNationality(String nationality)'
//    and 'void clickNextStepButton()'
@FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDown;
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement countinueButtonNationality;
    public void selectNationality(String nationality){
        Reporter.log("Selecting Nationality"+nationality+" from dropdown "+nationalityDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(nationalityDropDown,nationality);
    }
    public void clickOnCountinuButton(){
        Reporter.log("Clicking on CountinuButton"+ countinueButtonNationality.toString()+ "<br>");
        clickOnElement(countinueButtonNationality);
    }
}
