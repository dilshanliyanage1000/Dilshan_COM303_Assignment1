//	DILSHAN LIYANAGE 301-279-203
//	SUBMITTED IN 04-FEB-2024

package com.example.demo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Order {
	
	@NotBlank(message = "First name cannot be blank!")
	private String firstName;
	
    private String middleName;
    
    @NotBlank(message = "Last name cannot be blank!")
    private String lastName;
    
    @Email(message = "Invalid email address!")
    private String email;
    
    @NotBlank(message = "Area Code cannot be blank!")
    private String areaCode;
    
    @NotBlank(message = "Phone Number cannot be blank!")
    private String phoneNumber;
    
    @NotBlank(message = "Street Address cannot be blank!")
    private String streetAddress;
    
    private String streetAddressTwo;
    
    @NotBlank(message = "City cannot be blank!")
    private String city;
    
    @NotBlank(message = "Province/State cannot be blank!")
    private String stateProvince;
    
    @NotBlank(message = "Postal/Zip Code cannot be blank!")
    private String postalZipCode;
    
    @NotBlank(message = "Country cannot be blank!")
    private String country;
    
    @NotBlank(message = "Product Code cannot be blank!")
    private String productCode;
    
    @NotBlank(message = "Choose Product Brand!")
    private String phoneBrand;
    
    @NotBlank(message = "Choose Product Model!")
    private String phoneModel;
    
    @Min(value = 1, message = "Quantity must be at least 1")
    private int quantity;

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getStreetAddressTwo() {
        return streetAddressTwo;
    }

    public String getCity() {
        return city;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public String getPostalZipCode() {
        return postalZipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getPhoneBrand() {
        return phoneBrand;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setStreetAddressTwo(String streetAddressTwo) {
        this.streetAddressTwo = streetAddressTwo;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public void setPostalZipCode(String postalZipCode) {
        this.postalZipCode = postalZipCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setPhoneBrand(String phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}