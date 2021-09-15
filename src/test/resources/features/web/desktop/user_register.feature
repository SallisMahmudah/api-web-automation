Feature: test

  @dweb @run
  Scenario: test dweb
    Given user on home page
    And user go to register form
    When user register with valid data
#    Then user has successfully registered
