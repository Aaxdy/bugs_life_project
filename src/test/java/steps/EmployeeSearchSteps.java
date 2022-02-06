package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.commonMethods;

public class EmployeeSearchSteps extends commonMethods {
    @When("user navigates to employee list page")
    public void user_navigates_to_employee_list_page() {
        jsClick(dash.PimOption);
        click(dash.employeeListButton);
    }

    @When("user enters valid employee id")
    public void user_enters_valid_employee_id() {
        sendText(EmployeeListPage.idEmployeeSearch);
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        click(EmployeeListPage.searchbutton);
    }

    @Then("user sees employee information displayed")
    public void user_sees_employee_information_displayed() {
        System.out.println("Information is displayed on page");
    }

    @When("user enters valid employee name")
    public void user_enters_valid_employee_name() {
        sendText(EmployeeListPage.empSearchStepByName, "XYZT")
    };
}
}
