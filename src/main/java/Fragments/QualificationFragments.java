package Fragments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QualificationFragments {

    @FindBy(xpath = ".//div[@class='qualification-group-header col-sm-8']//h2")    //element din fragment
    public WebElement title;

    @FindBy(xpath = ".//div[@class='qualification-group-edit']")    //element din fragment
    public WebElement editButton;
}
