package com.nttdata.steps;

import com.nttdata.screens.ProductScreen;
import static org.junit.Assert.assertTrue;

public class ProductSteps {

    ProductScreen productScreen;

    public void validateTitle(String nameProduct) {
        assertTrue(productScreen.isTitleCorrect(nameProduct));
    }

    public void validateQuantity(int unidades) {
        productScreen.increaseItemQuantity(unidades);
        assertTrue(productScreen.isQuantityCorrect(unidades));
    }

    public void clickToCart() {
        productScreen.clickAddToCart();
    }

    public void validateQuantityToCart(int unidades) {
        assertTrue(productScreen.isQuantityToCartCorrect(unidades));
    }

}
