@Rehan
Feature: Driver Filters

  User Story :
  As a user, I should be able to use Driver filter under Fleet-Vehicle page

  Background:
    Given the user is logged in as "store Manager"
    When  the user navigate to "Fleet" and "Vehicles"

  @PERF-1015 @PERF-1016 @Rehan @z
  Scenario: As a user, I should be able to navigate to driver filters
    When the user click on the "Driver" option
    Then the user should see following methods

      | Contains         |
      | Does Not Contain |
      | Is Equal To      |
      | Starts With      |
      | Ends With        |
      | Is Any Of        |
      | Is Not Any Of    |
      | Is Empty         |
      | Is Not Empty     |

  @PERF-1017 @Rehan
  Scenario: As a User, I should be able to use the Contain methods to perform the search
    Given the user click on the "Driver" option
    When the user select "Contains" method
    And the user search by "Dr."
    Then the user can see all the "Dr." appears in the results

  @PERF-1018 @Rehan @z
  Scenario: As a User, I should be able to use the Does Not Contain methods to perform the search
    Given the user click on the "Driver" option
    When the user select "Does Not Contain" method
    And the user search by "Dr."
    Then the "Dr." should not appear in the results

  @PERF-1019 @Rehan
  Scenario: As a User, I should be able to use the Is Equal To methods to perform the search
    Given the user click on the "Driver" option
    When the user select "Is Equal To" method
    And the user search by "Daisy Larkin"
    Then the user can see all the "Daisy Larkin" appears in the results

  @PERF-1020 @Rehan
  Scenario: As a User, I should be able to use the Starts With methods to perform the search
    Given the user click on the "Driver" option
    When the user select "Starts With" method
    And the user search by "J"
    Then the user can see all the "J" appears in the results

  @PERF-1021 @Rehan
  Scenario: As a User, I should be able to use the Ends With methods to perform the search
    Given the user click on the "Driver" option
    When the user select "Ends With" method
    And the user search by "n"
    Then the user can see all the "n" appears in the results

  @PERF-1022 @Rehan
  Scenario Outline: As a user, I should not be able to search with alphabetic characters
    When the user click on the "Driver" option
    And the user select the "<options>" and enter "<nonAlphabetic>" characters
    Then the user should see the following message appears "No entities were found to match your search. Try modifying your search criteria..."
    Examples:
      | options          | nonAlphabetic |
      | Contains         | @             |
      | Does Not Contain | @             |
      | Is Equal To      | ?             |
      | Starts With      | @             |
      | Ends With        | (             |
