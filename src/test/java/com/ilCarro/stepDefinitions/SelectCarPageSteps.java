package com.ilCarro.stepDefinitions;

import com.ilcarro.pages.LoginPage;
import com.ilcarro.pages.SelectCarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class SelectCarPageSteps {
    @And("User enters city and select by the list")
    public void enters_city() {
        new LoginPage(driver).entersCity("Ashdod");
    }

    @And("User enters the period of rental")
    public void enters_period_rental() {
        new LoginPage(driver).entersPeriod("4/24/2024 - 4/30/2024");
    }

    @And("User clicks on Yalla button select car")
    public void click_on_Yalla_button_select_car() {
        new LoginPage(driver).clickOnYallaButtonSelectCar();
    }

    @Then("User clicks on the picture of the car")
    public void clicks_picture_car() {
        new SelectCarPage(driver).isAutoImagesDisplayed();
    }
}
