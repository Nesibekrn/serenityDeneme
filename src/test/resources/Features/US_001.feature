Feature: US001

  Background:
    Given user goes to homepage
    When he accepts the cookie

  @smoke @US001_TC01 @UI
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



  @smoke @US001_TC02 @UI
  Scenario: TC02 Sortierung über Dropdown Liste
    When he clicks Productsortiment
    Then he clicks any section
    And he verifies all products are visible
    When he selects Name Aufsteigend from Dropdown
    Then he verifies all products are sorted aufsteigned
    When he selects Name Absteigend from Dropdown
    Then he verifies all products are sorted absteigend
    When he selects Relevanz from Dropdown
    Then he verifies all products are sorted relevanz

  @smoke @US001_TC03 @UI
  Scenario: TC03 Sortierung über Dropdown Liste
    When he clicks Productsortiment
    Then he clicks any section
    And he verifies all products are visible
    And he verifies Grid Icon is visible
    And he clicks Grid Icon
    And he verifies all products are visible
    And he verifies List Icon is visible

  @smoke @US001_TC04 @UI
  Scenario: TC04 Sortierung über Dropdown Liste
    When he clicks Productsortiment
    Then he clicks any section
    And he verifies all products are visible
    And he selects 3 checkboxes for filtering
    And he verifies all products are visible