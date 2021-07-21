package StepDef;

import PageObject.PageObject;
import PageObject.SavedCartsPageObject
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class SavedCartsStepDefs {
    SavedCartsPageObject savecarts = new SavedCartsPageObject(DriverManager.getDriver()); //obj
    PageObject navigator = new PageObject(DriverManager.getDriver());


    @And("customer clicks on Restore Button")
    public void customerClicksRestoreButton() {
        savecarts.clickOnRestoreButton();
    }

    @And("customer clicks on Restore Button from the Restore Popup")
    public void customerClicksRestoreButtonRestorePopup() {
        savecarts.clickOnRestoreButtonPopup();
    }


}
