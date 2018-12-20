package example;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

@Record(minOccurs=0, maxOccurs=-1)
@Fields({
    @Field(at=0, name="recordType", rid=true, literal="D")
})
public class Contact {
    @Field(at=1, maxLength=20)
    String firstName;	
    @Field(at=2, required=true, maxLength=30)
    String lastName;
    @Field(at=3, maxLength=30)
    String street;
    @Field(at=4, maxLength=25)
    String city;
    @Field(at=5, minLength=2, maxLength=2)
    String state;
    @Field(at=6)
    String zip;
    
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
    
    // getters and setters not shown...
    
    
}