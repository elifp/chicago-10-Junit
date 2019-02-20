package steps.apiSteps;

import Api_Pojo_Model.Student;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import utilities.APIRunner;

public class studentTitle_steps {

    @Then("user tests for student's title is empty or one letter") //by default is "string",yani null olmadigi icin empty i cikardik
    public void user_tests_for_student_s_title_is_empty_or_one_letter() {
        int counter=0;

        for(Student student:APIRunner.getResponse().getStudents()) {
            String title = student.getCompany().getTitle();
            System.out.println(title);

            Assert.assertTrue("Student title is failing "+ counter + "",+title.length() > 1);
            counter++;


        }

    }
}