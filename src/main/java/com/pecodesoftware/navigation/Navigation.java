package com.pecodesoftware.navigation;

import com.pecodesoftware.driver.DriverRepository;
import org.openqa.selenium.WebDriver;

public class Navigation {

    private String url = "https://www.pecodesoftware.com/qa-portal/test-task.pdf";

    private WebDriver driver;

    public Navigation() {
        driver = DriverRepository.DRIVERS.get();
    }

    public void navigateToUrl() {
        driver.get(url);
        driver.manage().window().maximize();
    }
}
