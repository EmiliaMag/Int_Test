package StepDef;

import PageObject.SignInPageObj;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SuccesfullSignInStepDef {

    SignInPageObj signInPageObj = new SignInPageObj(DriverManager.getDriver());


    @Given("user visit the PearsonAssesment's LogIn Page")
    public void userVisitThePearsonAssesmentSLogInPage() {

        DriverManager.getDriver().get("https://www.pearsonassessments.com/store/usassessments/en/login");
        DriverManager.getDriver().manage().window().maximize();
    }

    @And("user closes pop-ups")
    public void closePopUp(){
        signInPageObj.clickPopUpCloseButton();
    }

    @When("user type the username in the Username Field")
    public void userTypeTheUsernameInTheUsernameField() {
        signInPageObj.clickOnUsernameInput();
        signInPageObj.typeValidUsername();
    }

    @And("type the password in the Password Field")
    public void typeThePasswordInThePasswordField() {
        signInPageObj.clickPasswordInputField();
        signInPageObj.typeValidPassword();
    }

    @And("click on SignIn Button")
    public void clickOnSignInButton() {
        signInPageObj.clickSignInButton();
    }

    @Then("the user should be logged in to the page")
    public void theUserShouldBeLoggedInToThePage() {
        Assert.assertEquals("My Account", signInPageObj.getMyAccountText());
    }
}


