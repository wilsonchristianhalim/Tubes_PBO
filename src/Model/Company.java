/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author Wilson
 */
public class Company {
    private ArrayList <Contact> contact = new ArrayList<>();
    private ArrayList <Partner> partner = new ArrayList<>();

    public ArrayList<Contact> getContact() {
        return contact;
    }

    public void setContact(ArrayList<Contact> contact) {
        this.contact = contact;
    }

    public ArrayList<Partner> getPartner() {
        return partner;
    }

    public void setPartner(ArrayList<Partner> partner) {
        this.partner = partner;
    }

    @Override
    public String toString() {
        return "Company{" + "contact=" + contact + ", partner=" + partner + '}';
    }
    
    public void PrintContact(){
        
    }
}
