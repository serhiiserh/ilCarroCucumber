package com.ilcarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    WebElement emailInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    public LoginPage enterData(String email, String password) {
        type(emailInput, email);
        type(passwordInput, password);
        return this;
    }

    @FindBy(css = "[type='submit']")
    WebElement yallaButton;

    public LoginPage clickOnYallaButton() {
        click(yallaButton);
        return this;
    }

    @FindBy(css = ".message")
    WebElement message;

    public LoginPage isMessageDisplayed(String text) {
        assert message.getText().contains(text);
        return this;
    }

    @FindBy(id = "city")
    WebElement citySelect;


    public LoginPage entersCity(String city) {
        citySelect.sendKeys(city);
        pause(1000);
        citySelect.sendKeys(Keys.DOWN);
        pause(1000);
        citySelect.sendKeys(Keys.ENTER);
        pause(1000);
        return this;
    }

    @FindBy(id = "dates")
    WebElement dateEnter;

    public LoginPage entersPeriod(String period) {
        click(dateEnter);
        String os = System.getProperty("os.name");
        if (os.startsWith("Mac")) {
            dateEnter.sendKeys(Keys.COMMAND, "a");

        } else {
            dateEnter.sendKeys(Keys.CONTROL, "a");
        }
        dateEnter.sendKeys(period);
        dateEnter.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(css = "[type='submit']")
    WebElement yallaButtonCar;
    public LoginPage clickOnYallaButtonSelectCar() {
        click(yallaButtonCar);
        return this;
    }

    @FindBy(css = "[type='button']")
    WebElement okButton;
    public LoginPage clickOk() {
        click(okButton);
        return this;
    }

}
