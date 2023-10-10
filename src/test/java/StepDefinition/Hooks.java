package StepDefinition;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.sql.DriverManager;

public class Hooks extends CommonMethods {

    @Before
    public void start() {
        LaunchBrowserNavigatetoURL();
    }

    @After
    public void end(Scenario scenario) {
        byte[] pic;
        if (scenario.isFailed()) {
            pic = TakeScreenshot("failed/" + scenario.getName());
        }
        else {
            pic=TakeScreenshot("passed/"+scenario.getName());
        }
        scenario.attach(pic,"image/png",scenario.getName());

        CloseBrowser();
    }
}
