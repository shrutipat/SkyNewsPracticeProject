Feature: Home Page Checks

  @feature1
  Scenario: Verify the title of homepage
    Given User is on Homepage
    And User handles Alert window
    When User Get the browser Title
    Then Verify that browser title is as expected