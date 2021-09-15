Feature: Retrieve Post

  @retrieve-post @api @run
  Scenario: Retrieve Post By ID
    Given automation api system set start
    When client orders api to do GET to "/posts/1"
    Then the return from api status must be "200"
    Then response should have "userId" matching "1"
    And response should have "id" matching "1"
    And response should have "title" containing "occaecati excepturi"
    And response should have "body" containing "molestiae ut ut quas totam"
    Given automation api system set finish