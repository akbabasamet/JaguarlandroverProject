Feature: User should be able to access to the database

  @PostRequest
  Scenario: TC07 User should be able to create a new pet in the database

    Given User goes base URL
    Then User sets the expected data
    When User sends POST request to the URL
    And Status code should be two hundred
    And User asserts the expected data and actual data





