package interface_relationship_15oct;

import java.util.Scanner;
import java.util.Vector;

public class Moto extends Automovel {

    private int cilindradas;
    Vector<Automovel> vectorAut = new Vector();
    Scanner read = new Scanner(System.in);

    public Moto() {
        this.cilindradas = 0;
    }
    
    public Moto(String cor, String placa, int cilindradas, String modelo) {
        this.cor = cor;
        this.placa = placa;
        this.modelo = modelo;
        this.cilindradas = cilindradas;
    }

    @Override
    public void imprimir() {
        System.out.println("MOTO");
        System.out.println(" ");
        super.imprimir();
        System.out.println("Numero de colindradas: " + cilindradas);
        System.out.println(" ");
    }

    public Moto inserir() {
        System.out.print("Digite a cor: ");
        String cor = read.next();
        System.out.print("Digite a placa: ");
        String placa = read.next();
        System.out.print("Digite o modelo: ");
        String modelo = read.next();
        System.out.print("Digite o numero de cilindradas: ");
        int cilindradas = read.nextInt();
        Moto moto = new Moto(cor, placa, cilindradas, modelo);
        
        return moto;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
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
