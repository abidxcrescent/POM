#Author: mnolas60@asu.edu

Feature: Open Chrome and Navigate to Drov

  @FailedScenario
  Scenario: End to End
    Given I want to open chrome
    And Navigate to Drov
    Then I want to click on get a quote
    Then I want to set company name as "ASU"
    Then I want to set first name as "Sarfaraaz"
    Then I want to set last name as "Hussain"
    Then I want to set email address as "sgoundahussain@asu.edu"
    Then I want to set contact number as "6028139673"
    Then I want to set contact role as "Test"
    Then I want to set how did you hear about us as "Drov website"
    Then I want to select street address as "1215 E Vista Del Cerro Dr"
    Then I want to select address line two as "Apt 2116s"
    Then I want to select city as "Tempe"
    Then I want to select state as "AZ"
    Then I want to select zip as "85281"
    Then I want to select country as "United States"
    Then I want to select retrofit as "No"
    Then I want to select new trailer oems as "123456"
    Then I want to select number of trailers as "2"
    Then I want to select aniticipated delivery as "06/2025"
    #Then I click on submit
    Then I verify the message with "Thank You very much"
    
