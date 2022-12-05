Feature: Login into adactin page

  Scenario: login by using datatable
    Given open the chrome browser
    And launch the Specified Url
    When enter the username asMap
      | username | lavanyaB123 |
      | password | EDKJF       |
    And click on the login button
    Then logged successfully
