Feature: Automated End 2 End Tests

Scenario: Customer place an order by purchasing an item from search

Given user is on Home Page
When he search for "dress" any
And choose to buy the first item
And moves to checkout from mini cart
And enter personal details on checkout page
And select Term and condition checkbox
And place the order
And close the browser
