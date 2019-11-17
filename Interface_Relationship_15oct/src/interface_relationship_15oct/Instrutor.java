package interface_relationship_15oct;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Instrutor extends Pessoa {

    private int id;
    private Automovel aut;
    Random randon = new Random();
    Vector<Pessoa> VectorEmployee = new Vector();
    Vector<Automovel> vectorAut = new Vector();
    private Endereco end;
    Scanner read = new Scanner(System.in);

    public Instrutor() {
        this.id = randon.nextInt();
    }

    public Instrutor(Automovel carro) {
        this.id = randon.nextInt();
        this.aut = carro;
    }

    public Instrutor(Endereco end, Automovel aut, String first_name, String last_name, String cpf, int idade) {
        this.end = end;
        this.id = randon.nextInt(100);
        this.aut = aut;
        this.first_name = first_name;
        this.last_name = last_name;
        this.cpf = cpf;
        this.idade = idade;
    }

    @Override
    public Instrutor inserir() {
        System.out.println("## CADASTRO DE INTRUTOR ##");
        System.out.println(" ");
        System.out.print("Digite o primeiro nome: ");
        String first_name = read.nextLine();
        System.out.print("Digite o ultimo nome: ");
        String last_name = read.nextLine();
        System.out.print("Digite o cpf: ");
        String cpf = read.next();
        System.out.print("Digite a idade: ");
        int idade = read.nextInt();
        end = super.inserir();
        System.out.println("Digite a placa do carro para este instrutor: ");
        String placa = read.next();
        for (int i = 0; i < vectorAut.size(); i++) {
            Automovel car = vectorAut.get(i);
            if (car.placa.equals(placa)) {
                Instrutor instrutor = new Instrutor(end, car, first_name, last_name, cpf, idade);
                return instrutor;
            }
        }
        return null;
    }

    @Override
    public void imprimir() {
        System.out.println("Instrutor");
        System.out.println(" ");
        super.imprimir();
        System.out.println("ID: " + id);
        System.out.println("Modelo do automovel: " + aut.modelo);
        System.out.println(" ");
    }

    public Automovel getAut() {
        return aut;
    }

    public void setAut(Automovel aut) {
        this.aut = aut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
