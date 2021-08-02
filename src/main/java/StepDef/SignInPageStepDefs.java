package StepDef;

import PageObject.PageObject;
import PageObject.SignInPageObject;
import Utils.DriverManager;
import Utils.Waits;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
        signInPage.typeValidUsernameSignIn();
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

    @And("customer clicks on Sign Out")
    public void userIsLoggedOut() {
      signInPage.clickOnSignOutButton();
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
        signInPage.typeValidUsernameSignIn();
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

    @And("customer clicks on Quotes Button from the dropdown list")
    public void customerClicksOnQuotes() {
        signInPage.clickOnQuotesButton();
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

    @Then("customer should see the Sign In button")
    public void customerShouldSeeTheSignInButton() {
//        Assert.assertEquals("The text don't match", "Sign in", signInPage.getSignInText());
        Assert.assertTrue("the element is displayed", signInPage.isSignInButtonDisplayed());
    }

    @And("^customer clicks on First Name field in the Create Account form and types \"(.*)\"$")
    public void customerClicksOnFirstNameFieldAndTypes(String input){
        signInPage.clickAndTypeFirstNameField(input);
    }

    @And("^customer clicks on Last Name field in the Create Account form and types \"(.*)\"$")
    public void customerClicksOnLastNameFieldAndTypes(String input){
        signInPage.clickAndTypeLastNameField(input);
    }

    @And("^customer clicks on Email field in the Create Account form and types \"(.*)\"$")
    public void customerClicksOnEmailFieldAndTypes(String input){
        signInPage.clickAndTypeEmailField(input);
    }

    @And("customer unchecks the Same as email address checkbox")
    public void customerUnchecksTheSameAsEmailAddressCheckbox() {
        signInPage.uncheckSameAsEmailCheckbox();
    }

    @And("^customer clicks on Username field in the Create Account form and types \"(.*)\"$")
    public void customerClicksOnUsernameFieldAndTypes(String input){
        signInPage.clickAndTypeUsernameFieldCreateAccount(input);
    }

    @And("^customer clicks on Password field in the Create Account form and types \"(.*)\"$")
    public void customerClicksOnPasswordFieldAndTypes(String input){
        signInPage.clickAndTypePasswordField(input);
    }

    @And("customer clicks on Terms&Conditions checkbox")
    public void customerClicksOnTermsAndConditionsCheckbox() {
        navigator.scrollDown();
        signInPage.checkTermsAndConditionsCheckbox();
    }

    @And("customer clicks on Create Account button")
    public void customerClicksOnCreateAccountButton() {
        signInPage.clickCreateAccountButton();
    }

    @Then("customer should see an error message under the email field")
    public void customerShouldSeeAnErrorMessageUnderTheEmailField() {
        signInPage.getEmailErrorMessage();
    }

    @Then("customer should see the Capcha filter")
    public void customerShouldSeeChapchaFilter() {
        Assert.assertTrue("The element is not displayed", signInPage.isCapchaElementDisplayed());
    }

//    @And("^customer clicks on \"(.*)\" from the dropdown list on My Account$")
//    public void customerClicksOnQualificationButtonFromTheDropdownListOnMyAccount(String input) {
//        signInPage.getMyAccountByTitle(input);
//    }
}


