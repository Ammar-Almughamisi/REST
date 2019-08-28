package com.forms;

import com.Validator.CourseCode;

import javax.validation.constraints.*;

public class Student {
    private String firstName;
    @NotNull(message = "cannot be null")
    @Size(min = 1,message = "is required")
    private String lastName;
    @Min(value  = 0 , message = "must be greater than 0 ")
    @Max(value = 10 , message = "must be less than 10 ")
    private int freePasses;
    @Pattern(regexp = "^[a-zA-Z0-9]{5}" , message = "only 5 chars/digit")
    private String postalCode;
    @CourseCode(value = "LUV" , message = "must start with LUV")
    private String customVald;

    public String getCustomVald() {
        return customVald;
    }

    public void setCustomVald(String customVald) {
        this.customVald = customVald;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public Student() {
    }

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
}
