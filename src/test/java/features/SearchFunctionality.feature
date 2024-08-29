Feature:Search functionality

  @regression
  Scenario Outline: verify that the user can search for jobs
    Given the user open the application with android
    When the user clicks the is ariyorum button
    And the user clicks the search button
    And the user search for jobname as "<jobname>" jobs
    And the user clicks the search button
    Then the user can see the postings for jobs

    Examples:
      |jobname|
      |Garson|
     # |Kasiyer|
      #|Aşçı|

