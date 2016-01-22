package com.sidenis.vasidzius;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by vkov on 22-Jan-16.
 */
public class CalculatorPage {

    @FindBy(id = "Vacation_Period_PeriodFrom_DateInputControl_Input")
    public SelenideElement inputVacationPeriodDateFrom;

    @FindBy(id = "Vacation_Period_PeriodTo_DateInputControl_Input")
    public SelenideElement inputVacationPeriodDateTo;

    @FindBy(id = "Vacation_Type_FancySelectControl")
    public SelenideElement spanDropDownVacationType;

    @FindBy(id = "Vacation_CalculationPeriod_PeriodFrom_DateInputControl_Input")
    public SelenideElement inputCalculationPeriodDateFrom;

    @FindBy(id = "Vacation_CalculationPeriod_PeriodTo_DateInputControl_Input")
    public SelenideElement inputCalculationPeriodDateTo;

    @FindBy(id = "Vacation_Wizard_WizardFooterControl_GoForward")
    public SelenideElement buttonSpanNext;


    public void setAPeriodOfVacationFrom(String dateFrom) {
        /*inputVacationPeriodDateFrom.click();
        inputVacationPeriodDateFrom.sendKeys(dateFrom.substring(0,2)+dateFrom.substring(3,5) + dateFrom.substring(6));
        */
        WebDriverRunner.getWebDriver().findElement(By.id("Vacation_Period_PeriodFrom_DateInputControl_Input")).click();
        WebDriverRunner.getWebDriver().findElement(By.id("Vacation_Period_PeriodFrom_DateInputControl_Input")).sendKeys(dateFrom.substring(0,2)+dateFrom.substring(3,5) + dateFrom.substring(6));

        int n=0;
    }

    public void setAPeriodOfVacationTo(String dateTo) {
        inputVacationPeriodDateTo.setValue(dateTo.substring(0,2)+dateTo.substring(3,5) + dateTo.substring(6));
    }

    public void setTypeOfVacation(String typeOfVacation) {
        spanDropDownVacationType.click();
        $(withText(typeOfVacation)).click();
    }

    public void clickNext() {
        buttonSpanNext.click();
    }
}
