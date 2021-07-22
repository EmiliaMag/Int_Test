package Fragments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartFragment {

    @FindBy(xpath = ".//h6[@class='product-title']")
    public WebElement productTitle;

    @FindBy(xpath = ".//span[@class='product-number']")
    public WebElement productIsbn;

    @FindBy(xpath = ".//button[@class='button--ctap button--block js-add-to-cart js-enable-btn']")
    public WebElement addToCartButton;

}
