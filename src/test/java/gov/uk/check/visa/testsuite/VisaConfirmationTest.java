package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VisaConfirmationTest extends TestBase {
    StartPage startPage;
    SelectNationalityPage selectNationalityPage;
    WorkTypePage workTypePage;
    ReasonForTravelPage reasonForTravelPage;
    Tourisum tourisum;
    ResultPage resultPage;
    DurationOfStayPage durationOfStayPage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;

    @BeforeMethod(alwaysRun=true)
    public void inIt() {
        startPage = new StartPage();
        selectNationalityPage = new SelectNationalityPage();
        workTypePage = new WorkTypePage();
        reasonForTravelPage = new ReasonForTravelPage();
        tourisum = new Tourisum();
        resultPage = new ResultPage();
        durationOfStayPage = new DurationOfStayPage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void anAustralianCominToUKForTourism() {
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Australia");
        selectNationalityPage.clickOnCountinuButton();
        reasonForTravelPage.selectReasonForVisit("Tourist");
        reasonForTravelPage.clickOnCountinuButton();
        resultPage.confirmResultMessage("You will not need a visa to come to the UK");

    }
    @Test(groups = {"smoke","regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() throws InterruptedException {
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Chile");
        selectNationalityPage.clickOnCountinuButton();
        Thread.sleep(1000);
        reasonForTravelPage.selectReasonForVisit("workacademicvisitbusiness");
        reasonForTravelPage.clickOnCountinuButton();
        durationOfStayPage.selectLongerThan6Months();
        durationOfStayPage.clickOnCountinuButton();
        workTypePage.selectJobType("Health and care professional");
        workTypePage.clickoncountinu();
        resultPage.confirmResultMessage("You need a visa to work in health and care");

    }
    @Test(groups={"regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
    startPage.clickStartNow();
    selectNationalityPage.selectNationality("Colombia");
    selectNationalityPage.clickOnCountinuButton();
    reasonForTravelPage.selectReasonForVisit("joinpartnerorfamilyforalongstay");
    reasonForTravelPage.clickOnCountinuButton();
    familyImmigrationStatusPage.clickOnYes();
    familyImmigrationStatusPage.clickOnCountinu();
    resultPage.confirmResultMessage("You’ll need a visa to join your family or partner in the UK");
}

}
