/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

import java.util.Scanner;

/**
 *
 * @author joaojrmachado
 */
public class Aula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int op=-1;
        do{
            System.out.println("Escolha sua opcão de 1..4:");
            op = input.nextInt();
            switch(op){
                case 1:
                    System.out.println("Opção 1 escolhida: "+Math.random());
                    break;
                case 2:
                    System.out.println("Opção 2 escolhida.");
                    break;
                case 3:
                    System.out.println("Opção 3 escolhida.");
                    break;
                case 4: 
                    System.out.println("Opção 4 escolhida.");
                    break;
                default:
                    System.out.println("Opção Inválida, tente novamente.");
                    op = -1;
                    break;
            }
        }while(op!=0);
    }
}
