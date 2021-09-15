Feature: Retrieve Comment

  @retrieve-comments @api @run
  Scenario: Retrieve Comment By ID
    Given automation api system set start
    When client orders api to do GET to "/comments/5"
    Then the return from api status must be "200"
    Then response should have "postId" matching "1"
    And response should have "id" matching "5"
    And the return must have a field "name"
    And return for field "body" data type must be "String"
    And response should have "name" containing "vero eaque aliquid"
    And response should have "email" matching "Hayden@althea.biz"
    And response should have "body" containing "architecto fugit inventore cupiditate"
    And automation api system set finish