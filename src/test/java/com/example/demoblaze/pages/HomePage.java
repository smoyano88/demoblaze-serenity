package com.example.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {

    public void goHome(){
        this.openUrl("https://www.demoblaze.com/");
    }

    public void openProduct(String productName){
        // Link by visible text in the product cards
        $("//a[text()='" + productName + "']").click();
    }

    public void openCart(){
        // 'Cart' link on navbar has id 'cartur'
        $("#cartur").click();
    }
}
