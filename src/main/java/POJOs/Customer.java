package POJOs;

import java.util.HashMap;
import java.util.Map;
//import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"First Name",
	"Last Name",
	"Street Address1",
	"Street Address2",
	"City",
	"State1",
	"zipcode",
	"email"
})
//@Generated("jsonschema2pojo")
public class Customer {

	@JsonProperty("First Name")
	private String firstName;
	@JsonProperty("Last Name")
	private String lastName;
	@JsonProperty("Street Address1")
	private String streetAddress1;
	@JsonProperty("Street Address2")
	private String streetAddress2;
	@JsonProperty("City")
	private String city;
	@JsonProperty("State1")
	private String state1;
	@JsonProperty("zipcode")
	private String zipcode;
	@JsonProperty("email")
	private String email;
	@JsonProperty("Country")
	private String Country;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("First Name")
	public String getFirstName() {
		return firstName;
	}

	@JsonProperty("First Name")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@JsonProperty("Last Name")
	public String getLastName() {
		return lastName;
	}

	@JsonProperty("Last Name")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@JsonProperty("Street Address1")
	public String getStreetAddress1() {
		return streetAddress1;
	}

	@JsonProperty("Street Address1")
	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}

	@JsonProperty("Street Address2")
	public String getStreetAddress2() {
		return streetAddress2;
	}

	@JsonProperty("Street Address2")
	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}

	@JsonProperty("City")
	public String getCity() {
		return city;
	}

	@JsonProperty("City")
	public void setCity(String city) {
		this.city = city;
	}

	@JsonProperty("State1")
	public String getState1() {
		return state1;
	}

	@JsonProperty("State1")
	public void setState1(String state1) {
		this.state1 = state1;
	}

	@JsonProperty("zipcode")
	public String getZipcode() {
		return zipcode;
	}

	@JsonProperty("zipcode")
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@JsonProperty("Country")
	public String getCountry() {
		return Country;
	}

	@JsonProperty("Country")
	public void setgetCountry(String Country) {
		this.Country = Country;
	}


	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}



	public String  toString() {
		return("First Name :"+ getFirstName()+"/n"+
				"Last Name :"+ getLastName()+"/n"+
				"Street Address1 :"+ getStreetAddress1()+"/n"+
				"Street Address2 :"+ getStreetAddress2()+"/n"+
				"City :"+getCity()+"/n"+
				"State1 :"+ getState1()+"/n"+
				"Country :"+getCountry()+"/n"+
				"zipcode :"+getZipcode()+"/n"+
				"email :"+getEmail());
	}

}