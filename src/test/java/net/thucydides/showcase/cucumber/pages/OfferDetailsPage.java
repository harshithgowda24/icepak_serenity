package net.thucydides.showcase.cucumber.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static org.junit.Assert.*;


public class OfferDetailsPage extends PageObject {

    @FindBy(how = How.ID, using = "offer-details")
    private static WebElement offerDetails =null;

    @FindBy(how = How.XPATH, using = "//h1[contains(.,'Free Trial Offer Details')]")
    private static WebElement freeTrial =null;


    public void verify_Offer_Details_text() {

       // assertEquals("https://d-ottweb.movetv.com/offer-details",getDriver().getCurrentUrl());
        assertNotNull(offerDetails);
        assertEquals("Free Trial Offer Details",freeTrial.getText());
    }
}
