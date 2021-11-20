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
public class Partner {
    private String ID_Partner;
    private String Partner_Name;

    public Partner(String ID_Partner, String Partner_Name) {
        this.ID_Partner = ID_Partner;
        this.Partner_Name = Partner_Name;
    }

    public Partner() {
        
    }

    public String getID_Partner() {
        return ID_Partner;
    }

    public void setID_Partner(String ID_Partner) {
        this.ID_Partner = ID_Partner;
    }

    public String getPartner_Name() {
        return Partner_Name;
    }

    public void setPartner_Name(String Partner_Name) {
        this.Partner_Name = Partner_Name;
    }

    @Override
    public String toString() {
        return "Partner{" + "ID_Partner=" + ID_Partner + ", Partner_Name=" + Partner_Name + '}';
    }
    
}
