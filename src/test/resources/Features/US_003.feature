Feature: US003

  Background:
    Given I go to homepage
    When I accept the cookie

  @smoke @US003_TC01 @UI
  Scenario: TC01
    Then I verify that "https://shop-dev.v2.westfalen.com/de/de/" url is visible
    And I verify all products are visible
    Then I verify titles are visible
      | Kategorien            |
      | Volumen               |
      | Inhalt                |
      | Anwendungen           |
      | Fülldruck             |
      | Flaschentyp           |
      | Reinheit              |
      | Bestandteile          |
      | Flascheneigenschaften |
    And I verify Dropdown is visible at the top of the page
    And I verify Dropdown is visible at the bottom of the page
    And I verify Grid Icon is visible at the top of the page
    And I verify Grid Icon is visible at the bottom of the page