Feature:Search functionality


  @regression
  Scenario: verify that the user can search for jobs
    Given the user open the application with android
    When the user clicks the is ariyorum button
    And the user clicks the search button
    And the user search for job name as "garson" jobs
    Then the user clicks the second search button
    And the user can see the postings for job name as "garson" jobs


  @regression
Feature: Search Functionality
  Scenario Outline: verify that the user can search for jobs
    Given the user open the application with android
    When the user clicks the is ariyorum button
    And the user clicks the search button
    And the user search for job name as "<jobname>" jobs
    Then the user clicks the search button
    And the user can see the postings for job name as "<jobname>" jobs

    Examples:
      |jobname|
      |Garson|
      |Kasiyer|
      |Aşçı|

