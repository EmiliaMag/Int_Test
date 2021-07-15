package StepDef;

import PageObject.PageObject;
import PageObject.SignInPageObject;
import Utils.DriverManager;
import io.cucumber.java.en.Then;

public class SignInPageStepDefs {

    SignInPageObject signInPage = new SignInPageObject(DriverManager.getDriver()); //obj
    PageObject navigator = new PageObject(DriverManager.getDriver());

    @Then("sign in page is open")
    public void open() {
        navigator.waitUntilPageIsLoaded(DriverManager.getDriver(), 30);
    }


}
