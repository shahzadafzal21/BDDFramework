Feature: Filterpage Functionality

  Background:

    Given User is on Argos homepage
    When User types any product to search in the searchbox and clicks on the searchbutton
    Then User should be able to see all the products related to search
    Given user is on nike result page
    When user clicks on sports and fitness category
    Then user should be able to see sport and fitness page

    @Sanity1

    Scenario: Add to basket functionality


    When user clicks on add to trolley button of Nike Leon Armband
      And user clicks on go to trolley button
      Then user should be able to see product in the basket


