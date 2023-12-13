package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * ReasonForTravelPage - nextStepButton, reasonForVisitList locators and create methods
 * 'void selectReasonForVisit(String reason)'
 *   and  'void clickNextStepButton()'
 */

public class ReasonForTravelPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Tourism or visiting family and friends']")
    WebElement reasonForTourism;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButtonForReason;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Work, academic visit or business']")
    WebElement reasonForVisitWorkAcademicVisit;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Join partner or family for a long stay']")
    WebElement reasonForVisitJoinPartnerOrFamily;


    // * 	Select reason 'Tourism'
    public void selectTheOptionTourismForReasonToTravel(){
        clickOnElement(reasonForTourism);
    }
    // * 	Click on Continue button
    public void clickOnContinueButtonForReasonForTravelling(){
        clickOnElement(continueButtonForReason);
    }
    // * 	Select reason 'Work, academic visit or business'
    public void selectTheOptionForVisitWorkAcademicVisit(){
        clickOnElement(reasonForVisitWorkAcademicVisit);
    }

    // * 	Select reason 'Join partner or family for a long stay'
    public void selectTheOptionForVisitJoinPartnerOrFamilyForALongStay(){
        clickOnElement(reasonForVisitJoinPartnerOrFamily);
    }

}
