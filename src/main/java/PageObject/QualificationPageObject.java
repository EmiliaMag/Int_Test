package PageObject;

import Fragments.QualificationFragments;
import Utils.GetBy;
import Utils.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class QualificationPageObject extends PageObject {

    @FindBy(xpath = "//a[@href='/store/usassessments/en/my-account/my-qualifications']")
    private WebElement qualificationButton;

    @FindBy(xpath = "//div[@class='qualification-group']")
    private List<WebElement> qualificationGroupHeader;

    //Edit buttons
    public WebElement getQualificationGroupHeader(String input) {
        By titleBy = GetBy.getBy("title", QualificationFragments.class);
        By editButtonBy = GetBy.getBy("editButton", QualificationFragments.class);

        return qualificationGroupHeader.stream()
                .filter(searchResultFragment -> searchResultFragment.findElement(titleBy).getText().contains(input))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Unable to find element: " + input))
                .findElement(editButtonBy);
    }

    public void clickOnEditButton(String input) {
        getQualificationGroupHeader(input).click();
    }

    //methods
    public void clickOnQualificationButton() {
        Waits.waitUntilElementIsDisplayed(qualificationButton);
        qualificationButton.click();
    }

    public QualificationPageObject(WebDriver driver) {
        super(driver);
    }
}