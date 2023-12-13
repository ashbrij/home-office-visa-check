package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * WorkTypePage - nextStepButton, selectJobtypeList locators and create methods
 * 'void selectJobType(String job)'
 *   and 'void clickNextStepButton()'
 */

public class WorkTypePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Health and care professional']")
    WebElement healthAndCareProvision;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButtonForHealthAndCareProvision;

    // * 	Select have planning to work for 'Health and care professional'
    public void selectHealthAndCareProvisionOption(){
        //waitUntilVisibilityOfElementLocated(healthAndCareProvision, 5);
        clickOnElement(healthAndCareProvision);
    }
    // * 	Click on Continue button
    public void clickOnContinueButtonForHealthAndCare(){
        clickOnElement(continueButtonForHealthAndCareProvision);
    }
}
