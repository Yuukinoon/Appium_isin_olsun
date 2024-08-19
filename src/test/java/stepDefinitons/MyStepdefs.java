package stepDefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("the user open the application with android {int}")
    public void theUserOpenTheApplicationWithAndroid(int arg0) {
    }

    @When("the user clicks the {string} button")
    public void theUserClicksTheButton(String arg0) {
    }

    @And("the user clicks the search button")
    public void theUserClicksTheSearchButton() {
    }

    @And("the user search for {string} jobs")
    public void theUserSearchForJobs(String arg0) {
    }

    @Then("the user can see the postings for {string} jobs")
    public void theUserCanSeeThePostingsForJobs(String arg0) {
    }
}
