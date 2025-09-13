package com.example.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import java.util.List;

public class CartPage extends PageObject {

    public int itemsInCart(){
        // The cart table body uses id 'tbodyid' with one row per product
        java.util.List<WebElementFacade> rows = findAll(By.cssSelector("#tbodyid > tr"));
        return rows.size();
    }

    public void clickPlaceOrder(){
        $("//button[text()='Place Order']").click();
    }
}
