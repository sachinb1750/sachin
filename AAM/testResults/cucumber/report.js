$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login into Application",
  "description": "",
  "id": "login-into-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AltoroMutual"
    }
  ]
});
formatter.before({
  "duration": 5132394597,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Validate E2E flow on Altoro Mutual Application",
  "description": "",
  "id": "login-into-application;validate-e2e-flow-on-altoro-mutual-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "login page test",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "online banking home page test",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "transfer fund page test",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "account information page test",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefinitions.login_page_test()"
});
formatter.result({
  "duration": 4081007373,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefinitions.online_banking_home_page_test()"
});
formatter.result({
  "duration": 1448912885,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefinitions.transfer_fund_page_test()"
});
formatter.result({
  "duration": 1991405853,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefinitions.account_information_page_test()"
});
formatter.result({
  "duration": 3978278226,
  "status": "passed"
});
formatter.after({
  "duration": 766534284,
  "status": "passed"
});
});