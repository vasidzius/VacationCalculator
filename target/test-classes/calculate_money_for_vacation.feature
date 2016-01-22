Feature: Calculate money for vacation
#  For calculating money which company has to pay to employee the employee can use http://www.b-kontur.ru/profi/payment-holiday#_

  Scenario: Calculate money for vacation
    Given open start page
      And set a period of vacation "21.01.2016" - "31.01.2016"
      And set a vacation type "Ежегодный основной"
#      And set a period of calculate "01.01.2015" - "21.01.2016"
#      And click "Далее"
#      And set for each month salary as "50000,00"
 #   When press "Далее"
  #  Then "Сумма отпускных" equals "18 771,28"
   #   And "НДФЛ 13%" equals "2 440,00"