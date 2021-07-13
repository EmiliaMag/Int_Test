package StepDef;

import PageObject.PageObject;
import PageObject.SignInPageObject;
import PageObject.CartPagePageObject;
import PageObject.StorePagePageObject;
import PageObject.AccountsForCheckoutPageObject;
import PageObject.CheckoutPageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutPageStepDefs {

    PageObject navigator = new PageObject(DriverManager.getDriver());
    SignInPageObject signInPage = new SignInPageObject(DriverManager.getDriver()); //obj
    CartPagePageObject cartPage = new CartPagePageObject(DriverManager.getDriver());
    StorePagePageObject addToCart = new StorePagePageObject(DriverManager.getDriver());
    AccountsForCheckoutPageObject customerAccount = new AccountsForCheckoutPageObject(DriverManager.getDriver());
    CheckoutPageObject checkoutPage = new CheckoutPageObject(DriverManager.getDriver());

    @Given("User visit the PearsonAssesment page")
    public void userVisitThePearsonAssesmentPage() {
        DriverManager.getDriver().get("https://www.pearsonassessments.com/");
        DriverManager.getDriver().manage().window().maximize();
    }

    @And("closes  the pop-up us")
    public void closesThePopUpUs() {
        signInPage.clickPopUpCloseButton();
        signInPage.clickClosePrivacyWindow();
    }

    @When("user click on SignIn Button from the header of the page")
    public void userClickOnSignInButtonFromTheHeaderOfThePage() throws InterruptedException {
        navigator.implicitWait();
        signInPage.clickSigninRegisterHeaderButton();
    }

    @And("click the username and password field and enter the credentials on the SignIn form")
    public void clickTheUsernameAndPasswordFieldAndEnterTheCredentialsOnTheSignInForm() {
        navigator.scrollDown();
        signInPage.clickOnUsernameInput();
        signInPage.typeValidUsername();
        navigator.scrollDown();
        signInPage.clickPasswordInputField();
        signInPage.typeValidPassword();
    }

    @And("click on SignIn button")
    public void clickOnSignInButton() {
        navigator.scrollDown();
        signInPage.clickSignInButton();
    }

    @Then("click on Store button from the header of the page")
    public void clickOnStoreButtonFromTheHeaderOfThePage() throws InterruptedException {
        navigator.scrollDown();
        signInPage.clickStoreButtonHeader();
    }

    @And("click on Sensory Profile Adult Product Link")
    public void clickOnSensoryProfileAdultProductLink() throws InterruptedException {
        navigator.implicitWait();
        navigator.scrollDown();
        addToCart.clickSensoryProfileAdultProductLink();
    }

    @And("click No button on the Survey Pop-up")
    public void clickNoButtonOnTheSurveyPopUp() {
        addToCart.clickNoSurveyPopup();
    }


    @And("click on Kits Format Cart for SPA product")
    public void clickOnKitsFormatCartForSPAProduct() {
        navigator.scrollDown();
        addToCart.clickonKitsFormatCardSpaProduct();
    }

    @And("click on add to Cart button")
    public void clickOnAddToCartButton() {
        navigator.scrollDown();
        addToCart.clickOnAddToCartButton();
    }


    @And("click on View Cart on the displayed pop-up")
    public void clickOnViewCartOnTheDisplayedPopUp() throws InterruptedException {
//        navigator.implicitWait();
        addToCart.clickOnViewCart();
    }

    @Then("click on checkout button")
    public void clickOnCheckoutButton() throws InterruptedException {
        navigator.implicitWait();
        navigator.scrollDown();
        cartPage.clickOnCheckoutButton();
    }

    @And("click on My Account Radio Box")
    public void clickOnMyAccountRadioBox() throws InterruptedException {
        //navigator.implicitWait();
        customerAccount.clickMyAccountRadioBox();
    }

    @And("click on Continue button")
    public void clickOnContinueButton() {
        navigator.scrollDown();
        customerAccount.clickContinueButton();
    }

    @Then("user should see the Secure Checkoout Page")
    public void userShouldSeeTheSecureCheckooutPage() {
        Assert.assertEquals("Secure checkout", checkoutPage.getSecureCheckoutTitleText());
    }
}
