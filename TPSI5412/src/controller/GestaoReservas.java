/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Cliente;
import Model.Reserva;
import Model.Restaurante;
import java.util.ArrayList;

/**
 *
 * @author BD
 */
public class GestaoReservas {

    ArrayList<Reserva> re;
    ArrayList<Cliente> cli;
    ArrayList<Restaurante> res;

    public GestaoReservas(ArrayList<Reserva> re) {
        this.re = re;
    }

    /*  public void addCliente(String nome, String morada, String email, String telefone) {
    Cliente C = new Cliente(nome, morada, email, telefone);
    int novoId = cli.size();
    
    C.setID(novoId);
    
    re.add(R);
    
    }*/
    
    
    
    
    
    
    
    
    
    public void addReserva(int ID, ArrayList<Cliente> cli, ArrayList<Restaurante> res, String prato) {
        Reserva R = new Reserva(ID, cli, res, prato);
        int novoId = re.size();

        R.setID(novoId);

        re.add(R);

    }

    public void addReserva(Reserva R) {
        int novoId = re.size();

        R.setID(novoId);

        re.add(R);
    }

}
