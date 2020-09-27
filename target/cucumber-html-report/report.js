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
  "duration": 27790831499,
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
  "duration": 1126180900,
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
  "duration": 16369169299,
  "status": "passed"
});
formatter.match({
  "location": "Homepage_ScenarioOutlineSteps.user_should_be_able_to_search_multiple_products()"
});
formatter.result({
  "duration": 34600,
  "status": "passed"
});
formatter.after({
  "duration": 63400,
  "status": "passed"
});
formatter.before({
  "duration": 22458327499,
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
  "duration": 2307099,
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
  "duration": 17862720900,
  "status": "passed"
});
formatter.match({
  "location": "Homepage_ScenarioOutlineSteps.user_should_be_able_to_search_multiple_products()"
});
formatter.result({
  "duration": 37899,
  "status": "passed"
});
formatter.after({
  "duration": 36401,
  "status": "passed"
});
});