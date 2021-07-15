package StepDef;

import PageObject.CartPagePageObject;
import PageObject.PageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CartPageStepDefs {


    CartPagePageObject cartPage = new CartPagePageObject(DriverManager.getDriver());
    PageObject navigator = new PageObject(DriverManager.getDriver());


    @And("customer clicks on Save cart button on the pop-up")
    public void clickOnSaveCartButtonOnThePopUp() throws InterruptedException {
        navigator.implicitWait();
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
        navigator.implicitWait();
        Assert.assertEquals("The message is not displayed or is incorrect", "Product quantity has been updated.", cartPage.getQuantityUpdatedMessage());
        navigator.closeBrowser();
    }

    @Then("customer clicks on checkout button")
    public void clickOnCheckoutButton() throws InterruptedException {
        navigator.implicitWait();
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

    @And ("customer clicks on the X button on the right side of the first product")
    public void customerClicksXButton () {
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

}
