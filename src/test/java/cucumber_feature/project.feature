Feature: edit profile in elearning website

  Background: Background section
  Given user navigated to homepage
  Then user enters valid username and password
  And clicks on login button
  Then user lands on homepage
  And click on edit profile
  
  @tag1  
  Scenario: 01-change notify by mail on new invitation
    Given user is on edit profile page
    When user click on new invitation drop dowm
    And user selects once a day
    Then user clicks on save settings
    And validation message appears
    
    
  @tag2  
  Scenario: 02-change notify by mail on new personal message
    Given user is on edit profile page
    When user click on personal message drop dowm
    And user selects no
    Then user clicks on save settings
    And validation message appears
    
    
  @tag3  
  Scenario: 03-change notify by mail on new message in group
    Given user is on edit profile page
    When user clicks on message in group drop down
    And user selects upon reception
    Then user clicks on save settings
    And validation message appears
    
    @tag4  
  Scenario: 04-change language
    Given user is on edit profile page
    When user clicks on change language drop down
    And user inputs valid language 
    Then press enter key
    And user clicks on save settings
    Then validation message appears
  
  @tag5
  Scenario: 05-change password
    Given user is on edit profile page
    When user clicks on pass field
    And user enters valid pass
    Then user clicks on new password
    And user enters valid new password
    Then user clicks on confirm password
    And user enters valid confirm password
    Then user clicks on save settings
    And validation message appears