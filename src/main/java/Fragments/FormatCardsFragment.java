package Fragments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormatCardsFragment {

    @FindBy(xpath = ".//h5[@class='preferred-format__card-title']")    //element din fragment
    public WebElement formatCardTitle;

    @FindBy(xpath = ".//span[@class='product-number']")    //element din fragment
    public WebElement formatCardIsbn;


}
