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






#  @2
#
#
#  @3
#  Scenario: Clicking different filter types
#    When the user clicks the filters icon
#    And  the user clicks the Manage filters button
#    And  the user clicks on filters
#    Then the filters should be displayed
#
#  @4
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
#
#  @5
#  Scenario: Removing Filters
#    Given the user selected filters
#    When  the user clicks the reset button
#    Then  all the selected filters should be removed