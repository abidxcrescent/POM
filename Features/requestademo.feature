#Author: sgounda@asu.edu

Feature: Open Chrome and Navigate to Drov23235

  @Sanity3
  Scenario: End to End3
    Given I want to open chrome
    And Navigate to Drov
    And I click on request a demo
    Then I click on system of intrest "Both"
    Then d I want to set company name as "ASU"
    Then d I want to set first name as "Sarfaraaz"
    Then d I want to set last name as "Hussain"
    Then d I want to set email address as "sgoundahussain@asu.edu"
    Then d I want to set contact number as "6028139673"
    Then d I want to set contact role as "Test"
    Then d I want to set how did you hear about us as "Drov website"
    Then d I want to select street address as "1215 E Vista Del Cerro Dr"
    Then d I want to select address line two as "Apt 2116s"
    Then d I want to select city as "Tempe"
    Then d I want to select state as "AZ"
    Then d I want to select zip as "85281"
    Then d I want to select country as "United States"
    #Then I click on submit
    