package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="txtUsername")
    public WebElement usernameBox;

    @FindBy(id="txtPassword1")
    public WebElement passcodeBox;

    @FindBy(id="btnLogin")
    public WebElement loginBtn;

    @FindBy(id="welcome")
    public WebElement WelcomeTxt;

}
