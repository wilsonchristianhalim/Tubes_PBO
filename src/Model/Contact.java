/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Wilson
 */
public class Contact {

    private String ID_Contact;
    private String Contact_Name;

    public Contact(String ID_Contact, String Contact_Name) {
        this.ID_Contact = ID_Contact;
        this.Contact_Name = Contact_Name;
    }

    public Contact() {
        
    }

    public String getID_Contact() {
        return ID_Contact;
    }

    public void setID_Contact(String ID_Contact) {
        this.ID_Contact = ID_Contact;
    }

    public String getContact_Name() {
        return Contact_Name;
    }

    public void setContact_Name(String Contact_Name) {
        this.Contact_Name = Contact_Name;
    }

    @Override
    public String toString() {
        return "\nNomor Telepon : " + ID_Contact + "\nContact Name=" + Contact_Name + "";
    }

}
