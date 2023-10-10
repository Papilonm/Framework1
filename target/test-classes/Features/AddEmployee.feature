Feature: Adding an Employee


  @3
  Scenario: Adding employee as admin
    Given user enters Login and password
    Then user clicks in login button
    And user clicks on PIM tab
    And user clicks on ADDD btn
    Then user fills out new employee information
    And User clicks on save