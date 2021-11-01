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
public class Contack {
    private String ID_Contack;
    private String Contack_Name;

    public Contack(String ID_Contack, String Contack_Name) {
        this.ID_Contack = ID_Contack;
        this.Contack_Name = Contack_Name;
    }

    public String getID_Contack() {
        return ID_Contack;
    }

    public void setID_Contack(String ID_Contack) {
        this.ID_Contack = ID_Contack;
    }

    public String getContack_Name() {
        return Contack_Name;
    }

    public void setContack_Name(String Contack_Name) {
        this.Contack_Name = Contack_Name;
    }

    @Override
    public String toString() {
        return "Contack{" + "ID_Contack=" + ID_Contack + ", Contack_Name=" + Contack_Name + '}';
    }
    
}
