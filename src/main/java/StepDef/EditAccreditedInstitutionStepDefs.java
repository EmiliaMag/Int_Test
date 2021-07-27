package StepDef;

import PageObject.PageObject;
import PageObject.EditAccreditedInstitutionPageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;

public class EditAccreditedInstitutionStepDefs {

    EditAccreditedInstitutionPageObject accredited = new EditAccreditedInstitutionPageObject(DriverManager.getDriver());

    @And("^customer clicks on Institution Name and types \"(.*)\"$")
    public void customerClicksOnInstitutionNameAndTypes(String input) {
        accredited.clickAndTypeOnInstitutionNameField(input);
    }

    @And("^customer clicks on Type of Institution Field and selects \"(.*)\"$")
    public void customerClicksOnTypesofInstitutionFieldAndSelects(String input) {
        accredited.clickAndSelectFromTypeOfInstitutionDropdown(input);
    }

    @And("^customer clicks on Country Field and selects \"(.*)\"$")
    public void customerClicksOnCountryFieldAndSelects(String input) {
        accredited.clickAndSelectFromCountryDropdown(input);
    }

    @And("^customer clicks on StreetAddress field and types \"(.*)\"$")
    public void customerClicksOnStreetAddressFieldAndTypes(String input) {
        accredited.clickAndTypeStreetAddressField(input);
    }

    @And("^customer clicks on City field and types \"(.*)\"$")
    public void customerClicksOnCityFieldAndTypes(String input) {
        accredited.clickAndTypeCityField(input);
    }

    @And("^customer clicks on State dropdown and selects \"(.*)\"$")
    public void customerClicksOnStateDropdownAndSelects(String input) {
        accredited.clickAndSelectStateDropdown(input);
    }

    @And("^customer clicks on Postal Code field and types \"(.*)\"$")
    public void customerClicksOnPostalCodeFieldAndTypes(String input) {
        accredited.clickAndTypeZipCode(input);
    }

    @And("^customer clicks on Accreditation status dropdown and select \"(.*)\"$")
    public void customerClicksOnAccreditationStatusDropdownAndSelects(String input) {
        accredited.clickAndSelectAccreditationStatus(input);
    }

}
