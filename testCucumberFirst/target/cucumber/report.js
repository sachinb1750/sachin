$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into Application",
  "description": "",
  "id": "login-into-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Validate Login into Application",
  "description": "",
  "id": "login-into-application;validate-login-into-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Initialize the browser with Chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Navigate to \"http://newtours.demoaut.com/\" Site",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enters user \u003cusername\u003e and password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User Logged in \u003cflag\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Close Browser",
  "rows": [
    {
      "cells": [
        "one1",
        "one2"
      ],
      "line": 15
    },
    {
      "cells": [
        "two1",
        "two2"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "login-into-application;validate-login-into-application;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "flag"
      ],
      "line": 18,
      "id": "login-into-application;validate-login-into-application;;1"
    },
    {
      "cells": [
        "mercury",
        "mercury",
        "True"
      ],
      "line": 19,
      "id": "login-into-application;validate-login-into-application;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 96619,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Validate Login into Application",
  "description": "",
  "id": "login-into-application;validate-login-into-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Initialize the browser with Chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Navigate to \"http://newtours.demoaut.com/\" Site",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enters user mercury and password mercury",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User Logged in True",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Close Browser",
  "rows": [
    {
      "cells": [
        "one1",
        "one2"
      ],
      "line": 15
    },
    {
      "cells": [
        "two1",
        "two2"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDefinitions.initialize_the_browser_with_Chrome()"
});
formatter.result({
  "duration": 4511728255,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://newtours.demoaut.com/",
      "offset": 13
    }
  ],
  "location": "MyStepDefinitions.navigate_to_Site(String)"
});
formatter.result({
  "duration": 1981179440,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mercury",
      "offset": 17
    },
    {
      "val": "mercury",
      "offset": 38
    }
  ],
  "location": "MyStepDefinitions.user_enters_user_and_password(String,String)"
});
formatter.result({
  "duration": 19953274204,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "True",
      "offset": 15
    }
  ],
  "location": "MyStepDefinitions.user_logged_in(String)"
});
formatter.result({
  "duration": 897503722,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefinitions.close_Browser(DataTable)"
});
formatter.result({
  "duration": 996674957,
  "status": "passed"
});
});