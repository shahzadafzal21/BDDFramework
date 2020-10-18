Feature: Homepage Functionality

  @IcelandSmoke

  Scenario: Search crisps Functionality

    Given User is on Iceland homepage
    When User types crisps to search in the searchbox and clicks on the searchbutton
    Then User should be able to see all the products related to crisps
