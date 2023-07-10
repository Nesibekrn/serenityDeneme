Feature: UI - Verify the Homepage
  The homepage should include many elements.

  @smoke
  @firstTC
  Scenario: Check homepage for elements
    Given Hans goes to url
    When he accepts the cookie
    When he clicks Productsortiment
    Then he clicks Schweiß-, Schneid-, Lasergase section
    And he verifies all products are visible