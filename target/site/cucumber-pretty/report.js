$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("calculate_money_for_vacation.feature");
formatter.feature({
  "id": "calculate-money-for-vacation",
  "description": "",
  "name": "Calculate money for vacation",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "calculate-money-for-vacation;calculate-money-for-vacation",
  "description": "",
  "name": "Calculate money for vacation",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario",
  "comments": [
    {
      "value": "#  For calculating money which company has to pay to employee the employee can use http://www.b-kontur.ru/profi/payment-holiday#_",
      "line": 2
    }
  ]
});
formatter.step({
  "name": "open start page",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "set a period of vacation \"21.01.2016\" - \"31.01.2016\"",
  "keyword": "And ",
  "line": 6
});
formatter.step({
  "name": "set a vacation type \"Ежегодный основной\"",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "set a period of calculate \"01.01.2015\" - \"31.12.2015\"",
  "keyword": "And ",
  "line": 8
});
formatter.step({
  "name": "click \"Далее\"",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "set for each month salary as \"50000,00\"",
  "keyword": "And ",
  "line": 10
});
formatter.step({
  "name": "press \"Далее\"",
  "keyword": "When ",
  "line": 11
});
formatter.step({
  "name": "\"Сумма отпускных\" equals \"18 771,28\"",
  "keyword": "Then ",
  "line": 12
});
formatter.step({
  "name": "\"НДФЛ 13%\" equals \"2 440,00\"",
  "keyword": "And ",
  "line": 13
});
formatter.match({
  "location": "StepsDef.openStartPage()"
});
formatter.result({
  "duration": 2991976290,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "21.01.2016",
      "offset": 26
    },
    {
      "val": "31.01.2016",
      "offset": 41
    }
  ],
  "location": "StepsDef.setAPeriodOfVacation(String,String)"
});
formatter.result({
  "duration": 3262017210,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ежегодный основной",
      "offset": 21
    }
  ],
  "location": "StepsDef.setAVacationType(String)"
});
formatter.result({
  "duration": 1578317823,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01.01.2015",
      "offset": 27
    },
    {
      "val": "31.12.2015",
      "offset": 42
    }
  ],
  "location": "StepsDef.setAPeriodOfCalculate(String,String)"
});
formatter.result({
  "duration": 3304299392,
  "status": "passed"
});
formatter.match({
  "location": "StepsDef.clickNext()"
});
formatter.result({
  "duration": 743407854,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50000,00",
      "offset": 30
    }
  ],
  "location": "StepsDef.setForEachMonthSalaryAs(String)"
});
formatter.result({
  "duration": 7823403370,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});