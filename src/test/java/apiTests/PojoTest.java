package apiTests;


import Api_Pojo_Model.Instructor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

    public class PojoTest {

        @Test
        public void testPojo () throws Exception{
            Instructor in = new Instructor();
            in.setBatch(10);
            in.setFirstName("James");
            in.setLastName("Milner");
            in.setId(7);
            in.setSubject("Intro to soccer");

            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(in);
            System.out.println(json);

            Instructor instructor2 = mapper.readValue(json,Instructor.class);
            System.out.println(instructor2.getFirstName());


        }
    }

