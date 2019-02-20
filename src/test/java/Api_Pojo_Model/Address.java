package Api_Pojo_Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class Address {
    String city;


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
