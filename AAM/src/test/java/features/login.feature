@AltoroMutual
Feature: Login into Application

Scenario: Validate E2E flow on Altoro Mutual Application
    Given login page test
    When online banking home page test
    And transfer fund page test
    Then account information page test
#TASKKILL /IM chromedriver.exe /F