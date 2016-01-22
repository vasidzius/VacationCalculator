package com.sidenis.vasidzius;

import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;

/**
 * Created by vkov on 22-Jan-16.
 */

@RunWith(Cucumber.class)

@CucumberOptions(
        format = { "pretty",
        "html:target/site/cucumber-pretty",
        "json:target/cucumber.json" },
        features = "src/test/resources"

        )


public class CustomizeTestRunnerCalcTest {
        @BeforeClass
        static public void initializeWebDriver()
        {
                //IE. there are a lot of trubles with using IE. If you choose this browser, you have to add sleep() before actions and other things. I didn't do this
                File file = new File("C:/SelDrivers/IEDriverServer32.exe");
                System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
                WebDriverRunner.setWebDriver(new InternetExplorerDriver());

        }

        @AfterClass
        static public void killDrive()
        {
                WebDriverRunner.closeWebDriver();
        }

}
