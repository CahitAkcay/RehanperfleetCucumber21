Feature: Vehicle Filters

  Background:
    Given the user is logged in as "sales manager"

  @mustafa
  Scenario: Navigating  to Filter Button
    Given the user is on the all cars page
    Then the page subtitle should be "All Cars"

  @mustafa
  Scenario: Navigating Manage Filter Button
    Given the user is on the all cars page
    When the user clicks the "filters icon"
    Then the "Manage filters" button  should be displayed

#  Scenario Outline: Applying Filters by typing <filterName>
#    When the user clicks the filters icon
#    Then  the user clicking the Manage filters button
#    Then   the user types a "<filterName>" on a filter type
#    And  the written "<filterName>" should be displayed
#
#    Examples:
#      | filterName    |
#      | License Plate |





#
#  @4
#
#
#
#  @5
#  Scenario: Removing Filters
#    Given the user selected filters
#    When  the user clicks the reset button
#    Then  all the selected filters should be removed