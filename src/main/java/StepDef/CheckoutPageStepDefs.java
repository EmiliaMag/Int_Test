package StepDef;

import PageObject.PageObject;
import PageObject.SignInPageObject;
import PageObject.CartPagePageObject;
import PageObject.StorePagePageObject;
import PageObject.AccountsForCheckoutPageObject;
import PageObject.PlaceOrderTestStepDefs;
import PageObject.SecureCheckoutPageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutPageStepDefs {

    PageObject navigator = new PageObject(DriverManager.getDriver());
    SignInPageObject signInPage = new SignInPageObject(DriverManager.getDriver()); //obj
    CartPagePageObject cartPage = new CartPagePageObject(DriverManager.getDriver());
    StorePagePageObject addToCart = new StorePagePageObject(DriverManager.getDriver());
    AccountsForCheckoutPageObject customerAccount = new AccountsForCheckoutPageObject(DriverManager.getDriver());
    PlaceOrderTestStepDefs checkoutPage = new PlaceOrderTestStepDefs(DriverManager.getDriver());
    SecureCheckoutPageObject secureCheckout = new SecureCheckoutPageObject(DriverManager.getDriver());


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
        Assert.assertEquals("Unexpected title on Secure Checkout Page", "Secure checkout", checkoutPage.getSecureCheckoutTitleText());
//        navigator.closeBrowser();
    }


    @And("customer clicks on {string} radio button")
    public void customerClicksOnRadioButton(String arg0) {
        secureCheckout.clickOnAddNewAddressRadioButton();
    }


    @And("customer clicks on First Name field and types {string} in the field")
    public void customerClicksOnFirstNameFieldAndTypesInTheField(String arg0) {
        secureCheckout.clickOnFirstNameField();
        secureCheckout.typeFirstName();
    }

    @And("customer clicks on Last Name field and types {string} in the field")
    public void customerClicksOnLastNameFieldAndTypesInTheField(String arg0) {
        secureCheckout.clickOnLastNameField();
        secureCheckout.typeLastName();
    }

    @And("customer clicks on Street Address field and types {string} in the field")
    public void customerClicksOnStreetAddressFieldAndTypesInTheField(String arg0) {
        secureCheckout.clickOnStreetAddressField();
        secureCheckout.typeStreetAddress();
    }

    @And("customer clicks on the {string} field and types {string} in the field")
    public void customerClicksOnTheFieldAndTypesInTheField(String arg0, String arg1) {
        secureCheckout.clickOnCityField();
        secureCheckout.typesCityField();
    }


    @And("customer clicks on {string} dropdown list and selects {string} from the list")
    public void customerClicksOnDropdownListAndSelectsFromTheList(String arg0, String arg1) {
        secureCheckout.clickOnStateField();
        secureCheckout.selectState();
    }


    @And("customer clicks on {string} field and types {string} in the {string} field")
    public void customerClicksOnFieldAndTypesInTheField(String arg0, String arg1, String arg2) {
        secureCheckout.clickOnZipCodeField();
        secureCheckout.typeZipCode();
    }


    @And("customer clicks on the {string} button")
    public void customerClicksOnTheButton(String arg0) {
        secureCheckout.clickAddressNextButton();
    }

    @Then("customer should see the {string} displayed")
    public void customerShouldSeeTheDisplayed(String arg0) {
        Assert.assertEquals("Shipping method", secureCheckout.getShippingMethodText());
    }

    @And("customer clicks on {string} button")
    public void customerClicksOnButton(String arg0) {
        secureCheckout.clickOnDeliveryNextButton();
    }

    @Then("customer should see {string} section displayed")
    public void theSectionShouldBeDisplayed(String arg0) {
        Assert.assertEquals("Payment and billing", secureCheckout.getPaymentAndBillingText());
    }

    @And("customer clicks on Card Number field and types {string} in the {string} field")
    public void customerClicksOnCardNumberFieldAndTypesInTheField(String arg0, String arg1) {
        secureCheckout.clickOnCardNumberField();
        secureCheckout.typeCardNumber();
    }

    @And("customer clicks on Month dropdown list and selects {string} from the {string} list")
    public void customerClicksOnMonthDropdownListAndSelectsFromTheList(String arg0, String arg1) {
        secureCheckout.clickOnMonthField();
        secureCheckout.selectOption5FromMonthField();
    }

    @And("customer clicks on Year dropdown list and selects {string} from the {string} list")
    public void customerClicksOnYearDropdownListAndSelectsFromTheList(String arg0, String arg1) {
        secureCheckout.clickOnYearField();
        secureCheckout.selectOption2022FromYearField();
    }

    @And("customer clicks on Security code field and types {string} in the {string} field")
    public void customerClicksOnSecurityCodeFieldAndTypesInTheField(String arg0, String arg1) {
        secureCheckout.clickOnSecurityCodeField();
        secureCheckout.typeSecurityCode();
    }

    @And("customer clicks on Terms&Conditions checkbox button")
    public void customerClicksOn() throws InterruptedException {
        navigator.scrollDown();
        navigator.implicitWait();
        secureCheckout.clickOnTermsCheckbox();
        // secureCheckout.clickOnTermsCheckboxWithActions();
    }

    @And("customer clicks on Country field and selects {string}")
    public void customerClicksOnCountryFieldAndSelects(String arg0) {
        secureCheckout.clickOnCountryField();
        secureCheckout.selectFromCountryField();
    }

    @Then("customer should see the Place Order button disabled")
    public void customerShouldSeeThePlaceOrderButtonDisabled() {
        Assert.assertEquals("00fhffghfjfgh", "true", secureCheckout.getPlaceOrderButtonAttributeD());
    }

    @Then("customer should see the Place Order button enabled")
    public void customerShouldSeeThePlaceOrderButtonEnabled() {
        Assert.assertNull("00fhffghfjfgh", secureCheckout.getPlaceOrderButtonAttributeD());
    }
}