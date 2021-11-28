Feature: Verify Search feature

  As a user
  I should insert the product name in search feature And see the specific result

  Scenario: Verify search feature is working when they searching specific product from the list

    Given I'm on homepage "http://www.habitate.co.uk"/
    When I enter specific product name in search term
    And I click on Search button
    Then I should see the list of specific product
