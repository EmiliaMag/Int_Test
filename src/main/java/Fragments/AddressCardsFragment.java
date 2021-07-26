package Fragments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressCardsFragment {
    @FindBy(xpath = ".//h6[@class='product-title']")
    public WebElement innerText;

    @FindBy(xpath = ".//span[@class='product-number']")
    public WebElement editButton;

    @FindBy(xpath = ".//button[@class='button--ctap button--block js-add-to-cart js-enable-btn']")
    public WebElement xButton;
}
