$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/apiFeature/api/studentTitle.feature");
formatter.feature({
  "name": "Student\u0027s title Automation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Student\u0027s title validation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@studentTitle"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user hits single student API with \"http://cybertekchicago.com/student/all\"",
  "keyword": "When "
});
formatter.match({
  "location": "singleStudent_steps.user_hits_single_student_API_with(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tests for student\u0027s title is empty or one letter",
  "keyword": "Then "
});
formatter.match({
  "location": "studentTitle_steps.user_tests_for_student_s_title_is_empty_or_one_letter()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});