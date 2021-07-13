package StepDef;
import PageObject.SignInPageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;

public class LogOutStepDefs {

    SignInPageObject logOut=new SignInPageObject(DriverManager.getDriver());

        @And("user is logged out and redirected to the home page")
    public void userIsLoggedOut()  {
            logOut.clickMyAccountDropdownButton();
            logOut.clickOnSignOutButton();
            DriverManager.getDriver().get("https://www.pearsonassessments.com/store/usassessments/en/login");
    }
}
