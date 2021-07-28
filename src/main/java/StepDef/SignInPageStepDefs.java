package StepDef;

import PageObject.PageObject;
import PageObject.SignInPageObject;
import Utils.DriverManager;
import Utils.Waits;
import com.sun.deploy.util.Waiter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class SignInPageStepDefs {


    SignInPageObject signInPage = new SignInPageObject(DriverManager.getDriver()); //obj
    PageObject navigator = new PageObject(DriverManager.getDriver());


    @Given("customer visits the PearsonAssessment's LogIn Page")
    public void userVisitThePearsonAssesmentSLogInPage() {

        DriverManager.getDriver().get("https://pearsonassessments-stg2.pearson.com/store/usassessments/en/login");
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().deleteAllCookies();
    }

    @And("customer closes pop-ups")
    public void closePopUp() {
        signInPage.clickClosePrivacyPopup2();
        signInPage.clickPopUpCloseButton();
    }

    @When("customer types the username in the Username Field")
    public void userTypeTheUsernameInTheUsernameField() {
        signInPage.clickOnUsernameInput();
        signInPage.typeValidUsername();
    }

    @And("customer types the password in the Password Field")
    public void typeThePasswordInThePasswordField() {
        navigator.scrollDown();
        signInPage.clickPasswordInputField();
        signInPage.typeValidPassword();
    }

    @And("customer clicks on SignIn button")
    public void clickOnSignInButton() {
        Waits.implicitWait();
        signInPage.clickSignInButton();
    }

    @Then("customer should be logged in to the page")
    public void theUserShouldBeLoggedInToThePage() {
        Waits.implicitWait();
        Assert.assertEquals("EM", signInPage.getMyAccountText());
        navigator.closeBrowser();
    }

    @When("customer clicks on Search Bar")
    public void userClickOnSearchBar() {
        signInPage.clickOnSearchField();
    }

    @And("customer clicks on search button")
    public void clickOnSearchButton() {
        signInPage.clickOnSearchButton();
    }

    @Then("customer should see the Sign In page in breadcrumb")
    public void theUserShouldShouldBeRedirectedAndShouldSeeTheSignInPageInBreadcrumb() {
        Waits.implicitWait();
        Waits.waitUntilPageIsLoaded(DriverManager.getDriver(), 30);
        Assert.assertEquals("The texts don't match", "Sign in", signInPage.getSignInBreadcrumbText());
        navigator.closeBrowser();
    }

    @When("customer clicks on Search Bar field")
    public void userClickOnSearchBarField() {
        signInPage.clickOnSearchField();
    }

    @And("customer types the Ampac product name")
    public void typeTheAmpacProductName() {
        signInPage.typeSearchFieldInput();
    }

    @And("customer clicks on search button next to the search field")
    public void clickOnSearchButtonNextToTheSearchField() {
        signInPage.clickOnSearchButton();
    }

    @And("customer clicks on Pearson's Logo button")
    public void clickOnPearsonSLogoButton() {
        signInPage.clickOnPearsonLogo();
    }

    @Then("customer should be redirected to the Home Page")
    public void theUserShouldBeRedirectedToTheHomePage() {
        Waits.implicitWait();
        Assert.assertEquals("The tittle is incorrect", "Pearson Assessments", signInPage.getHomePageTitle());
        navigator.closeBrowser();
    }

    @And("user is logged out and redirected to the home page")
    public void userIsLoggedOut() {
        signInPage.clickMyAccountDropdownButton();
        signInPage.clickOnSignOutButton();
        DriverManager.getDriver().get("https://www.pearsonassessments.com/store/usassessments/en/login");
    }

    @And("customer clicks on Store button from the header")
    public void clickOnStoreButtonFromTheHeader() {
        Waits.implicitWait();
        signInPage.clickStoreButtonHeader();
    }

    @When("customer customer clicks on SignIn button from the header of the page")
    public void userClickOnSignInButtonFromTheHeaderOfThePage() {
        Waits.implicitWait();
        signInPage.clickSigninRegisterHeaderButton();
    }

    @And("customer clicks the username and password field and enter the credentials on the SignIn form")
    public void clickTheUsernameAndPasswordFieldAndEnterTheCredentialsOnTheSignInForm() {
        navigator.scrollDown();
        signInPage.clickOnUsernameInput();
        signInPage.typeValidUsername();
        navigator.scrollDown();
        signInPage.clickPasswordInputField();
        signInPage.typeValidPassword();
    }

    @And("customer clicks on Store button from the header of the page")
    public void clickOnStoreButtonFromTheHeaderOfThePage() {
        signInPage.clickStoreButtonHeader();
    }

    @When("customer  clicks on Store button from the header")
    public void user_click_on_Store_button_from_the_header() {
        signInPage.clickStoreButtonHeader();
    }

    @And("customer clicks on My Account dropdown button")
    public void customerClicksOnMyAccount() throws InterruptedException {
        Thread.sleep(3000);
        signInPage.clickMyAccountDropdownButton();
    }

    @And("customer clicks on Address Book Button from the dropdown list")
    public void customerClicksOnAddressBook() {
        signInPage.clickOnAddressBook();
    }

    @And("customer clicks on Saved Carts Link from the dropdown list")
    public void customerClicksOnSavedCarts() {
        signInPage.clickOnSaveCartsLink();
    }

    @And("customer goes to the Saved Carts Page")
    public void customerGoesToSavedCartsPage() {
        DriverManager.getDriver().get("https://pearsonassessments-stg2.pearson.com/store/usassessments/en/my-account/saved-carts");
    }

    @Then("customer should see the search bar field")
    public void customerSeeSearchBar() {
        Assert.assertEquals("The messages don't match", "Sign in", signInPage.getSignInText());
    }
}


