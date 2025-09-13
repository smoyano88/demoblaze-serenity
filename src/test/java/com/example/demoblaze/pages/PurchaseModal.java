package com.example.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;

public class PurchaseModal extends PageObject {

    public void fill(String name, String country, String city, String card, String month, String year){
        $("#name").type(name);
        $("#country").type(country);
        $("#city").type(city);
        $("#card").type(card);
        $("#month").type(month);
        $("#year").type(year);
    }

    public void purchase(){
        $("//button[text()='Purchase']").click();
    }
}
