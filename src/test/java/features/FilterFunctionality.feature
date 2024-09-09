Feature:Filter functionality

  @smoke
  Scenario Outline: verify that the user can search for jobs with using filter functions
    Given the user open the application with android
    When the user clicks the is ariyorum button
    And the user clicks the search button
    And the user search for jobname as "<jobname>" jobs
    And the user clicks the search button
    And the user clicks the filter button
    And the user clicks the this week button
    And the user clicks the apply the app button
    And the user clicks the full time button
    And the user clicks the apply filter button
    Then the user can see the postings for jobs

    Examples:
      |jobname|
      |Garson|
     # |Kasiyer|
      #|Aşçı|

  Scenario Outline: verify that the user can search for jobs with using arrangement functions
    Given the user open the application with android
    When the user clicks the is ariyorum button
    And the user clicks the sort order button
    And the user clicks the from new old sort button
    And the user clicks the apply button
    Then the user can see the postings for new old sort jobs

