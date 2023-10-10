package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/",
        dryRun = false,
        glue = "",
        tags = "@login",
        monochrome = true,
        plugin = {"pretty",
                "html:target/report",
                "json:target/report.json",
                "junit:target/report.junit-report.xml"}
)


public class RunnerClass {


}
