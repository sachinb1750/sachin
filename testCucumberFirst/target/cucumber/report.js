$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Calculater1.feature");
formatter.feature({
  "line": 1,
  "name": "Calculator",
  "description": "",
  "id": "calculator",
  "keyword": "Feature"
});
formatter.before({
  "duration": 133781,
  "status": "passed"
});
formatter.before({
  "duration": 4908465,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Add two numbers",
  "description": "",
  "id": "calculator;add-two-numbers",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Calculater1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I have entered 50 into the calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I have also entered 70 into the calculator",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I press add",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the result should be 120 on the screen",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 15
    }
  ],
  "location": "CalcStepDefinations.i_have_entered_into_the_calculator(int)"
});
formatter.result({
  "duration": 93981406,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "70",
      "offset": 20
    }
  ],
  "location": "CalcStepDefinations.i_have_also_entered_into_the_calculator(int)"
});
formatter.result({
  "duration": 145814,
  "status": "passed"
});
formatter.match({
  "location": "CalcStepDefinations.i_press_add()"
});
formatter.result({
  "duration": 46009,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "120",
      "offset": 21
    }
  ],
  "location": "CalcStepDefinations.the_result_should_be_on_the_screen(int)"
});
formatter.result({
  "duration": 110776,
  "status": "passed"
});
formatter.after({
  "duration": 44239,
  "status": "passed"
});
formatter.uri("login.feature");
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
  "duration": 45656,
  "status": "passed"
});
formatter.before({
  "duration": 90603,
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
  "duration": 4069863781,
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
  "duration": 7160748774,
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
  "duration": 14712223242,
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
  "duration": 919731080,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefinitions.close_Browser(DataTable)"
});
formatter.result({
  "duration": 723657923,
  "status": "passed"
});
formatter.after({
  "duration": 35391,
  "status": "passed"
});
});