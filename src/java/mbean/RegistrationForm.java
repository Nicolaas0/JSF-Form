/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author Nicolaas'
 */
@Named(value = "registrationForm")
@RequestScoped

public class RegistrationForm {
private String firstName;
private String lastName;
private String gender;
private Date dateofBirth;
private String address;
private String contactNumber;
private String emailID;
private String userID;
private String password;
private String confirmPassword;

private String FinalPassword;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public void setFinalPassword(String FinalPassword) {
        this.FinalPassword = FinalPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public String getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public String getFinalPassword() {
        return FinalPassword;
    }


    /**
     * Creates a new instance of RegistrationForm
     */
    public RegistrationForm() {
    }
    
    public void validateEmail(FacesContext fc, UIComponent c, Object value)throws
ValidatorException {
String email= (String)value;
Pattern mask = null;
mask = Pattern.compile(".+@.+\\.[a-z]+");
Matcher matcher = mask.matcher(email);
if (!matcher.matches())
{
FacesMessage message = new FacesMessage();
message.setDetail("Invalid e-mail ID");
message.setSummary("Invalid e-mail ID");
throw new ValidatorException(message);
}
}
    
public void validateFinalPassword(FacesContext fc, UIComponent c, Object value)throws
ValidatorException {
setFinalPassword((String) value);
}

public void validateCPassword(FacesContext fc, UIComponent c, Object value)throws
ValidatorException
{
String cPassword= (String)value;
RegistrationForm rf=new RegistrationForm();
System.out.println(getFinalPassword());
if (cPassword.compareTo(getFinalPassword())!=0 ) {
FacesMessage message = new FacesMessage();
message.setSummary("Password does not match");
throw new ValidatorException(message);
}
}
}
    

