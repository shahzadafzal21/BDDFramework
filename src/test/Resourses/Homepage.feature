Feature:  Funcionality
@Smoke

  Scenario: Accountbutton Funcionality

    Given User is on Argos homepage
    When User clicks on Accountbutton
    Then User should be able to see the Accountbutton page
@Regression1

Scenario: Wishbutton Functionality

  Given User is on Argos homepage
  When user clicks on Wishlistbutton
  Then user should be able to see Wishlistbutton page

  @MultipleInput

  Scenario Outline: Search for multiple products
    Given User is on Argos homepage
    When user search for "<products>"
    Then user should be able to search multiple products
    Examples:
    |products|
    |nike    |
    |puma    |

