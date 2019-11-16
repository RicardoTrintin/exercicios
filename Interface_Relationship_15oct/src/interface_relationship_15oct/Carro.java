package interface_relationship_15oct;

import java.util.Scanner;
import java.util.Vector;

public class Carro extends Automovel {

    private int numPortas;
    Scanner read = new Scanner(System.in);
    Vector<Automovel> vectorAut = new Vector();
    
    public Carro() {
        this.numPortas = 0;
    }

    public Carro(String cor, String placa, int numPortas, String modelo) {
        this.cor = cor;
        this.placa = placa;
        this.modelo = modelo;
        this.numPortas = numPortas;
    }

    @Override
    public void imprimir() {
        System.out.println(" ");
        System.out.println("CARRO");
        System.out.println(" ");
        super.imprimir();
        System.out.println("Numero de portas: " + numPortas);
        System.out.println(" ");
    }

    public void inserir() {
        System.out.print("Digite a cor: ");
        String cor = read.next();
        System.out.print("Digite a placa: ");
        String placa = read.next();
        System.out.print("Digite o modelo: ");
        String modelo = read.next();
        System.out.print("Digite o numero de portas: ");
        int numPortas = read.nextInt();
        Carro carro = new Carro(cor, placa, numPortas, modelo);
        vectorAut.add(carro);
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
