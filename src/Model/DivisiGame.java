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
public class DivisiGame {
    private String Divisi;
    private String games;

    public DivisiGame(String Divisi) {
        this.Divisi = Divisi;
    }

    public String getDivisi() {
        return Divisi;
    }

    public void setDivisi(String Divisi) {
        this.Divisi = Divisi;
    }

    @Override
    public String toString() {
        return "DivisiGame{" + "Divisi=" + Divisi + '}';
    }
    
    
}
