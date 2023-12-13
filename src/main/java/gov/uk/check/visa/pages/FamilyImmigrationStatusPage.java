package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * FamilyImmigrationStatusPage - nextStepButton, yes, no locators and create methods
 * 'void selectImmigrationStatus(String status)'
 *   (Note: Use switch statement for select immigration status) and 'void clickNextStepButton()'
 */


public class FamilyImmigrationStatusPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You may need a visa']")
    WebElement mayNeedVisa;

    public void verifyTheMessageThatYouMayNeedVisaToJoinFamilyOrPartner(String text) {
      verifyThatTextIsDisplayed(mayNeedVisa, text);
    }
}
