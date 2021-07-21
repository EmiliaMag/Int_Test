package StepDef;

import PageObject.CartPagePageObject;
import PageObject.PageObject;
import Utils.DriverManager;
import Utils.Waits;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CartPageStepDefs {


    CartPagePageObject cartPage = new CartPagePageObject(DriverManager.getDriver());
    PageObject navigator = new PageObject(DriverManager.getDriver());


    @And("customer clicks on Save cart button on the pop-up")
    public void clickOnSaveCartButtonOnThePopUp()  {
        Waits.implicitWait();
        navigator.scrollDown();
        navigator.scrollDown();
        cartPage.clickOnSaveCartButton();
    }

    @Then("customer clicks on QTY field")
    public void clickOnQtyField() {
        cartPage.clickOnQtyField();
    }

    @And("customer deletes the default input")
    public void deleteTheDefaultInput() {
        cartPage.deleteTheQtyFieldValue();
    }

    @And("customer types the value {int}")
    public void enterTheValue(int arg0) {
        cartPage.typeQtyField();
        cartPage.enterValueTypedQty();
    }

    @Then("customer should see update message")
    public void userShouldSeeUpdateMessage() {
        Waits.implicitWait();
        Assert.assertEquals("The message is not displayed or is incorrect", "Product quantity has been updated.", cartPage.getQuantityUpdatedMessage());
        navigator.closeBrowser();
    }

    @Then("customer clicks on checkout button")
    public void clickOnCheckoutButton()  {
        Waits.implicitWait();
        navigator.scrollDown();
        cartPage.clickOnCheckoutButton();
    }

    @Then("user should see the Cart page with the product selected")
    public void userSeeProductInCart() {
        cartPage.getSensoryProfileProductTitle();
    }

    @Then("customer should see the product in the cart")
    public void theUserShouldSeeTheProductInTheCart() {
        Assert.assertEquals("The names don't match", "Adolescent/Adult Sensory Profile", cartPage.getProductNameFromCart());
        navigator.closeBrowser();
    }

    @And("customer clicks on the X button on the right side of the first product")
    public void customerClicksXButton() {
        cartPage.clickOnTheXButton();
    }

    @And("customer clicks on remove button")
    public void customerClicksOnRemoveButton() {
        cartPage.clickOnRemoveButton();
    }

    @Then("customer should see the remove alert message")
    public void customerShouldSeeTheRemoveAlertMessage() {
        Assert.assertEquals("The messages don't match", "The product has been removed from your cart.", cartPage.getRemoveAlertMessageText());
    }

    @Then("customer should see the {string} product in Cart")
    public void customerShouldSeeTheProductInCart(String arg0) {
        Assert.assertEquals("", "Adaptive Behavior Assessment System | Third Edition", cartPage.getAbasLinkText());
    }

    @And("customer clicks on Save Cart button")
    public void customerClicksOnSaveCartButton() {
        cartPage.clickOnSaveCartButton();
    }

    @And("customer clicks on Cart Name field on Save Cart Popup and types {string} in the field")
    public void customerClicksOnCartNameFieldOnSaveCartPopupAndTypesInTheField(String arg0) {
        cartPage.clickCartNameFieldPopUp();
        cartPage.typeCartNameFieldPopupName();
    }

    @And("customer clicks on Save Button from Save Cart Popup")
    public void customerClicksSaveButtonFromSaveCartPopup() {
        navigator.scrollDown();
        cartPage.clickSaveButtonSaveCartPopup();
    }

    @Then("customer should see an cart update message")
    public void customerShouldSeeAnCartUpdateMessage() {
        Assert.assertEquals("The messages are not identical","Your cart Name is added to Saved Carts.", cartPage.getSaveCartUpdateMessage());
    }
}
