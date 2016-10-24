package net.thucydides.showcase.cucumber.pages;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static org.junit.Assert.*;


public class SubscriptionPage extends PageObject{

    @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Sign Out")
    private static WebElement userAccount =null;

    // @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Your Subscription")
    // private static WebElement subscription =null;


    public void assertuserOnSubscriptionPage() {
        assertNotNull(userAccount);
        // assertNotNull(subscription);

    }
}
