package StepDefinition;

import Pages.AddEmployeePage;
import Pages.LoginPage;
import Pages.PimTabPage;

public class PageInitializer {
    public static LoginPage loginPage;
    public static PimTabPage pimTabPage;

    public static AddEmployeePage addEmployeePage;

    public static void initializeElements() {

        loginPage = new LoginPage();
        pimTabPage = new PimTabPage();
        addEmployeePage=new AddEmployeePage();
    }
}
