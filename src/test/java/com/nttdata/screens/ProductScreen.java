package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class ProductScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement titleTextView;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement addQuantity;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement quantity;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement addToCart;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/cartTV\"]")
    private WebElement numItemsCart;

    public boolean isTitleCorrect(String nameProduct) {
        return titleTextView.getText().equals(nameProduct);
    }

    public void increaseItemQuantity(int unidades) {
        for (int i = 1; i < unidades; i++) {
            addQuantity.click();
        }
    }

    public boolean isQuantityCorrect(int quantityResult) {
        System.out.println("Integer.parseInt(quantity.getText()) " + Integer.parseInt(quantity.getText()) );
        return quantityResult == Integer.parseInt(quantity.getText());
    }

    public void clickAddToCart() {
        addToCart.click();
    }

    public boolean isQuantityToCartCorrect(int quantityCart) {
        return quantityCart == Integer.parseInt(numItemsCart.getText());
    }

}
