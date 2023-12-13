package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * DurationOfStayPage - nextStepButton, lessThanSixMonths, moreThanSixMonths locators and create methods
 *   'void selectLengthOfStay(String moreOrLess)' (Note: use switch statement for select moreOrLess stay) and
 *   'void clickNextStepButton()'
 */

public class DurationOfStayPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='longer than 6 months']")
    WebElement durationOfStay;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement durationOfStayContinueButton;

    // * 	Select intendent to stay for 'longer than 6 months'
    public void clickOnRadioButtonForLongerThanSixMonth(){
        clickOnElement(durationOfStay);
    }

    // * 	Click on Continue button
    public void clickOnContinueButtonForDurationOfStay(){
        clickOnElement(durationOfStayContinueButton);
    }
}
