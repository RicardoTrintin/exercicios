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
public class CFC_IFSul {
    public static void main(String[] args){
        
        Carro carro = new Carro("Azul", "IIAB0", 4, "FIAT UNO");
        Onibus onibus = new Onibus("Branco", "OHG87HH", 32, "Volvo");
        
        carro.imprimir();
        onibus.imprimir();
        
        
    }
    
}
