package stepDefinitions;

import io.cucumber.java.en.*;
import pages.JaguarUIPage;
import java.io.IOException;

import static pages.JaguarUIPage.*;


public class JaguarUIStepDefinition {

    JaguarUIPage jaguarPage = new JaguarUIPage();

    @Given("User goes to home page")
    public void user_goes_to_home_page() {
        jaguarPage.homepage();
    }

    @Then("User verifies that the homepage is displayed")
    public void user_verifies_that_the_homepage_is_displayed() throws IOException {
        jaguarPage.homepageIsDisplayed();
    }

    @Then("User verifies that the seven main headers are displayed at the top of the page")
    public void user_verifies_that_the_seven_main_headers_are_displayed_at_the_top_of_the_page() {
        jaguarPage.sevenMainHeadersDisplay();
    }

    @Then("User verifies that the seven main headers are clickable")
    public void user_verifies_that_the_seven_main_headers_are_clickable() {
        jaguarPage.sevenMainHeadersClickable();
    }

    @Then("User hover over the Brands&Services hoverable  menu")
    public void user_hover_over_the_brands_services_hoverable_menu() {
        jaguarPage.brandsServicesMenu();
    }

    @Then("User verifies that the options are clickable")
    public void user_verifies_that_the_options_are_clickable() {
        jaguarPage.brandServiceOptions();
    }

    @Then("User hover over the News&Media button")
    public void user_hover_over_the_news_media_button() {
        jaguarPage.newsMediaMenu();
    }

    @Then("User clicks on the Twitter button")
    public void user_clicks_on_the_twitter_button() {
        jaguarPage.clickTwitterButton();
    }

    @Then("User verifies that the twitter page is displayed")
    public void user_verifies_that_the_twitter_page_is_displayed() throws IOException {
        jaguarPage.twitterPageDisplayed();
    }

    @Then("User scroll down the page")
    public void user_scroll_down_the_page() {
        jaguarPage.scrollHomePage();
    }


    @Then("User clicks on the News header")
    public void user_clicks_on_the_news_header() {
        jaguarPage.clickNewsButton();
    }

    @Then("User verifies that new page is displayed")
    public void user_verifies_that_new_page_is_displayed() throws IOException {
        jaguarPage.newsPageDisplayed();
    }

    @Then("User scrolls to bottom of the home page")
    public void user_scrolls_to_bottom_of_the_home_page() {
        jaguarPage.scrollofBottomPage();
    }

    @Then("User clicks on the contact us button")
    public void user_clicks_on_the_contact_us_button() {
        jaguarPage.clickContactUsButton();
    }

    @Then("User verifies that the customer service number is displayed")
    public void user_verifies_that_the_customer_service_number_is_displayed() throws IOException {
        jaguarPage.customerInfoDisplayed();

    }

    @Then("User closes the browser")
    public void user_closes_the_browser() {
        jaguarPage.closeBrowser();
    }
}
