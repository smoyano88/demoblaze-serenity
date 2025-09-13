package com.example.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class ProductPage extends PageObject {

    public void addToCartAndAcceptAlert(){
        // 'Add to cart' button
        $("//a[text()='Add to cart']").click();
        // Accept confirmation alert
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(ExpectedConditions.alertIsPresent());
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }
}
