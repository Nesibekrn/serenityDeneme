Feature: US001

  Background:
    Given I go to homepage
    When I accept the cookie

  @smoke @US001_TC01 @UI
  Scenario: TC01
    Then I verify that "https://shop.westfalen.com/de/de/login" url is visible
    And I click Produktsortiment
    Then I click Schweiß-, Schneid-, Lasergase section
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


  @smoke @US001_TC02 @UI
  Scenario: TC02 Sortierung über Dropdown Liste
    When I click Produktsortiment
    Then I click Schweiß-, Schneid-, Lasergase section
    And I verify all products are visible
    When I select Name Aufsteigend from Dropdown
    Then I verify all products are sorted aufsteigned
    When I select Name Absteigend from Dropdown
    Then I verify all products are sorted absteigend
    When I select Relevanz from Dropdown
    Then I verify all products are sorted relevanz

  @smoke @US001_TC03 @UI
  Scenario: TC03 Wechseln der Ansicht zwischen Grid und Liste
    When I click Produktsortiment
    Then I click Schweiß-, Schneid-, Lasergase section
    And I verify all products are visible
    And I verify Grid Icon is visible
    And I click Grid Icon
    And I verify all products are visible
    And I verify List Icon is visible

  @smoke @US001_TC04 @UI
  Scenario: TC04 Filterung mit mindestens 3 ausgewählten Filtern
    When I click Produktsortiment
    Then I click Schweiß-, Schneid-, Lasergase section
    And I select checkboxes for filtering
      | Spezialgase                |
      | stationärer/mobiler Vorrat |
      | 99.998 %                   |
    And I verify all products are visible