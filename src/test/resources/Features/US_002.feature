Feature: US002

  Background:
    Given I go to homepage
    When I accept the cookie

  @smoke @US002_TC01 @UI
  Scenario: TC01 Suche nach Artikelnummer
    When I click ProduktSuche icon
    Then I verify SearchBox is visible
    When I enter "A0042010252" as artikel nummer into searchbox
    Then I click enter
    And I click Zum Produkt button
    And I verify url is contains "product"
    And ı verify Artikel-Nr is equal searched artikel nummer

  @smoke @US002_TC02 @UI
  Scenario: TC02
    When I click ProduktSuche icon
    Then I verify SearchBox is visible
    When I enter "Acetylen" for general word into searchbox
    Then I click enter
    And I verify titles contains searched word
