package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastName;
	
	// Validation min,max of numeric values
	@NotNull(message="is required")
	@Min(value=0, message="must be greater than or equal to 0")
	@Max(value=10, message="cannot have more than 10 free passes")
	private Integer freePasses;
	
	//Regex validation
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits for the postal code")
	public String postalCode; 
	
	
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
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	
}
