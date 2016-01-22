package com.sidenis.vasidzius;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

/**
 * Created by vkov on 22-Jan-16.
 */
public class StepsDef {

    FirstPage firstPage;
    InitialDataCalculatorPage initialDataCalculatorPage;
    SummarySheetCalculatorPage summarySheetCalculatorPage;
    static final Logger logger = LogManager.getLogger();

    @Given("open start page")
    public void openStartPage() {

        firstPage = open("http://www.b-kontur.ru/profi/payment-holiday#_",FirstPage.class);

        //Actually calculator opens in other page, it's a iframe
        String s = firstPage.calcFrame.attr("src");
        firstPage = page(FirstPage.class);
        initialDataCalculatorPage = open(s, InitialDataCalculatorPage.class);
        logger.trace("open start page");
    }


    @And("^set a period of vacation \"([^\"]*)\" - \"([^\"]*)\"$")
    public void setAPeriodOfVacation(String dateFrom, String dateTo){
        initialDataCalculatorPage.setAPeriodOfVacationFrom(dateFrom);
        initialDataCalculatorPage.setAPeriodOfVacationTo(dateTo);
    }

    @And("^set a vacation type \"([^\"]*)\"$")
    public void setAVacationType(String typeOfVacation) {
        initialDataCalculatorPage.setTypeOfVacation(typeOfVacation);
    }

    @And("^click \"Далее\"$")
    public void clickNext()
    {
        summarySheetCalculatorPage = initialDataCalculatorPage.clickNext();
    }


    @And("^set a period of calculate \"([^\"]*)\" - \"([^\"]*)\"$")
    public void setAPeriodOfCalculate(String dateFrom, String dateTo){
        initialDataCalculatorPage.setCalculationPeriodDateFrom(dateFrom);
        initialDataCalculatorPage.setCalculationPeriodDateTo(dateTo);
    }

    @And("^set for each month salary as \"([^\"]*)\"$")
    public void setForEachMonthSalaryAs(String salary){
        summarySheetCalculatorPage.setSalaryToAllMonths(salary);
        // Write code here that turns the phrase above into concrete actions

    }
}
