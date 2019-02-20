package Api_Pojo_Model;


import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonInclude;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)

    public class RequestBody {
        private  String  firstName;
        private  String lastName;

        public String getFirstName() {

            return firstName;
        }

        public void setFirstName(String firstName) {

            this.firstName = firstName;
        }
    }


