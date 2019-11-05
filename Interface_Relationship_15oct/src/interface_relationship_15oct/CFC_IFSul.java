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
        
        Carro c1 = new Carro("Azul", "IIAB0", 4, "FIAT UNO");
        Onibus o2 = new Onibus("Branco", "OHG87HH", 32, "Volvo");
       
        c1.imprimir();
        o2.imprimir();
        
        
        
    }
    
}
