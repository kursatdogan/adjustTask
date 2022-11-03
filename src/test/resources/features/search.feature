
Feature: the user should able to search from search button properly

 Background:
   Given the user navigate to the search page

 Scenario: the user can search anything from search page and should able to see correct result
   When the user enter any word to search box
   And the user click to search button
   And the user click to adjust result
   Then the user should able to see correct results

   Scenario:  The user should able tyo click to about button and navigate to about Wikipedia page and click basic
   information button then navigate to related page
     When  the user click to about button
     And  the user click to basic information button
     Then the user should able to navigate related page

