package StepDef;

import PageObject.AddressBookPageObject;
import PageObject.AddAddressPageObject;
import PageObject.PageObject;
import Utils.DriverManager;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AddressBookStepDefs {

    AddressBookPageObject addressBook = new AddressBookPageObject(DriverManager.getDriver());
    PageObject navigator = new PageObject(DriverManager.getDriver());

    @And("customer goes to the PearsonAssessment's Address Book Page")
    public void userVisitThePearsonAssesmentSLogInPage() {
        DriverManager.getDriver().get("https://www.pearsonassessments.com/store/usassessments/en/addresses");
    }

    @And("customer clicks on Add Address button on the Address Book Page")
    public void customerClicksOnAddAddress() {
        addressBook.clickOnAddAddress();
    }

    @Then("customer should see an update message")
    public void customerShouldSeeAnUpdateMessage() {
        Assert.assertEquals("The message doesn't apper or is incorrect", "Address created successfully", addressBook.getAddressCreatedMessage());
    }

    @And("customer click X Button to remove the new added address")
    public void customerClickXButtonToRemoveSecondAddress() {
        addressBook.clickXButtonSecondAddress();
    }

    @Then("customer should see the Add Address Page")
    public void customerShouldSeeAddAddressTitle() {
        Assert.assertEquals("The texts don't match", "Add Address", addressBook.getAddAddressPageTitle());
    }

    @And("customer click on Delete button from the Delete Address Pop-up")
    public void customerClicksDeleteButton() {
        addressBook.clickDeleteButtonAddressPopup();
    }

    @Then("customer should see the update message")
    public void customerShouldSeeTheUpdateMessage() {
        Assert.assertEquals("The messages are not identical", "Address removed successfully", addressBook.getAddressRemovedMessage());
        navigator.closeBrowser();

    }
}
