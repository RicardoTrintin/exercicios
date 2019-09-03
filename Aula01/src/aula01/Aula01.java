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
                    System.out.println("Opção 1 escolhida: "+(int) (Math.random() * 50 + 1));
                    break;
                case 2:
                    System.out.println("Opção 2 escolhida. \n Imprimindo nros Ímpares.");
                    printNumbers("Ímpar");
                    break;
                case 3:
                    System.out.println("Opção 3 escolhida. \n Imprimindo nros Pares.");
                    printNumbers("Par");
                    break;
                case 4: 
                    System.out.println("Opção 4 escolhida. Encerrando programa.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção Inválida, tente novamente.");
                    op = -1;
                    break;
            }
        }while(op!=0);
    }
    
    public static void printNumbers(String op){
        if(op=="Par"){
            for(int i=0; i<100; i++){
                if(i%2==0){
                    System.out.println("Nro: "+i);
                }
            }
        } else{
            for(int i=0; i<100; i++){
                if(i%2!=0){
                    System.out.println("Nro: "+i);
                }
            }
        }
    }
}
