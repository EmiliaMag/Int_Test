package StepDef;

import PageObject.AddAddressPageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AddAddressStepDefs {

    AddAddressPageObject addAddressBook = new AddAddressPageObject(DriverManager.getDriver());

    @And("^customer clicks on First Name field and types \"(.*)\"$")
    public void customerClicksOnFirstNameFieldAndTypes(String input) {
        addAddressBook.clickOnFirstNameField();
        addAddressBook.typeFirstName(input);
    }

    @And("^customer clicks on Last Name field and types \"(.*)\"$")
    public void customerClicksOnLastNameFieldAndTypes(String input) {
        addAddressBook.clickOnLastNameField();
        addAddressBook.typeLastName(input);
    }

    @And("^customer clicks on Street Address field and types \"(.*)\"$")
    public void customerClicksOnStreetAddressFieldAndTypes(String input) {
        addAddressBook.clickOnStreetAddressField();
        addAddressBook.typeStreetAddress(input);
    }

    @And("^customer clicks on the City field and types \"(.*)\"$")
    public void customerClicksOnTheFieldAndTypes(String input) {
        addAddressBook.clickOnCityField();
        addAddressBook.typesCityField(input);
    }

    @And("customer clicks on State dropdown list and selects {string}")
    public void customerClicksOnDropdownListAndSelects(String arg0) {
        addAddressBook.clickOnStateField();
        addAddressBook.selectState();
    }

    @And("^customer clicks on ZIP field and types \"(.*)\"$")
    public void customerClicksOnFieldAndTypes(String input) {
        addAddressBook.clickOnZipCodeField();
        addAddressBook.typeZipCode(input);
    }

    @And("customer clicks on Save Button")
    public void customerClickOnSaveButton() {
        addAddressBook.clickSaveButton();
    }
}
