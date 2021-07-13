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


        @Given("user visit the PearsonAssesment's Page")
    public void userVisitThePearsonAssesmentsPage(){
            DriverManager.getDriver().get("https://www.pearsonassessments.com/store/usassessments/en/login");
            DriverManager.getDriver().manage().window().maximize();
    }

    @And("closes the pop-up")
    public void closesThePopUp() {
            storeButton.clickClosePrivacyPopup2();
            storeButton.clickPopUpCloseButton();
    }


    @When("user click Quick Order button")
    public void userClickQuickOrderButton() throws InterruptedException {
            navigator.implicitWait();
            quickOrder.clickOnQuickOrderButton();
    }


    @And("click on Isbn-Product Code field")
    public void clickOnIsbnProductCodeField()  {
        navigator.implicitWait();
        navigator.scrollDown();
        navigator.scrollDown();
        quickOrder.clickIsbnField();
    }

    @And("type the Product Code in the field")
    public void typeTheProductCodeInTheField() {
            quickOrder.typeProductCode();
    }


    @And("click on Isbn-Product Code first column text")
    public void clickOnIsbnProductCodeFirstColumnText() {
            quickOrder.clickIsbnPcText();
    }

    @Then("the user should see the product with the product code")
    public void theUserShouldSeeTheProductWithTheProductCode() throws InterruptedException {
            navigator.implicitWait();
        Assert.assertEquals("ABAS-3 Manual", quickOrder.getProductNameAbas());
    }
}


