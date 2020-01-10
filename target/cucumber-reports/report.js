$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/hp/eclipse-workspace/CucumberPOM/src/main/java/com/qa/feature/End2End_Tests.feature");
formatter.feature({
  "name": "Automated End 2 End Tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Customer place an order by purchasing an item from search",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he search for \"dress\" any",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.he_search_for_dress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.choose_to_buy_the_first_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "moves to checkout from mini cart",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.moves_to_checkout_from_mini_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter personal details on checkout page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_personal_details_on_checkout_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select Term and condition checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.selectTermsandCondition()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "place the order",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_payment_method_as_check_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.place_the_order()"
});
formatter.result({
  "status": "passed"
});
});