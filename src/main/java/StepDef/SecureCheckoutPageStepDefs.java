package StepDef;

import PageObject.PageObject;
import PageObject.SecureCheckoutPageObject;
import Utils.DriverManager;
import Utils.Waits;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Wait;

public class SecureCheckoutPageStepDefs {


    SecureCheckoutPageObject secureCheckoutPage = new SecureCheckoutPageObject(DriverManager.getDriver());
    PageObject navigator = new PageObject(DriverManager.getDriver());


    @And("customer clicks on Add a new address radio button")
    public void customerClicksOnRadioButton() {
        secureCheckoutPage.clickOnAddNewAddressRadioButton();
    }

    @And("customer clicks on First Name field and types {string} in the field")
    public void customerClicksOnFirstNameFieldAndTypesInTheField(String arg0) {
        secureCheckoutPage.clickOnFirstNameField();
        secureCheckoutPage.typeFirstName();
    }

    @And("customer clicks on Last Name field and types {string} in the field")
    public void customerClicksOnLastNameFieldAndTypesInTheField(String arg0) {
        secureCheckoutPage.clickOnLastNameField();
        secureCheckoutPage.typeLastName();
    }

    @And("customer clicks on Street Address field and types {string} in the field")
    public void customerClicksOnStreetAddressFieldAndTypesInTheField(String arg0) {
        secureCheckoutPage.clickOnStreetAddressField();
        secureCheckoutPage.typeStreetAddress();
    }

    @And("customer clicks on the City field and types {string} in the field")
    public void customerClicksOnTheFieldAndTypesInTheField(String arg0) {
        secureCheckoutPage.clickOnCityField();
        secureCheckoutPage.typesCityField();
    }

    @And("customer clicks on State dropdown list and selects {string} from the list")
    public void customerClicksOnDropdownListAndSelectsFromTheList(String arg0) {
        secureCheckoutPage.clickOnStateField();
        secureCheckoutPage.selectState();
    }

    @And("customer clicks on ZIP field and types {string} in the ZIP field")
    public void customerClicksOnFieldAndTypesInTheField(String arg0) {
        secureCheckoutPage.clickOnZipCodeField();
        secureCheckoutPage.typeZipCode();
    }

    @And("customer clicks on the Next button")
    public void customerClicksOnTheButton() {
        secureCheckoutPage.clickAddressNextButton();
    }

    @Then("customer should see the Shipping method displayed")
    public void customerShouldSeeTheDisplayed() {
        Assert.assertEquals("Shipping method", secureCheckoutPage.getShippingMethodText());
    }

    @And("customer clicks on Next button")
    public void customerClicksOnButton() {
        secureCheckoutPage.clickOnDeliveryNextButton();
    }

    @Then("customer should see Payment and billing section displayed")
    public void theSectionShouldBeDisplayed() {
        Assert.assertEquals("Payment and billing", secureCheckoutPage.getPaymentAndBillingText());
    }

    @And("^customer clicks on Card Number field and types \"(.*)\" in the Card field$")
    public void customerClicksOnCardNumberFieldAndTypesInTheField(String input) {
        secureCheckoutPage.clickOnCardNumberField();
        secureCheckoutPage.typeCardNumber(input);
    }

    @And("customer clicks on Month dropdown list and selects {string} from the Month list")
    public void customerClicksOnMonthDropdownListAndSelectsFromTheList(String arg0) {
        secureCheckoutPage.clickOnMonthField();
        secureCheckoutPage.selectOption5FromMonthField();
    }

    @And("customer clicks on Year dropdown list and selects {string} from the Year list")
    public void customerClicksOnYearDropdownListAndSelectsFromTheList(String arg0) {
        secureCheckoutPage.clickOnYearField();
        secureCheckoutPage.selectOption2022FromYearField();
    }

    @And("^customer clicks on Security code field and types \"(.*)\" in the Security Code field$")
    public void customerClicksOnSecurityCodeFieldAndTypesInTheField(String input) {
        secureCheckoutPage.clickOnSecurityCodeField();
        secureCheckoutPage.typeSecurityCode(input);
    }

    @And("customer clicks on Terms&Conditions checkbox button")
    public void customerClicksOn() {
        navigator.scrollDown();
        Waits.implicitWait();
        secureCheckoutPage.clickOnTermsCheckbox();
        // secureCheckout.clickOnTermsCheckboxWithActions();
    }

    @And("customer clicks on Country field and selects {string}")
    public void customerClicksOnCountryFieldAndSelects(String arg0) throws InterruptedException {
        secureCheckoutPage.clickOptionFromCountryDropdown(arg0);
        Thread.sleep(6000);
        secureCheckoutPage.waitAddressFormDisplayed();
        Waits.waitUntilPageIsLoaded(DriverManager.getDriver(), 20);
//        secureCheckoutPage.clickOnCountryField();
//        secureCheckoutPage.selectFromCountryField();
    }

    @Then("customer should see the Place Order button disabled")
    public void customerShouldSeeThePlaceOrderButtonDisabled() {
        Assert.assertEquals("frwefwef", "true", secureCheckoutPage.getPlaceOrderButtonAttributeD());
    }

    @Then("customer should see the Place Order button enabled")
    public void customerShouldSeeThePlaceOrderButtonEnabled() {
        Assert.assertNull("00fhffghfjfgh", secureCheckoutPage.getPlaceOrderButtonAttributeD());
    }

    @And("customer clicks on Search Address field")
    public void customerClicksOnSearchAddressField() {
        secureCheckoutPage.clickOnSearchAddressFieldJS();
        secureCheckoutPage.typeSearchAddressFieldInput();

    }

    @And("customer press the down arrow to select the second address from the list")
    public void customerPressDownArrow() {
        secureCheckoutPage.pressEnterSearchAddressField();
    }

    @And("customer clicks on Back to Cart breadcrumb link")
    public void customerClicksOnBackToCartBreadcrumbLink() {
        secureCheckoutPage.clickOnBackToCartBreadcrumb();
    }
}
