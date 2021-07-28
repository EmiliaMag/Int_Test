package StepDef;

import PageObject.EditLicensePageObject;
import PageObject.PageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;

public class EditLicenseStepDefs {

    EditLicensePageObject license = new EditLicensePageObject(DriverManager.getDriver());
    PageObject navigator = new PageObject(DriverManager.getDriver());

    @And("^customer clicks on Certification Type dropdown list and selects \"(.*)\"$")
    public void customerClicksOnDegreeDropdownAndSelects(String input) {
        license.clickOnCertificationTypeDropdown();
        license.selectOptionFromCertificationTypeDropdown(input);
    }

    @And("^customer clicks on Certification Number field and types \"(.*)\"$")
    public void customerClicksOnCertificationNumberFieldAndSendInput(String input) {
        license.clickAndSendInputCertificationNumberField(input);
    }

    @And("^customer clicks on Certifying Agency field and types \"(.*)\"$")
    public void customerClicksOnCertifyingAgencyAndTypes(String input) {
        license.clickAndSendInputCertifyingAgencyField(input);
    }

    @And("^customer clicks on State field and selects \"(.*)\"$")
    public void customerSelectsFromStateDropdown(String input) {
        navigator.scrollDown();
        license.clickOnStateField();
        license.selectOptionFromStateDropdown(input);
    }


}
