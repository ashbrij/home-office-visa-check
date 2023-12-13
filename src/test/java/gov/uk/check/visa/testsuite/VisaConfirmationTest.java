package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Page Object project with page factory with extent report Create Smoke.xml(Test-1),
 * Sanity.xml(Test-1,3) and regression.xml(Test-1,2,3)
 * 1.anAustralianCominToUKForTourism().
 * Click on start button
 * Select a Nationality 'Australia'
 * Click on Continue button
 * Select reason 'Tourism'
 * Click on Continue button
 * verify result 'You will not need a visa to come to the UK'
 * <p>
 * 2.aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths().
 * Click on start button
 * Select a Nationality 'Chile'
 * Click on Continue button
 * Select reason 'Work, academic visit or business'
 * Click on Continue button
 * Select intendent to stay for 'longer than 6 months'
 * Click on Continue button
 * Select have planning to work for 'Health and care professional'
 * Click on Continue button
 * verify result 'You need a visa to work in health and care'
 * <p>
 * 3.aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card()
 * Click on start button
 * Select a Nationality 'Colombia'
 * Click on Continue button
 * Select reason 'Join partner or family for a long stay'
 * Click on Continue button
 * Select state My partner of family member have uk immigration status 'yes'
 * Click on Continue button
 * verify result 'You’ll need a visa to join your family or partner in the UK'
 */

@Listeners(CustomListeners.class)

public class VisaConfirmationTest extends BaseTest {
    //Declaration
    StartPage startPage;
    DurationOfStayPage durationOfStayPage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    SelectNationalityPage selectNationalityPage;
    WorkTypePage workTypePage;

    //Initialisation
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        startPage = new StartPage();
        durationOfStayPage = new DurationOfStayPage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
        reasonForTravelPage = new ReasonForTravelPage();
        resultPage = new ResultPage();
        selectNationalityPage = new SelectNationalityPage();
        workTypePage = new WorkTypePage();
    }

    @Test(groups = {"smoke", "sanity", "regression"})
    //1.anAustralianComingToUKForTourism().
    public void anAustralianComingToUKForTourism() {
        // *     Click on start button
        startPage.clickOnStartButton();

        // * 	Select a Nationality 'Australia'
        selectNationalityPage.selectNationality("Australia");
        selectNationalityPage.acceptCookies();

        // * 	Click on Continue button
        selectNationalityPage.clickOnContinueButton();

        // * 	Select reason 'Tourism'
        reasonForTravelPage.selectTheOptionTourismForReasonToTravel();

        // * 	Click on Continue button
        reasonForTravelPage.clickOnContinueButtonForReasonForTravelling();

        // * 	verify result 'You will not need a visa to come to the UK'
        resultPage.verifyResultMessageForAustralianPeople("You will not need a visa to come to the UK");

    }

    @Test(groups = {"regression"})
    // * 2.aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths().
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() {

        // * 	Click on start button
        startPage.clickOnStartButton();

        // * 	Select a Nationality 'Chile'
        selectNationalityPage.selectNationality("Chile");
        selectNationalityPage.acceptCookies();

        // * 	Click on Continue button
        selectNationalityPage.clickOnContinueButton();

        // * 	Select reason 'Work, academic visit or business'
        reasonForTravelPage.selectTheOptionForVisitWorkAcademicVisit();

        // * 	Click on Continue button
        reasonForTravelPage.clickOnContinueButtonForReasonForTravelling();

        // * 	Select intendent to stay for 'longer than 6 months'
        durationOfStayPage.clickOnRadioButtonForLongerThanSixMonth();

        // * 	Click on Continue button
        durationOfStayPage.clickOnContinueButtonForDurationOfStay();

        // * 	Select have planning to work for 'Health and care professional'
        workTypePage.selectHealthAndCareProvisionOption();

        // * 	Click on Continue button
        workTypePage.clickOnContinueButtonForHealthAndCare();

        // * 	verify result 'You need a visa to work in health and care'
        resultPage.verifyResultMessageForHealthAndCarePeople("You need a visa to work in health and care");

    }

    @Test(groups = {"sanity", "regression"})
    // * 3.aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card()
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card() {

        // * 	Click on start button
        startPage.clickOnStartButton();

        // * 	Select a Nationality 'Colombia'
        selectNationalityPage.selectNationality("Colombia");
        selectNationalityPage.acceptCookies();

        // * 	Click on Continue button
        selectNationalityPage.clickOnContinueButton();

        // * 	Select reason 'Join partner or family for a long stay'
        reasonForTravelPage.selectTheOptionForVisitJoinPartnerOrFamilyForALongStay();

        // * 	Click on Continue button
        reasonForTravelPage.clickOnContinueButtonForReasonForTravelling();

        // * 	Select state My partner of family member have uk immigration status 'yes'

        // * 	Click on Continue button

        // * 	verify result 'You’ll need a visa to join your family or partner in the UK'
        familyImmigrationStatusPage.verifyTheMessageThatYouMayNeedVisaToJoinFamilyOrPartner("You may need a visa");

    }

}
