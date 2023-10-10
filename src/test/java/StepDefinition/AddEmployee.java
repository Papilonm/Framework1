package StepDefinition;

import Utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddEmployee extends CommonMethods {
    @Given("user clicks on ADDD btn")
    public void user_clicks_on_addd_btn() {
        ClickElement(pimTabPage.AddBtn);
    }

    @Then("user fills out new employee information")
    public void user_fills_out_new_employee_information() {
        SendKeys(addEmployeePage.AEFirstName, "SuperLuigi");
        SendKeys(addEmployeePage.AELastName, "Ramos");

    }

    @Then("User clicks on save")
    public void user_clicks_on_save() {
        ClickElement(addEmployeePage.SaveBtn);
    }
}
