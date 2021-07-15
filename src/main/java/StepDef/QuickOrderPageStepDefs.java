package StepDef;

import PageObject.PageObject;
import PageObject.QuickOrderPageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class QuickOrderPageStepDefs {


    QuickOrderPageObject quickOrderPage = new QuickOrderPageObject(DriverManager.getDriver());
    PageObject navigator = new PageObject(DriverManager.getDriver());


    @When("customer clicks on Quick Order button from the Pearson Banner")
    public void userClickOnQuickOrderButtonFromThePearsonBanner() {
        quickOrderPage.clickOnQuickOrderButton();
    }

    @And("customer clicks on add to Cart button on the right side of the Product Code field")
    public void clickOnAddToCartButtonOnTheRightSideOfTheProductCodeField() throws InterruptedException {
        navigator.implicitWait();
        navigator.scrollUp();
        quickOrderPage.clickOnAddToCartButtonTop();
        navigator.implicitWait();
    }

    @When("customer clicks Quick Order button")
    public void userClickQuickOrderButton() throws InterruptedException {
        navigator.implicitWait();
        quickOrderPage.clickOnQuickOrderButton();
    }

    @And("customer clicks on Isbn-Product Code field")
    public void clickOnIsbnProductCodeField() {
        navigator.implicitWait();
        navigator.scrollDown();
        navigator.scrollDown();
        quickOrderPage.clickIsbnField();
    }

    @And("customer types the Product Code in the field")
    public void typeTheProductCodeInTheField() {
        quickOrderPage.typeProductCode();
    }

    @And("customer clicks on Isbn-Product Code first column text")
    public void clickOnIsbnProductCodeFirstColumnText() {
        quickOrderPage.clickIsbnPcText();
    }

    @Then("customer should see the product with the product code")
    public void theUserShouldSeeTheProductWithTheProductCode() throws InterruptedException {
        navigator.implicitWait();
        Assert.assertEquals("The product name does not match", "ABAS-3 Manual", quickOrderPage.getProductNameAbas());
        navigator.closeBrowser();
    }

    @Then("customer should see the product name")
    public void theUserShouldSeeTheProductWithTheProductCode2() throws InterruptedException {
        navigator.implicitWait();
        Assert.assertEquals("The product name does not match", "ABAS-3 Manual", quickOrderPage.getProductNameAbas());
        DriverManager.getDriver().manage().deleteAllCookies();
    }

    @Given("customer is on the Quick Order Page")
    public void customerIsOnTheQuickOrderPage() {
        navigator.implicitWait();
        Assert.assertEquals("Quick Order", quickOrderPage.getQuickOrderPageTitle());
    }

    @And("customer clicks on X button to remove the product")
    public void customerClicksOnXButtonToRemoveTheProduct() {
        quickOrderPage.clickOnXButton();
    }

    @Then("customer should see the Add to Cart button disabled")
    public void customerShouldSeeTheAddToCartButtonDisabled() {
        navigator.implicitWait();
        Assert.assertEquals("frwefwef", "true", quickOrderPage.getAddtoCartButtonAttribute());
    }

    @When("customer clicks on Reset Form Button")
    public void customerClicksOnResetFormButton(){
        navigator.implicitWait();
        quickOrderPage.clickOnResetFormButton();
        navigator.implicitWait();
        navigator.disableChromeChangesPopup();
    }

}
