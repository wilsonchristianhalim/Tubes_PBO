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
public class Admin {
    private String ID_Admin;
    private String PW_Admin;
    private String Name;

    public Admin(String ID_Admin, String PW_Admin, String Name) {
        this.ID_Admin = ID_Admin;
        this.PW_Admin = PW_Admin;
        this.Name = Name;
    }

    public String getID_Admin() {
        return ID_Admin;
    }

    public void setID_Admin(String ID_Admin) {
        this.ID_Admin = ID_Admin;
    }

    public String getPW_Admin() {
        return PW_Admin;
    }

    public void setPW_Admin(String PW_Admin) {
        this.PW_Admin = PW_Admin;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public String toString() {
        return "Admin{" + "ID_Admin=" + ID_Admin + ", PW_Admin=" + PW_Admin + ", Name=" + Name + '}';
    }
    
}
