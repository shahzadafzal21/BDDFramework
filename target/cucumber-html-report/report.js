$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/shagu/IdeaProjects/BDDFramework/BDDFramework/src/test/Resourses/Homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Funcionality",
  "description": "",
  "id": "funcionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 19,
  "name": "Search for multiple products",
  "description": "",
  "id": "funcionality;search-for-multiple-products",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@MultipleInput"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User is on Argos homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user search for \"\u003cproducts\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user should be able to search multiple products",
  "keyword": "Then "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "funcionality;search-for-multiple-products;",
  "rows": [
    {
      "cells": [
        "products"
      ],
      "line": 24,
      "id": "funcionality;search-for-multiple-products;;1"
    },
    {
      "cells": [
        "nike"
      ],
      "line": 25,
      "id": "funcionality;search-for-multiple-products;;2"
    },
    {
      "cells": [
        "puma"
      ],
      "line": 26,
      "id": "funcionality;search-for-multiple-products;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 22019070500,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Search for multiple products",
  "description": "",
  "id": "funcionality;search-for-multiple-products;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@MultipleInput"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User is on Argos homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user search for \"nike\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user should be able to search multiple products",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepage_Accountbutton.user_is_on_Argos_homepage()"
});
formatter.result({
  "duration": 1029800300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nike",
      "offset": 17
    }
  ],
  "location": "Homepage_ScenarioOutlineSteps.user_search_for(String)"
});
formatter.result({
  "duration": 12022930000,
  "status": "passed"
});
formatter.match({
  "location": "Homepage_ScenarioOutlineSteps.user_should_be_able_to_search_multiple_products()"
});
formatter.result({
  "duration": 34000,
  "status": "passed"
});
formatter.after({
  "duration": 11774696900,
  "status": "passed"
});
formatter.before({
  "duration": 21242861900,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Search for multiple products",
  "description": "",
  "id": "funcionality;search-for-multiple-products;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@MultipleInput"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User is on Argos homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user search for \"puma\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user should be able to search multiple products",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepage_Accountbutton.user_is_on_Argos_homepage()"
});
formatter.result({
  "duration": 434200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "puma",
      "offset": 17
    }
  ],
  "location": "Homepage_ScenarioOutlineSteps.user_search_for(String)"
});
formatter.result({
  "duration": 19940245400,
  "status": "passed"
});
formatter.match({
  "location": "Homepage_ScenarioOutlineSteps.user_should_be_able_to_search_multiple_products()"
});
formatter.result({
  "duration": 34200,
  "status": "passed"
});
formatter.after({
  "duration": 12441213900,
  "status": "passed"
});
});