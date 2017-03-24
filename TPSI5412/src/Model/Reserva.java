/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author BD
 */
public class Reserva {
    private int ID;
    ArrayList<Cliente> cli;
    ArrayList<Restaurante> res;
    private String prato;

    public Reserva(int ID, ArrayList<Cliente> cli, ArrayList<Restaurante> res, String prato) {
        this.ID = ID;
        this.cli = cli;
        this.res = res;
        this.prato = prato;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

   

    public ArrayList<Cliente> getCli() {
        return cli;
    }

    public void setCli(ArrayList<Cliente> cli) {
        this.cli = cli;
    }

    public ArrayList<Restaurante> getRes() {
        return res;
    }

    public void setRes(ArrayList<Restaurante> res) {
        this.res = res;
    }

    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }
    
    
    
    
}
