package net.thucydides.showcase.cucumber.steps.serenity;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class HomePageSteps {

    @Steps
    public UISteps uiSteps;

    @Given("^I am on Sling Home Page$")
    public void I_am_on_Sling_Home_Page() throws Throwable {
        uiSteps.open_home_page();
    }

    @When("^I click on WATCH NOW 7 DAYS FREE button$")
    public void I_click_on_WATCH_NOW_DAYS_FREE_button() throws Throwable {
       uiSteps.click_on_watch_now_7_days_free_button();
    }

    @When("^I click on Offerdetails link$")
    public void I_click_on_Offerdetails_link() throws Throwable {
        uiSteps.click_on_offer_details_link();
    }

    @When("^I click on MEMBER SIGN IN link$")
    public void I_click_on_MEMBER_SIGN_IN_link() throws Throwable {
        uiSteps.click_on_member_signin_link();
    }

    @When("^I click on take back tv link$")
    public void I_click_on_take_back_tv_link() throws Throwable {
        uiSteps.click_on_take_back_TV_link();
    }

    @Then("^I should be redirected to Sling Home page$")
    public void I_should_be_redirected_to_Sling_Home_page() throws Throwable {
       uiSteps.redirect_to_home_page();
    }

    @Given("^I select twentyfiveplus channels option$")
    public void i_select_channels_option() throws Throwable {
        uiSteps.select_channels_option();
  
    }

    @Then("^I should see list of twentyfiveplus channels available$")
    public void i_should_see_list_of_channels_available() throws Throwable {
        uiSteps.should_see_list_of_channels_available();
    
    }

    @Given("^I select fourtyplus channel option$")
    public void i_select_channel_option() throws Throwable {
        uiSteps.i_select_channels_option();

    }

    @Then("^I should see list of fourtyplus channel available$")
    public void i_should_see_list_of_channel_available() throws Throwable {
        uiSteps.i_should_see_list_of_channels_available();

    }
   

}
