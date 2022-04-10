$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Login.feature");
formatter.feature({
  "name": "Login test for page saucedemo.com",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate the successful login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User enter username \"\u003cUsername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enter password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User click on the login button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be Landed on the home page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ]
    }
  ]
});
formatter.background({
  "name": "Open the application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have opened the application in browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_have_opened_the_application_in_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the successful login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User enter username \"standard_user\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_enter_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter password \"secret_sauce\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_enter_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be Landed on the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_should_be_landed_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validate the unsuccessful login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User enter username \"\u003cUsername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enter password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User click on the login button",
  "keyword": "And "
});
formatter.step({
  "name": "User should get this error \"\u003cError\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "Error"
      ]
    },
    {
      "cells": [
        "problem_user",
        "Abcd@1234",
        "Epic sadface: Username and password do not match any user in this service"
      ]
    }
  ]
});
formatter.background({
  "name": "Open the application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have opened the application in browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_have_opened_the_application_in_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the unsuccessful login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User enter username \"problem_user\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_enter_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter password \"Abcd@1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_enter_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should get this error \"Epic sadface: Username and password do not match any user in this service\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_should_get_this_error(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});