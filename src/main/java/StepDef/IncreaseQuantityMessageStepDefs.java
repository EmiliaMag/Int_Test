package StepDef;

import PageObject.CartPagePageObject;
import PageObject.PageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class IncreaseQuantityMessageStepDefs {

    CartPagePageObject quantityField = new CartPagePageObject(DriverManager.getDriver());
    CartPagePageObject qtyUpdatedMessage = new CartPagePageObject(DriverManager.getDriver());
PageObject navigator = new PageObject(DriverManager.getDriver());


    @Then ("customer clicks on QTY field")
    public void clickOnQtyField(){
quantityField.clickOnQtyField();
    }

    @And("customer deletes the default input")
    public void deleteTheDefaultInput() {
        quantityField.deleteTheQtyFieldValue();
    }


    @And("customer types the value {int}")
    public void enterTheValue(int arg0) {
        quantityField.typeQtyField();
        quantityField.enterValueTypedQty();
    }


    @Then("customer should see update message")
    public void userShouldSeeUpdateMessage() {
        Assert.assertEquals( "The message is not displayed or is incorrect","Product quantity has been updated.", qtyUpdatedMessage.getQuantityUpdatedMessage());
        navigator.closeBrowser();
    }
}
