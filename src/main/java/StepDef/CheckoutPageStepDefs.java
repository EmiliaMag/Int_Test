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


    @When("customer customer clicks on SignIn button from the header of the page")
    public void userClickOnSignInButtonFromTheHeaderOfThePage() throws InterruptedException {
        navigator.implicitWait();
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


    @Then("customer clicks on Store button from the header of the page")
    public void clickOnStoreButtonFromTheHeaderOfThePage() throws InterruptedException {
        navigator.scrollDown();
        signInPage.clickStoreButtonHeader();
    }

    @And("customer clicks on Sensory Profile Adult Product Link")
    public void clickOnSensoryProfileAdultProductLink() throws InterruptedException {
        navigator.implicitWait();
        navigator.scrollDown();
        addToCart.clickSensoryProfileAdultProductLink();
    }

    @And("customer clicks No button on the Survey Pop-up")
    public void clickNoButtonOnTheSurveyPopUp() {
        addToCart.clickNoSurveyPopup();
    }


    @And("customer clicks on Kits Format Cart for SPA product")
    public void clickOnKitsFormatCartForSPAProduct() {
        navigator.scrollDown();
        addToCart.clickonKitsFormatCardSpaProduct();
    }


    @And("customer clicks on View Cart on the displayed pop-up")
    public void clickOnViewCartOnTheDisplayedPopUp() throws InterruptedException {
//        navigator.implicitWait();
        addToCart.clickOnViewCart();
    }

    @Then("customer clicks on checkout button")
    public void clickOnCheckoutButton() throws InterruptedException {
        navigator.implicitWait();
        navigator.scrollDown();
        cartPage.clickOnCheckoutButton();
    }

    @And("customer clicks on My Account Radio Button")
    public void clickOnMyAccountRadioBox() throws InterruptedException {
        //navigator.implicitWait();
        customerAccount.clickMyAccountRadioBox();
    }

    @And("customer clicks on Continue button")
    public void clickOnContinueButton() {
        navigator.scrollDown();
        customerAccount.clickContinueButton();
    }

    @Then("customer should see the Secure Checkout Page")
    public void userShouldSeeTheSecureCheckooutPage() {
        Assert.assertEquals("Unexpected title on Secure Checkout Page","Secure checkout", checkoutPage.getSecureCheckoutTitleText());
//        navigator.closeBrowser();
    }
}
