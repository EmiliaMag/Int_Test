package Fragments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProgramStoreFragment {

    @FindBy(xpath = ".//a[@class='product__list--name']")    //element din fragment
    public WebElement title;

    @FindBy(xpath = ".//div[@class='product__listing--description']")   //element din fragment
    public WebElement description;

}
