$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/api/delete_post.feature");
formatter.feature({
  "name": "Delete Post",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User Delete Post",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@delete-post"
    },
    {
      "name": "@api"
    },
    {
      "name": "@run"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "automation api system set start",
  "keyword": "Given "
});
formatter.match({
  "location": "ApiBase.setIsDweb(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "client orders api to do DELETE to \"/posts/1\"",
  "keyword": "When "
});
formatter.match({
  "location": "ApiBase.clientSendsADELETERequestTo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the return from api status must be \"200\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiBase.responseStatusShouldBe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "automation api system set finish",
  "keyword": "And "
});
formatter.match({
  "location": "ApiBase.setIsDweb(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/features/api/retrieve_comments.feature");
formatter.feature({
  "name": "Retrieve Comment",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Retrieve Comment By ID",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@retrieve-comments"
    },
    {
      "name": "@api"
    },
    {
      "name": "@run"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "automation api system set start",
  "keyword": "Given "
});
formatter.match({
  "location": "ApiBase.setIsDweb(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "client orders api to do GET to \"/comments/5\"",
  "keyword": "When "
});
formatter.match({
  "location": "ApiBase.clientSendsAGETRequestTo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the return from api status must be \"200\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiBase.responseStatusShouldBe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "response should have \"postId\" matching \"1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiBase.validateToMatchingValue(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "response should have \"id\" matching \"5\"",
  "keyword": "And "
});
formatter.match({
  "location": "ApiBase.validateToMatchingValue(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the return must have a field \"name\"",
  "keyword": "And "
});
formatter.match({
  "location": "ApiBase.validateShouldHave(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "return for field \"body\" data type must be \"String\"",
  "keyword": "And "
});
formatter.match({
  "location": "ApiBase.validateDataType(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "response should have \"name\" containing \"vero eaque aliquid\"",
  "keyword": "And "
});
formatter.match({
  "location": "ApiBase.validateToContainingValue(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "response should have \"email\" matching \"Hayden@althea.biz\"",
  "keyword": "And "
});
formatter.match({
  "location": "ApiBase.validateToMatchingValue(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "response should have \"body\" containing \"architecto fugit inventore cupiditate\"",
  "keyword": "And "
});
formatter.match({
  "location": "ApiBase.validateToContainingValue(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "automation api system set finish",
  "keyword": "And "
});
formatter.match({
  "location": "ApiBase.setIsDweb(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/features/api/retrieve_post_by_id.feature");
formatter.feature({
  "name": "Retrieve Post",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Retrieve Post By ID",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@retrieve-post"
    },
    {
      "name": "@api"
    },
    {
      "name": "@run"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "automation api system set start",
  "keyword": "Given "
});
formatter.match({
  "location": "ApiBase.setIsDweb(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "client orders api to do GET to \"/posts/1\"",
  "keyword": "When "
});
formatter.match({
  "location": "ApiBase.clientSendsAGETRequestTo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the return from api status must be \"200\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiBase.responseStatusShouldBe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "response should have \"userId\" matching \"1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiBase.validateToMatchingValue(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "response should have \"id\" matching \"1\"",
  "keyword": "And "
});
formatter.match({
  "location": "ApiBase.validateToMatchingValue(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "response should have \"title\" containing \"occaecati excepturi\"",
  "keyword": "And "
});
formatter.match({
  "location": "ApiBase.validateToContainingValue(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "response should have \"body\" containing \"molestiae ut ut quas totam\"",
  "keyword": "And "
});
formatter.match({
  "location": "ApiBase.validateToContainingValue(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "automation api system set finish",
  "keyword": "Given "
});
formatter.match({
  "location": "ApiBase.setIsDweb(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/features/web/desktop/user_register.feature");
formatter.feature({
  "name": "test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "test dweb",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dweb"
    },
    {
      "name": "@run"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeSteps.homePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user go to register form",
  "keyword": "And "
});
formatter.match({
  "location": "HomeSteps.tapLogginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user register with valid data",
  "keyword": "When "
});
formatter.match({
  "location": "HomeSteps.submitRegisterData()"
});
formatter.result({
  "status": "passed"
});
});