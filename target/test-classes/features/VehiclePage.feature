@Mustafa
Feature: Vehicle Filters

  Background:
    Given the user is logged in as "sales manager"

  Scenario: Navigating  to Filter Button
    Given the user is on the all cars page
    Then the page subtitle should be "All Cars"

  Scenario: Navigating to Manage Filters Button
    Given the user is on the all cars page
    When the user clicks the "filters icon"
    Then the "Manage filters" button should be displayed

  Scenario: Verify that User Can apply filter by typing
    Given the user is on the all cars page
    When the user clicks the "filters icon"
    And the user click on "manage filters" Button
    Then the user can apply "Driver" filter by clicking
    And the user can apply filters by typing "Driver" and it should be desplayed

  Scenario: Verify that the User can apply multiple filters at the same time
    Given the user is on the all cars page
    When the user clicks the "filters icon"
    And the user click on "manage filters" Button
    Then the user should be able to select multiple filters at the same time
    And the user can remove all the filter by clicking on reset icon
