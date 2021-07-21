package StepDef;

import PageObject.AddAddressPageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AddAddressStepDefs {
    AddAddressPageObject addAddressBook = new AddAddressPageObject(DriverManager.getDriver());


    @And("customer clicks on First Name field and types {string}")
    public void customerClicksOnFirstNameFieldAndTypes(String arg0) {
        addAddressBook.clickOnFirstNameField();
        addAddressBook.typeFirstName();
    }


    @And("customer clicks on Last Name field and types {string}")
    public void customerClicksOnLastNameFieldAndTypes(String arg0) {
        addAddressBook.clickOnLastNameField();
        addAddressBook.typeLastName();
    }

    @And("customer clicks on Street Address field and types {string}")
    public void customerClicksOnStreetAddressFieldAndTypes(String arg0) {
        addAddressBook.clickOnStreetAddressField();
        addAddressBook.typeStreetAddress();
    }

    @And("customer clicks on the {string} field and types {string}")
    public void customerClicksOnTheFieldAndTypes(String arg0, String arg1) {
        addAddressBook.clickOnCityField();
        addAddressBook.typesCityField();
    }

    @And("customer clicks on {string} dropdown list and selects {string}")
    public void customerClicksOnDropdownListAndSelects(String arg0, String arg1) {
        addAddressBook.clickOnStateField();
        addAddressBook.selectState();
    }

    @And("customer clicks on {string} field and types {string}")
    public void customerClicksOnFieldAndTypes(String arg0, String arg1) {
        addAddressBook.clickOnZipCodeField();
        addAddressBook.typeZipCode();
    }

    @And("customer clicks on Save Button")
    public void customerClickOnSaveButton() {
        addAddressBook.clickSaveButton();
    }
}
