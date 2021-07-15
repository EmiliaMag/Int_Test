package StepDef;
import PageObject.PageObject;
import PageObject.SignInPageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class SuccesfullSignInStepDef {

    SignInPageObject signInPageObj = new SignInPageObject(DriverManager.getDriver());
    PageObject navigator = new PageObject(DriverManager.getDriver());


    @Given("customer visits the PearsonAssessment's LogIn Page")
    public void userVisitThePearsonAssesmentSLogInPage() {

        DriverManager.getDriver().get("https://www.pearsonassessments.com/store/usassessments/en/login");
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().deleteAllCookies();
    }

    @And("customer closes pop-ups")
    public void closePopUp() {
        signInPageObj.clickClosePrivacyPopup2();
        signInPageObj.clickPopUpCloseButton();

    }

    @When("customer types the username in the Username Field")
    public void userTypeTheUsernameInTheUsernameField() {
        signInPageObj.clickOnUsernameInput();
        signInPageObj.typeValidUsername();
    }

    @And("customer types the password in the Password Field")
    public void typeThePasswordInThePasswordField() {
        navigator.scrollDown();
        signInPageObj.clickPasswordInputField();
        signInPageObj.typeValidPassword();
    }

    @And("customer clicks on SignIn button")
    public void clickOnSignInButton() {
        signInPageObj.clickSignInButton();
    }

    @Then("customer should be logged in to the page")
    public void theUserShouldBeLoggedInToThePage()  {
        navigator.implicitWait();
        Assert.assertEquals("Incorrect text" ,"My Account", signInPageObj.getMyAccountText());
        navigator.closeBrowser();

    }
}


