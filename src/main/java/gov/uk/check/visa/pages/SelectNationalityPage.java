package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * SelectNationalityPage -nationalityDropDownList, nextStepButton locators and create methods
 * 'void selectNationality(String nationality)'
 *   and 'void clickNextStepButton()'
 */

public class SelectNationalityPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement selectNationality;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(), 'Accept additional cookies')]")
    WebElement acceptCookies;
    @CacheLookup
    @FindBy(css = "button[class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement continueButton;


    // * 	Select a Nationality 'Australia'
    public void selectNationality(String option) {
        //given explicit wait
        //waitUntilVisibilityOfElementLocated(selectNationality, 5);
        selectByVisibleTextFromDropDown(selectNationality, option);
    }
    // * 	Click on acceptCookies
    public void acceptCookies(){
        clickOnElement(acceptCookies);
    }
    // * 	Click on Continue button
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
}
