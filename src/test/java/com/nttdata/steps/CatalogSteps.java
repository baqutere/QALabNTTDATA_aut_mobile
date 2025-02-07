package com.nttdata.steps;

import com.nttdata.screens.CatalogScreen;
import static org.junit.Assert.assertTrue;

public class CatalogSteps {

    CatalogScreen catalogScreen;

    public void validateTitle() {
        assertTrue(catalogScreen.isTitleCorrect());
    }

    public void validateListProducts() {
        assertTrue(catalogScreen.getProductCount() > 0);
    }

    public void selectProduct(String productName) {
        catalogScreen.clickOnProduct(productName);
    }

}
