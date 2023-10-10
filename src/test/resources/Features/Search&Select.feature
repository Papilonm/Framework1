Feature: Searching for an specific user and selecting it

  @1
  Scenario: Inserting Name

    Given user clicks on PIM tab
    Then User enters specific name in search bar
    And User clicks on search
    Then User iterates through the table searching for specific target, clicks it


  @2
  Scenario: Iterating Through the Whole Table
    Then user enters Login and password
    Then user clicks in login button
    Then DashBoard is displayed
    Given user clicks on PIM tab
    Then User enters specific name in search bar
    And User clicks on search
#    Then User iterates through the table searching for specific target, clicks it
   #   Then User updates details on specific target and clicks save