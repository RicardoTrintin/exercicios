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
public class Onibus extends Automovel{
    private int numLugares;

    public Onibus(String cor, String placa, int numLugares, String modelo){
        this.cor = cor;
        this.placa = placa;
        this.modelo = modelo;
        this.numLugares = numLugares;
    }
    
    @Override
    public void imprimir (){
        System.out.println("ONIBUS");
        System.out.println(" ");
        super.imprimir();
        System.out.println("Numero de lugares: " + numLugares);
        System.out.println(" ");
    }
    
    public int getNumLugares() {
        return numLugares;
    }

    public void setNumLugares(int numLugares) {
        this.numLugares = numLugares;
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
