package steps.apiSteps;

import Api_Pojo_Model.Student;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import utilities.APIRunner;

public class studentEmail_steps {
    @Then("user tests for student's email contains @ and .")
    public void user_tests_for_student_s_email_contains_and() {

        int counter = 0;
        for (Student student : APIRunner.getResponse().getStudents()) {
            String email = student.getContact().getEmailAddress();
            System.out.println(email);

            Assert.assertTrue("Student email is failing at index: " + counter, email.contains("@") && email.contains("."));
            counter++;

//eger bunlardan biri yoksa fail olacak
        }
    }
}