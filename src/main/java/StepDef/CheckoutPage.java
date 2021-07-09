package StepDef;

import PageObject.PageObject;
import PageObject.SignInPageObj;
import PageObject.CartPagePObj;
import PageObject.StorePagePObj;
import PageObject.AccountsForCheckoutPObj;
import PageObject.CheckoutPageObj;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.Th;
import org.junit.Assert;

public class CheckoutPage {

    PageObject navigator = new PageObject(DriverManager.getDriver());
    SignInPageObj signInPage = new SignInPageObj(DriverManager.getDriver()); //obj
    CartPagePObj cartPage = new CartPagePObj(DriverManager.getDriver());
    StorePagePObj addToCart = new StorePagePObj(DriverManager.getDriver());
    AccountsForCheckoutPObj customerAccount = new AccountsForCheckoutPObj(DriverManager.getDriver());
    CheckoutPageObj checkoutPage = new CheckoutPageObj(DriverManager.getDriver());

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
        Thread.sleep(3000);
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
        Thread.sleep(2000);
        signInPage.clickStoreButtonHeader();
    }

    @And("click on Sensory Profile Adult Product Link")
    public void clickOnSensoryProfileAdultProductLink() throws InterruptedException {
        Thread.sleep(2000);
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
        Thread.sleep(3000);
        addToCart.clickOnViewCart();
    }

    @Then("click on checkout button")
    public void clickOnCheckoutButton() throws InterruptedException {
        Thread.sleep(2000);
        navigator.scrollDown();
        cartPage.clickOnCheckoutButton();
    }

    @And("click on My Account Radio Box")
    public void clickOnMyAccountRadioBox() throws InterruptedException {
        Thread.sleep(2000);
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
