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
formatter.match({
  "location": "StepsDef.openStartPage()"
});
formatter.result({
  "duration": 3200338143,
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
  "duration": 1726540141,
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
  "duration": 611934431,
  "status": "passed"
});
});