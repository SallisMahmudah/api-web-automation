Feature: Delete Post

  @delete-post @api @run
  Scenario: User Delete Post
    Given automation api system set start
    When client orders api to do DELETE to "/posts/1"
    Then the return from api status must be "200"
    And automation api system set finish
