package StepDef;

import PageObject.PageObject;
import PageObject.EditDegreePageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class EditDegreeStepDefs {

    EditDegreePageObject degree = new EditDegreePageObject(DriverManager.getDriver());
    PageObject navigator = new PageObject(DriverManager.getDriver());


    @Then("customer should see the Edit Degree Page")
    public void customerShouldSeeTheEditDegreePage() {
        Assert.assertEquals("The titles don't match", "Edit degree", degree.getEditDegreePageTitle());
    }

    @And("^customer clicks on Degree dropdown list and selects \"(.*)\"$")
    public void customerClicksOnDegreeDropdownAndSelects(String input) {
        degree.clickOnDegreeDropDown();
        degree.selectOptionFromDegreeField(input);
    }

    @And("^customer clicks on Major Field and types \"(.*)\"$")
    public void customerClicksOnMajorFieldAndTypes(String input) {
        degree.clickAndSendInputMajorField(input);
    }

    @And("^customer clicks on Institution Field and types \"(.*)\"$")
    public void customerClicksOnInstitutionFieldAndTypes(String input) {
        degree.clickAndSendInputInstitutionField(input);
    }

    @And("customer clicks on Terms & Conditions checkbox")
    public void customerClicksOnTermsCheckbox() {
        degree.clickAcceptTerms();
    }

    @And("customer clicks on Save Button from the Edit Degree Button")
    public void customerClicksOnSaveButtonEditDegree() {
        navigator.scrollDown();
        degree.clickOnSaveButtonEditDegree();
    }

}
