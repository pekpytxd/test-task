package com.pecodesoftware.pages;

import com.pecodesoftware.driver.DriverRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    private WebDriverWait wait;

    public BasePage() {
        driver = DriverRepository.DRIVERS.get();
        wait = new WebDriverWait(driver, 4);
        PageFactory.initElements(driver, this);
    }
}
