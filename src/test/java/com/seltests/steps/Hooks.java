package com.seltests.steps;

import com.seltests.SeleniumDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    public static WebDriver testDriver = null;

    @Before
    public void beforeTest(){
        //start the browser
        testDriver = new SeleniumDriverManager().getDriver();
        testDriver.manage().window().maximize();
    }

    @After
    public void teardown(){
        //closing the browser
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        testDriver.quit();

    }
}
