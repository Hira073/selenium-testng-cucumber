package com.zain.portfolio.hooks;

import com.zain.portfolio.core.DriverFactory;
import com.zain.portfolio.utils.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp() {
        DriverFactory.initializeDriver(ConfigReader.get("browser"));
        DriverFactory.getDriver().manage().window().maximize();
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
