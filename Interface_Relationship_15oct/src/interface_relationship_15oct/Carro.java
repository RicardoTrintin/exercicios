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
public class Carro extends Automovel{
    private int numPortas;

    public Carro(){
        this.numPortas = 0;
    }
    
    public Carro(String cor, String placa, int numPortas, String modelo){
        this.cor = cor;
        this.placa = placa;
        this.modelo = modelo;
        this.numPortas = numPortas;
    }
    
    @Override
    public void imprimir (){
        super.imprimir();
        System.out.println("Numero de portas: " + numPortas);
        System.out.println(" ");
    }
    
    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
