/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_relationship_15oct;

/**
 *
 * @author joaojrmachado
 */
public abstract class Pessoa {
    protected String first_name;
    protected String last_name;
    protected String cpf;
    protected int idade;
    
    
    public void imprimir () {
        System.out.println("Nome: " + this.first_name + " " + this.last_name);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);
    }
    
}
