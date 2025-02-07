package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CatalogScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/productTV']")
    private WebElement titleTextView;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]/android.view.ViewGroup")
    private List<WebElement> productList;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement nameProduct;

    public boolean isTitleCorrect() {
        return titleTextView.getText().equals("Products");
    }

    public int getProductCount() {
        return productList.size();
    }

    public void clickOnProduct(String productName) {
        String productXPath = "//android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/titleTV' and @text='" + productName + "']/ancestor::android.view.ViewGroup";

        try {
            WebElement productContainer = getDriver().findElement(By.xpath(productXPath));

            WebElement productImage = productContainer.findElement(By.xpath(".//android.widget.ImageView[@resource-id='com.saucelabs.mydemoapp.android:id/productIV']"));
            productImage.click();

        } catch (Exception e) {
            System.out.println("No se encontró el producto: " + productName);
            e.printStackTrace();
        }
    }

}
