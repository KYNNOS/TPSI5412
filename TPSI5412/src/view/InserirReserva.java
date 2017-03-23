/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.Cliente;
import Model.Restaurante;
import java.util.Scanner;

/**
 *
 * @author BD
 */
public class InserirReserva {
    Cliente C;
   Restaurante R;
    private void inserirCliente(){
        
        
        
        
        System.out.println("Insira o nome do cliente");
        String nome = new Scanner(System.in).nextLine();
        System.out.println("Insira a morada do cliente ");
        String morada = new Scanner(System.in).nextLine();
        System.out.println("Insira o email do cliente");
        String email = new Scanner(System.in).nextLine();
        System.out.println("Insira o telefone do cliente");
        String telefone = new Scanner(System.in).nextLine();
        
        C.setNome(nome);
        C.setMorada(morada);
        C.setEmail(email);
        C.setTelefone(telefone);
    }

        private void inserirRestaurante(){
        
        
        
        
        System.out.println("Insira o nome do cliente");
        String nome = new Scanner(System.in).nextLine();
        System.out.println("Insira a morada do cliente ");
        String morada = new Scanner(System.in).nextLine();
        System.out.println("Insira o email do cliente");
        String contacto = new Scanner(System.in).nextLine();
        System.out.println("Insira o telefone do cliente");
        String especialidade = new Scanner(System.in).nextLine();
        
        R.setNome(nome);
        R.setMorada(morada);
        R.setContacto(contacto);
        R.setEspecialidade(especialidade);
    }

    private void inserirReserva(){
    
    
    
    
    }
        
        
}
