package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.commonMethods;

public class LoginSteps extends commonMethods {
    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() {
        openBrowserAndLaunchApplication();
    }
    @When("user enters valid admin username and password")
    public void user_enters_valid_admin_username_and_password() {
        sendText(loginPage.usernameField, ConfigReader.getPropertyValue("username"));
        sendText(loginPage.passwordField, ConfigReader.getPropertyValue("password"))
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button(){
        click(loginPage.loginBtn);
    }
    @Then("admin user is successfully logged in")
    public void user_close_the_browser(){
        closeBrowser();
    }
    @When("user enters valid ess username and password");
    public void user_enters_valid_ess_username_and_password(){
        System.out.println("Hello");
    }
    @When("user enters different {string} and {string} and verify {string} for all the combinations");
    public void user_enters_different_and_verify_for_all_the_combinations
            (String usernameValue, String passwordValue, String error) {
        sendText(loginPage.usernameField,usernameValue);
        sendText(loginPage.usernameField,passwordValue);
        click(loginPage.loginBtn);
        String errorActual = loginPage.errorMessage.getText();
        Assert.assertEquals("values do not match", error, errorActual);
    }
    @When("user enters different {string} and {string}")
    public void user_enters_different_and(String usernameValue, String passwordValue) {
        sendText(loginPage.usernameField,usernameValue);
        sendText(loginPage.passwordField, passwordValue);
    }
    @Then("{string} user is successfully logged in")
    public void user_is_successfully_logged_in(String admin) {
        Assert.assertTrue(dash.welcomeMessage.isDisplayed());
    }
    @When("user is logged in with valid admin credentials")
    public void user_is_logged_in_with_valid_admin_credentials() {
        loginPage.login("AdminAdmin", ConfigReader.getPropertyValue("password"));
    }

}
