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

    @Override
    public String toString() {
        return ("Rua: " + this.getRua() + " numero: " + this.getNumero() + " cidade: " + this.getCidade());

    }

    public void imprimir (){
        System.out.println(" ");
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Rua: " + this.rua);
        System.out.println("Estado: " + this.estado);
    }
    
    public Endereco inserir() {
        Scanner read = new Scanner(System.in);
        System.out.println("rua: ");
        String rua = read.next();
        System.out.println("numero: ");
        int numero = read.nextInt();
        System.out.println("cidade: ");
        String cidade = read.next();
        System.out.println("estado: ");
        String estado = read.next();
        Endereco end = new Endereco(rua, numero, cidade, estado);
        
        return end;
    }

}
