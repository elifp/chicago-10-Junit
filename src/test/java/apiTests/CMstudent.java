package apiTests;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import org.junit.Test;

import java.util.List;

    public class CMstudent {

        @Test
        public void studentList(){
            Response response = RestAssured.get("http://cybertekchicago.com/instructor/all");
            System.out.println(response.statusCode());
            Assert.assertEquals(response.statusCode(),200);
            System.out.println(response.asString());
        }

        @Test
        public void oneStudent() {
            Response response = RestAssured.get("http://cybertekchicago.com/student/96");
            System.out.println(response.statusCode());
            System.out.println(response.asString());

            JsonPath jp = response.jsonPath();//we are converting our response to json path
            int b = jp.get("batch");
            System.out.println(b);
            String fn = jp.getString("firstName");
            System.out.println(fn);

            String email = jp.getString("contact.email");
            System.out.println(email);

            String street = jp.getString("company.address.street");
            System.out.println(street);
        }

        @Test
        public void instructors(){

            Response response = RestAssured.get("http://cybertekchicago.com/instructor/all");
            System.out.println(response.asString());

            JsonPath jp = response.jsonPath();

            List<String> subjects = jp.get("subject");
            System.out.println(subjects.size());

            for(String subject : subjects){
                System.out.println(subject.isEmpty());
            }
        }
    }

