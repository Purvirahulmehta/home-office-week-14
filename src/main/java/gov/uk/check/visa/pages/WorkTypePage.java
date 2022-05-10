package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.security.cert.X509Certificate;

public class WorkTypePage extends Utility {
    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }

@FindBy(xpath = "//input[@id='response-0']")
    WebElement healthandcareprofessional;
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement digitaltechnologyprofessional;
    @FindBy(xpath = "//input[@id='response-2']")
    WebElement academicorresearcher;
    @FindBy(xpath = "//input[@id='response-3']")
    WebElement workinartsorculture;
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement professionalsportsperson;
    @FindBy(xpath = "//input[@id='response-5']")
    WebElement religiousworker;
    @FindBy(xpath = "//input[@id='response-6']")
    WebElement iwanttostartabusiness;
    @FindBy(xpath = "//input[@id='response-7']")
    WebElement iwanttodoanothertypeofjobshowmeotherworkvisas;
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement clickOnCountinu;
    public void selectJobType(String job){
        switch (job) {
            case "Health and care professional":
                clickOnElement(healthandcareprofessional);
                break;
            case "Digital technology professional":
                clickOnElement(digitaltechnologyprofessional);
                break;
            case "Academic or researcher":
                clickOnElement(academicorresearcher);
                break;
            case "Work in arts or culture":
                clickOnElement(workinartsorculture);
                break;
            case "Professional sports person":
                clickOnElement(professionalsportsperson);
                break;
            case "Religious worker":
                clickOnElement(religiousworker);
                break;
            case "Iwantto start business":
                clickOnElement(iwanttodoanothertypeofjobshowmeotherworkvisas);
                break;
            case "Iwanttodoanothertypeofjobshowmeotherworkvisas":
                clickOnElement(iwanttodoanothertypeofjobshowmeotherworkvisas);
                break;
        }

    }
    public void clickoncountinu(){
        Reporter.log("Clicking on clickoncountinu"+ clickOnCountinu.toString()+ "<br>");
        clickOnElement(clickOnCountinu);
    }

}
