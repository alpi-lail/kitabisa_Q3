@all
Feature: Registration

  @positive
  Scenario: As a user I can Login successfully
    Given user open browser URL
    When user input hpEmail
    And user input namalengkap
    And click daftar button
    And user entered otp page

  @negative
  Scenario Outline: As a user I can't Login successfully
    Given user open browser URL
    When user input Email as <email> and nama as <namalengkap>
    And click daftar button

    Examples:
    | email | namalengkap |
    | alpilail | alpilail|
    | alpilail.com | alpilail |
    | alpilail@gmail | alpilail |
    | alpilail | |
    | | alpilail |