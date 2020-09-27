Feature: ResultPage Functionality

  Background:

    Given User is on Argos homepage
    When User types any product to search in the searchbox and clicks on the searchbutton
    Then User should be able to see all the products related to search

  @Sanity

    Scenario: sports and fitness functionality

    Given user is on nike result page
    When user clicks on sports and fitness category
    Then user should be able to see sport and fitness page



    
