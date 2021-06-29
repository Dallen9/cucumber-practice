package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MyStepdefs {
    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        //code to navigate to login url
            System.out.println("mobile automation");
    }

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_username_and_password(String username, String password) throws Throwable {
        //code to login
        System.out.println("User is logged in as: " + username + " and password is: " + password);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        //home page validation
        System.out.println("Home page is validated");
    }

    //Data table
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable dataTable) throws Throwable {
       List<List<String>> obj = dataTable.asLists();
       //First get goes to row and second get goes to column
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(0).get(4));
    }

    // Test multiple fields with Example keyword (Parameterizing testing)
    @When("^User login in to application with (.+) and (.+)$")
    public void user_login_into_application_with_and(String username, String password) throws Throwable {
        System.out.println("Username: " + username + ", password: " + password);
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_are_displayed(String displayed) throws Throwable {
        //validating the cards
        System.out.println("Cards are displayed " + displayed);
    }
}
