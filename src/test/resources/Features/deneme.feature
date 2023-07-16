Feature: UI - Verify the Homepage
  The homepage should include many elements.

  @smoke
  @firstTC
  Scenario: Check homepage for elements
    Given I go to homepage
    When I accept the cookie
    When I click Produktsortiment
    Then I click Schweiß-, Schneid-, Lasergase section
    And I verify all products are visible
    And I click "Schweiß-, Schneid-, Lasergase" checkbox
    And I verify "Schweiß-, Schneid-, Lasergase" is visible under Angewendete Filter