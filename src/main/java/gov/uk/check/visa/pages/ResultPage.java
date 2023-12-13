package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * ResultPage - resultMessage locator and create methods
 * 'String getResultMessage()' and 'void confirmResultMessage(String expectedMessage)'
 * (Note Use Assert.assertTrue)
 */

public class ResultPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement resultMessage;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You need a visa to work in health and care']")
    WebElement resultMessageForHealthAndCare;


    // * 	verify result 'You will not need a visa to come to the UK'
    public void verifyResultMessageForAustralianPeople(String text){
        verifyThatTextIsDisplayed(resultMessage, text);
    }

    // * 	verify result 'You need a visa to work in health and care'
    public void verifyResultMessageForHealthAndCarePeople(String text){
        verifyThatTextIsDisplayed(resultMessageForHealthAndCare, text);
    }
}
