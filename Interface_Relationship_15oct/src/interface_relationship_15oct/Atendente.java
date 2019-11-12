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
public class Atendente extends Pessoa{
    private String turno;

    
    public Atendente(String turno, String first_name, String last_name, String cpf, int idade){
        this.turno = turno;
        this.first_name = first_name;
        this.last_name = last_name;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    @Override
    public void imprimir (){
        System.out.println("Atendente");
        System.out.println(" ");
        super.imprimir();
        System.out.println("Turno: " + turno);
    }
    
    
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
