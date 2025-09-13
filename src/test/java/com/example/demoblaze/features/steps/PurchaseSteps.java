package com.example.demoblaze.features.steps;

import com.example.demoblaze.pages.CartPage;
import com.example.demoblaze.pages.ConfirmationDialog;
import com.example.demoblaze.pages.HomePage;
import com.example.demoblaze.pages.ProductPage;
import com.example.demoblaze.pages.PurchaseModal;
import io.cucumber.java.en.*;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.annotations.Steps;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class PurchaseSteps extends UIInteractionSteps {

    @Steps HomePage homePage;
    @Steps ProductPage productPage;
    @Steps CartPage cartPage;
    @Steps PurchaseModal purchaseModal;
    @Steps ConfirmationDialog confirmationDialog;

    @Given("I am on the Demoblaze home page")
    public void open_home() {
        homePage.goHome();
    }

    @When("I add {string} to the cart")
    public void add_product(String productName) {
        homePage.openProduct(productName);
        productPage.addToCartAndAcceptAlert();
    }

    @When("I go back to the home page")
    public void back_home() {
        homePage.goHome();
    }

    @When("I open the cart")
    public void open_cart() {
        homePage.openCart();
    }

    @Then("I should see {int} items in the cart")
    public void verify_items(int expected) {
        assertThat(cartPage.itemsInCart()).isEqualTo(expected);
    }

    @When("I place the order with:")
    public void place_order_with(io.cucumber.datatable.DataTable table) {
        java.util.Map<String, String> data = table.asMap(String.class, String.class);
        cartPage.clickPlaceOrder();
        purchaseModal.fill(data.get("name"), data.get("country"), data.get("city"),
                data.get("creditCard"), data.get("month"), data.get("year"));
        purchaseModal.purchase();
    }

    @Then("the purchase should be completed")
    public void purchase_completed() {
        assertThat(confirmationDialog.detailsText())
                .contains("Id:")
                .contains("Amount:");
        confirmationDialog.confirm();
    }
}
