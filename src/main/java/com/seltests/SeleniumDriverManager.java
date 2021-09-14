package com.seltests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDriverManager {
    WebDriver driver=null;

    static final String browserType="CHROME";

    public WebDriver getDriver(){
        if(driver == null){
            setupDriver();
        }
        return driver;
    }

    public void setupDriver(){
        switch (browserType){
            case "CHROME":
                driver = setupChromeDriver();
            case "FIREFOX":
                //   driver = setupFFDriver();
        }

    }

    private ChromeDriver setupChromeDriver() {
        String projectFolderPath =System.getProperty("user.dir");
        String chromeDriverPath = projectFolderPath + "/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        return new ChromeDriver();

    }
}
