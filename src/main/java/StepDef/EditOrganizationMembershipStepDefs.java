package StepDef;

import PageObject.PageObject;
import PageObject.EditOrganizationMembershipPageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;

public class EditOrganizationMembershipStepDefs {

    EditOrganizationMembershipPageObject organizationMembership = new EditOrganizationMembershipPageObject(DriverManager.getDriver());

    @And("^customer clicks on Organization types dropdown and selects \"(.*)\"$")
    public void customerClicksOnOrganizationTypesDropdownAndSelects(String input) {
        organizationMembership.clickAndSelectFromTypeOfInstitutionDropdown(input);
    }

    @And("^customer clicks on Membership number field and types \"(.*)\"$")
    public void customerClicksOnMembershipNumberFieldAndTypes(String input) {
        organizationMembership.clickAndSendInputMembershipNumber(input);
    }

}
