Feature: Car selection
  @selectCar
  Scenario: Selecting a car by city and date
    Given User launches Chrome browser
    When User opens ilCarro HomePage
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success Message is displayed
    And User clicks Ok
    Then User enters city and select by the list
    And User enters the period of rental
    And User clicks on Yalla button select car
    Then User clicks on the picture of the car
    And User quites browser