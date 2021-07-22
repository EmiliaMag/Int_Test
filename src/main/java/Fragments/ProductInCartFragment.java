package Fragments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductInCartFragment {

    @FindBy(xpath = ".//div[@class='item__code no-phone']")    //element din fragment
    public WebElement productIsbn;

    @FindBy(xpath = ".//button[@class='btn btn-default js-cartItemDetailBtn']")    //element din fragment
    public WebElement productXButton;

    @FindBy(xpath = ".//input[@class='input js-update-entry-quantity-input']")    //element din fragment
    public WebElement productQtyField;

    @FindBy(xpath = ".//a[@class='js-track-removecartitem']")    //element din fragment
    public WebElement removeButton;

}
