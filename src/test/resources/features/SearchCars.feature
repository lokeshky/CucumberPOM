@Search-Cars
Feature: Acceptence test to validate search cars page is working
  In order to validate that
  the search cars page is working

  @Search-Cars
  Scenario: Validate search cars page
    Given I am on the Home page "https://www.carsguide.com.au" of Cars guide website
    When I move to menu
      | Menu     |
      | buy+sell |
    And click on "Search Cars" link
    And select "BMW" from Any Make dropdown
    And select "1 Series" from Any Model dropdown
    And select "NSW-Hunter" from Any Location dropdown
    And select "$10,000" from Price dropdown
    And click on Find My Next Car
    Then I Should see list of searched cars
    And page title shoul be "BMW Under 1000 for Sale Hunter"
