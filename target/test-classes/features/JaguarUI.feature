Feature: User checks the functionality of the application's home page

  Background:
    Given User goes to home page

  @TC01
  Scenario: TC01 User should be able to display the homepage
    Then User verifies that the homepage is displayed
    And User closes the browser

  @TC02
  Scenario: TC02 User should be able to click on each the hoverable menu
    Then User verifies that the seven main headers are displayed at the top of the page
    And User verifies that the seven main headers are clickable
    And User closes the browser

  @TC03
  Scenario: TC03 User should be able to click on the options at the bottom of hoverable menu
    Then User hover over the Brands&Services hoverable  menu
    And User verifies that the options are clickable
    And User closes the browser

  @TC04
  Scenario: TC04 User should be able to display Jaguar's Twitter account
    Then User hover over the News&Media button
    And User clicks on the Twitter button
    And User verifies that the twitter page is displayed
    And User closes the browser

  @TC05
  Scenario: TC05 User scrolls down the page and verifies that the the news header is clickable
    Then User scroll down the page
    And User clicks on the News header
    And User verifies that new page is displayed
    And User closes the browser

  @TC06
  Scenario: TC06 User should be able to display the customer service number
    Then User scrolls to bottom of the home page
    And User clicks on the contact us button
    And User verifies that the customer service number is displayed
    And User closes the browser





