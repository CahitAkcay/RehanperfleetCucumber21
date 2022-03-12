$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/VehiclePage.feature");
formatter.feature({
  "name": "Vehicle Filters",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in as \"sales manager\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.perfleet.stepdefinitions.LoginStepDef.the_user_is_logged_in_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Navigating  to Filter Button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@mustafa"
    }
  ]
});
formatter.step({
  "name": "the user is on the all cars page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.perfleet.stepdefinitions.VehiclePageStepDefs.theUserIsOnTheAllCarsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page subtitle should be \"All Cars\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.perfleet.stepdefinitions.VehiclePageStepDefs.thePageSubtitleShouldBe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in as \"sales manager\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.perfleet.stepdefinitions.LoginStepDef.the_user_is_logged_in_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Navigating Manage Filter Button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@mustafa"
    }
  ]
});
formatter.step({
  "name": "the user is on the all cars page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.perfleet.stepdefinitions.VehiclePageStepDefs.theUserIsOnTheAllCarsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the \"filters icon\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.perfleet.stepdefinitions.VehiclePageStepDefs.theUserClicksThe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Manage filters\" button  should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.perfleet.stepdefinitions.VehiclePageStepDefs.theButtonShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});