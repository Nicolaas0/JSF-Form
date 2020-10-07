/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Nicolaas'
 */
@ManagedBean
@RequestScoped
public class bean {
    private String ID;
    private String PASS;
    /**
     * Creates a new instance of Bean
     */
    public bean() {
    }
    
    public String Action() {
    if (getID().equals("student") && getPASS().equals("password@123")) {
return "student";
}
else {
return "error";
}
}
public String getID() {
return ID;
}

public void setID(String ID) {
this.ID = ID;
}
public String getPASS() {
return PASS;
}
public void setPASS(String PASS) {
this.PASS = PASS;
}
}

