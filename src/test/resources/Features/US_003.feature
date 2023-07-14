Feature: US003

  Background:
    Given user goes to homepage
    When he accepts the cookie

  @smoke @US003_TC01 @UI
  Scenario: TC01
    Then user verifies that "https://shop-dev.v2.westfalen.com/de/de/" url is visible
    And he verifies all products are visible
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
    And I verifiy Grid Icon is visible at the top of the page
    And I verifiy Grid Icon is visible at the bottom of the page