

Feature: Student's title Automation
  @studentTitle
  Scenario: Student's title validation

    When user hits single student API with "http://cybertekchicago.com/student/all"
    Then user tests for student's title is empty or one letter

    @studentEmail
    Scenario: Students's email validation

      Then user tests for student's email contains @ and .
