package com.sidenis.vasidzius;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;


/**
 * Created by vkov on 21-Jan-16.
 */
public class FirstPage {

    @FindBy(id = "CalcFrame")
    public SelenideElement calcFrame;


}
