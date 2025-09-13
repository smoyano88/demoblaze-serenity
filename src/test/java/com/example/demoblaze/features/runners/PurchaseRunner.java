package com.example.demoblaze.features.runners;

import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/purchase",
        glue = "com.example.demoblaze.features.steps",
        plugin = {"pretty"},
        tags = "@purchase"
)
public class PurchaseRunner {}
