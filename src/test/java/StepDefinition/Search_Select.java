package StepDefinition;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Search_Select extends CommonMethods {
    @Given("user clicks on PIM tab")
    public void user_clicks_on_pim_tab() {
        ClickElement(pimTabPage.PimTabBtn);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
    }

    @Then("User enters specific name in search bar")
    public void user_enters_specific_name_in_search_bar() {
        SendKeys(pimTabPage.EmployeeNameSearchBar, ConfigReader.getProperty("EmployeeName"));
    }
    @Then("User writes part of name and searches")
    public void user_writes_part_of_name_and_searches() {

        SendKeys(pimTabPage.EmployeeNameSearchBar,ConfigReader.getProperty("EmployeeToSearch") );
        ClickElement(pimTabPage.SearchBtn);
    }

    @Then("User clicks on search")
    public void user_clicks_on_search() {
        ClickElement(pimTabPage.SearchBtn);
    }


    @Then("User iterates through the table searching for specific target, clicks it")
    public void user_iterates_through_the_table_searching_for_specific_target_clicks_it() {
        boolean isFound = false;
        while(!isFound){
            List<WebElement>cell=driver.findElements(By.id("resultTable"));

            for(WebElement value:cell){
                String valueTxt=value.getText();
                if (valueTxt.equalsIgnoreCase(ConfigReader.getProperty("EmployeeToSearch"))){
                    System.out.println("Employee Found");
                    value.click();
                    isFound=true;
                    break;
                }
                else {
                    ClickElement(pimTabPage.NextBtn);
                }

            }


        }

    }

    @Then("User updates details on specific target and clicks save")
    public void user_updates_details_on_specific_target_and_clicks_save() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
