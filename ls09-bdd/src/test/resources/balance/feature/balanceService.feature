# language: ru

Функционал: : Balance Service

  @smoke
  Сценарий: : Client add balance to his account
    Дано ^A client with zero balance
    Когда Add a 200 money to balance
    Тогда Balance should be equal 200


#  Scenario: Withdraw from balance
#    Given A client with zero balance
#    When Withdraw 300 money from balance
#    Then Balance should be equal -300
