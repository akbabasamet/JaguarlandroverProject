package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import static pages.JaguarAPIPage.*;

public class JaguarAPIStepDefinitions {

    @Given("User goes base URL")
    public void user_goes_base_url() {
        goBaseUrl();
    }

    @Then("User sets the expected data")
    public void user_sets_the_expected_data() throws IOException {
        expectedData();

    }

    @When("User sends POST request to the URL")
    public void user_sends_post_request_to_the_url() {
        postReguest();
    }

    @And("Status code should be two hundred")
    public void statusCodeShouldBeTwoHundred() {
        statusCode();
    }


    @When("User asserts the expected data and actual data")
    public void user_asserts_the_expected_data_and_actual_data() throws IOException {
        assertion();
    }
}
