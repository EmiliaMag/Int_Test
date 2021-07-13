package StepDef;

import PageObject.CartPagePageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class IncreaseQuantityMessageStepDefs {

    CartPagePageObject quantityField = new CartPagePageObject(DriverManager.getDriver());
    CartPagePageObject qtyUpdatedMessage = new CartPagePageObject(DriverManager.getDriver());



    @Then ("click on QTY field")
    public void clickOnQtyField(){
quantityField.clickOnQtyField();
    }

    @And("delete the default input")
    public void deleteTheDefaultInput() {
        quantityField.deleteTheQtyFieldValue();
    }


    @And("enter the value {int}")
    public void enterTheValue(int arg0) {
        quantityField.typeQtyField();
        quantityField.enterValueTypedQty();
    }


    @Then("user should see update message")
    public void userShouldSeeUpdateMessage() {
        Assert.assertEquals("Product quantity has been updated.", qtyUpdatedMessage.getQuantityUpdatedMessage());
    }
}
