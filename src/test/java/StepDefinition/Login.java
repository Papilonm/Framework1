package StepDefinition;

import Utils.CommonMethods;
import Utils.ConfigReader;
import Utils.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login extends CommonMethods {


    @Given("Browser is launched and navigates to URL")
    public void browser_is_open() {
        LaunchBrowserNavigatetoURL();

    }

    @Then("user enters Login and password")
    public void user_enters_login_and_password() {

        SendKeys(loginPage.usernameBox, ConfigReader.getProperty("Username"));

        SendKeys(loginPage.passcodeBox, ConfigReader.getProperty("Password"));

    }

    @Then("user clicks in login button")
    public void user_clicks_in_login_button() {
        ClickElement(loginPage.loginBtn);
    }

    @Then("DashBoard is displayed")
    public void dash_board_is_displayed() {
        if (loginPage.WelcomeTxt.isDisplayed()) {
            System.out.println("DASHBOARD IS DISPLAYED. LOGIN SUCCESSFUL");
        }

    }

}

