package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectCarPage extends BasePage{
    public SelectCarPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = ".car-img-container.ng-star-inserted")
    WebElement autoImages;
    public SelectCarPage isAutoImagesDisplayed() {
        assert isElementDisplayed(autoImages);
        return new SelectCarPage(driver);
    }
}
