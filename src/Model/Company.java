/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
<<<<<<< Updated upstream

=======
import java.util.ArrayList;
import javax.swing.JOptionPane;
>>>>>>> Stashed changes
/**
 *
 * @author Wilson
 */
public class Company {
<<<<<<< Updated upstream
    
=======
    private ArrayList <Contact> contact = new ArrayList<>();
    private ArrayList <Partner> partner = new ArrayList<>();

    public Company() {
    }

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
    
    public void AddContact(String id_contact, String contact_name){
        
    }
    
    public void DeleteContact(String contact_name){
        boolean found = false;
        for (int i = 0; i < contact.size(); i++) {
            if (contact.get(i).getContact_Name().equals(contact_name)) {
                found=true;
                contact.remove(i);
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Contact Tidak Ditemukan");
        }
    }
>>>>>>> Stashed changes
}
