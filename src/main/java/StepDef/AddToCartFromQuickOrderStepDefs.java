package StepDef;

import PageObject.PageObject;
import PageObject.SignInPageObject;
import PageObject.QuickOrderPageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class AddToCartFromQuickOrderStepDefs {
    SignInPageObject storeButton = new SignInPageObject(DriverManager.getDriver()); //obj
    PageObject navigator = new PageObject(DriverManager.getDriver());
    QuickOrderPageObject quickOrder = new QuickOrderPageObject(DriverManager.getDriver());

    @And("customer closes the pop-up")
    public void closesThePopUp() {
            storeButton.clickClosePrivacyPopup2();
            storeButton.clickPopUpCloseButton();
    }


    @When("customer clicks Quick Order button")
    public void userClickQuickOrderButton() throws InterruptedException {
            navigator.implicitWait();
            quickOrder.clickOnQuickOrderButton();
    }


    @And("customer clicks on Isbn-Product Code field")
    public void clickOnIsbnProductCodeField()  {
        navigator.implicitWait();
        navigator.scrollDown();
        navigator.scrollDown();
        quickOrder.clickIsbnField();
    }

    @And("customer types the Product Code in the field")
    public void typeTheProductCodeInTheField() {
            quickOrder.typeProductCode();
    }


    @And("customer clicks on Isbn-Product Code first column text")
    public void clickOnIsbnProductCodeFirstColumnText() {
            quickOrder.clickIsbnPcText();
    }

    @Then("customer should see the product with the product code")
    public void theUserShouldSeeTheProductWithTheProductCode() throws InterruptedException {
            navigator.implicitWait();
        Assert.assertEquals("The product name does not match","ABAS-3 Manual", quickOrder.getProductNameAbas());
        navigator.closeBrowser();
    }
}


