package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage extends CommonMethods {
    public AddEmployeePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy (id = "firstName")
    public WebElement AEFirstName;
    @FindBy (id = "lastName")
    public WebElement AELastName;
    @FindBy (id = "btnSave")
    public WebElement SaveBtn;
}
