$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefiles/homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Home Page Checks",
  "description": "",
  "id": "home-page-checks",
  "keyword": "Feature"
});
formatter.before({
  "duration": 45519024374,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify the title of homepage",
  "description": "",
  "id": "home-page-checks;verify-the-title-of-homepage",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@feature1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User handles Alert window",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User Get the browser Title",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify that browser title is as expected",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnHomepage()"
});
formatter.result({
  "duration": 31910628687,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userHandlesAlertWindow()"
});
formatter.result({
  "duration": 371258543,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userGetTheBrowserTitle()"
});
formatter.result({
  "duration": 32632030,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.verifyThatBrowserTitleIsAsExpected()"
});
formatter.result({
  "duration": 76118025,
  "status": "passed"
});
formatter.after({
  "duration": 1959504604,
  "status": "passed"
});
});