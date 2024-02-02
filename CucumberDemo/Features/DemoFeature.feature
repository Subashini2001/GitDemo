#Author: written By Suba
@RegressionTesting
Feature: Testing Basic funcitonality of fluroscent Applicaiton - Login & Logout
  I want to use this Feature as parat Regressin testing
 
  @RegressionTesting @SanityTesting
  Scenario: validate Home page
    Given Lauch application with QA Enviraonment Browser
    And it should be Edge browser
    When click Fluroscent Login button
    And check username
    And check password
    Then validate the presence of Login button
    And Close Browser

  @Regressiontesting @SanityTesting
  Scenario Outline: Validate Login Functionality
    Given Launch application with QA Environment Browser
    When Enter Username into "<uname> "in step
    And Enter password into "<pwd>" in step
    And Click submit Button
    Then I verify Logout link
    And Close Browser

    Examples: 
      | uname  | pwd | status  |
      | Abi |     Abi@123| Fail |
      | Nathiya |     Nathiya@345 | Sucess  |
