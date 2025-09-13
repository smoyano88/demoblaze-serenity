package com.example.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;

public class ConfirmationDialog extends PageObject {

    public String detailsText(){
        // The confirmation uses SweetAlert with a <p> containing purchase details
        return $("//div[contains(@class,'sweet-alert')]/p").getText();
    }

    public void confirm(){
        $("//button[text()='OK']").click();
    }
}
