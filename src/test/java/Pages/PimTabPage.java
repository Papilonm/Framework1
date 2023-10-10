package Pages;

import Utils.CommonMethods;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PimTabPage extends CommonMethods {

    public PimTabPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "menu_pim_viewPimModule")
    public WebElement PimTabBtn;
    @FindBy(id = "empsearch_employee_name_empName")
    public WebElement EmployeeNameSearchBar;
    @FindBy(id = "empsearch_id")
    public WebElement EmployeeIDSearchBar;
    @FindBy(id = "searchBtn")
    public WebElement SearchBtn;
    @FindBy(xpath = "//a[text()='Next']")
    public WebElement NextBtn;
    @FindBy(xpath = "//table[@class='table hover']")
    public List<WebElement> Table;
    @FindBy(id = "btnAdd")
    public WebElement AddBtn;


}
