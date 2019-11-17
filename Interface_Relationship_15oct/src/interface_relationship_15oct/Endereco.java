package interface_relationship_15oct;

import java.util.Scanner;

public class Endereco {

    private String rua;
    private int numero;
    private String cidade;
    private String estado;

    public Endereco(String rua, int numero, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Endereco() {
        this.rua = "";
        this.numero = 0;
        this.cidade = "";
        this.estado = "";
    }
    
        public void imprimir (){
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Rua: " + this.rua);
        System.out.println("Estado: " + this.estado);
    }
    
    public Endereco inserir() {
        Scanner read = new Scanner(System.in);
        System.out.print("Rua: ");
        String rua = read.nextLine();
        System.out.print("Numero: ");
        int numero = read.nextInt();
        read.nextLine();
        System.out.print("Cidade: ");
        String cidade = read.nextLine();
        System.out.print("Estado: ");
        String estado = read.nextLine();
        Endereco end = new Endereco(rua, numero, cidade, estado);
        
        return end;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
