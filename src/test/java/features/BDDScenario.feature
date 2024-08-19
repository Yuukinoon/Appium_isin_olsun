Feature:Search functionality
  Scenario: verify that the user can search for jobs
    Given the user open the application with android 14
    When the user clicks the "is arıyorum" button
    And the user clicks the search button
    And the user search for "garson" jobs
    And the user clicks the "ara" button
    Then the user can see the postings for "garson" jobs