package com.sidenis.vasidzius;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

/**
 * Created by vkov on 22-Jan-16.
 */
public class SummarySheetCalculatorPage {

    @FindAll(@FindBy(className = "field__px100"))
    ElementsCollection listOfSpanOfSalaryInputs;

    public void setSalaryToAllMonths(String salary) {
        for(SelenideElement input : listOfSpanOfSalaryInputs)
        {
            input.$(".align__right").sendKeys(salary);
        }

    }
}
