package StepDef;

import PageObject.PageObject;
import PageObject.SecureCheckoutPageObject;
import Utils.DriverManager;
import Utils.Waits;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Wait;

public class SecureCheckoutPageStepDefs {


    SecureCheckoutPageObject secureCheckoutPage = new SecureCheckoutPageObject(DriverManager.getDriver());
    PageObject navigator = new PageObject(DriverManager.getDriver());


    @And("customer clicks on {string} radio button")
    public void customerClicksOnRadioButton(String arg0) {
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

    @And("customer clicks on the {string} field and types {string} in the field")
    public void customerClicksOnTheFieldAndTypesInTheField(String arg0, String arg1) {
        secureCheckoutPage.clickOnCityField();
        secureCheckoutPage.typesCityField();
    }

    @And("customer clicks on {string} dropdown list and selects {string} from the list")
    public void customerClicksOnDropdownListAndSelectsFromTheList(String arg0, String arg1) {
        secureCheckoutPage.clickOnStateField();
        secureCheckoutPage.selectState();
    }

    @And("customer clicks on {string} field and types {string} in the {string} field")
    public void customerClicksOnFieldAndTypesInTheField(String arg0, String arg1, String arg2) {
        secureCheckoutPage.clickOnZipCodeField();
        secureCheckoutPage.typeZipCode();
    }

    @And("customer clicks on the {string} button")
    public void customerClicksOnTheButton(String arg0) {
        secureCheckoutPage.clickAddressNextButton();
    }

    @Then("customer should see the {string} displayed")
    public void customerShouldSeeTheDisplayed(String arg0) {
        Assert.assertEquals("Shipping method", secureCheckoutPage.getShippingMethodText());
    }

    @And("customer clicks on {string} button")
    public void customerClicksOnButton(String arg0) {
        secureCheckoutPage.clickOnDeliveryNextButton();
    }

    @Then("customer should see {string} section displayed")
    public void theSectionShouldBeDisplayed(String arg0) {
        Assert.assertEquals("Payment and billing", secureCheckoutPage.getPaymentAndBillingText());
    }

    @And("customer clicks on Card Number field and types {string} in the {string} field")
    public void customerClicksOnCardNumberFieldAndTypesInTheField(String arg0, String arg1) {
        secureCheckoutPage.clickOnCardNumberField();
        secureCheckoutPage.typeCardNumber();
    }

    @And("customer clicks on Month dropdown list and selects {string} from the {string} list")
    public void customerClicksOnMonthDropdownListAndSelectsFromTheList(String arg0, String arg1) {
        secureCheckoutPage.clickOnMonthField();
        secureCheckoutPage.selectOption5FromMonthField();
    }

    @And("customer clicks on Year dropdown list and selects {string} from the {string} list")
    public void customerClicksOnYearDropdownListAndSelectsFromTheList(String arg0, String arg1) {
        secureCheckoutPage.clickOnYearField();
        secureCheckoutPage.selectOption2022FromYearField();
    }

    @And("customer clicks on Security code field and types {string} in the {string} field")
    public void customerClicksOnSecurityCodeFieldAndTypesInTheField(String arg0, String arg1) {
        secureCheckoutPage.clickOnSecurityCodeField();
        secureCheckoutPage.typeSecurityCode();
    }

    @And("customer clicks on Terms&Conditions checkbox button")
    public void customerClicksOn() throws InterruptedException {
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

}
