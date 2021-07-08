package StepDef;

import PageObject.PageObject;
import PageObject.SignInPageObj;
import PageObject.QuickOrderPObj;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class AddToCartFromQuickOrder {
    SignInPageObj storeButton = new SignInPageObj(DriverManager.getDriver()); //obj
    PageObject navigator = new PageObject(DriverManager.getDriver());
    QuickOrderPObj quickOrder = new QuickOrderPObj(DriverManager.getDriver());


        @Given("user visit the PearsonAssesment's Page")
    public void userVisitThePearsonAssesmentsPage(){
            DriverManager.getDriver().get("https://www.pearsonassessments.com/store/usassessments/en/login");
            DriverManager.getDriver().manage().window().maximize();
    }

    @And("closes the pop-up")
    public void closesThePopUp() {
            storeButton.clickPopUpCloseButton();
    }


    @When("user click Quick Order button")
    public void userClickQuickOrderButton() throws InterruptedException {
            Thread.sleep(3000);
            quickOrder.clickOnQuickOrderButton();
    }


    @And("click on Isbn-Product Code field")
    public void clickOnIsbnProductCodeField() throws InterruptedException {

        Thread.sleep(3000);
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
            Thread.sleep(3000);
        Assert.assertEquals("ABAS-3 Manual", quickOrder.getProductNameAbas());
    }
}


