package interface_relationship_15oct;
import java.util.Scanner;
import java.util.Vector;

public class Atendente extends Pessoa {

    private String turno;
    Vector<Pessoa> VectorEmployee = new Vector();
    Scanner read = new Scanner(System.in);
    private Endereco end;

    public Atendente() {
        this.turno = null;
    }

    public Atendente(Endereco end, String turno, String first_name, String last_name, String cpf, int idade) {
        this.end = end;
        this.turno = turno;
        this.first_name = first_name;
        this.last_name = last_name;
        this.cpf = cpf;
        this.idade = idade;
    }

    @Override
    public void imprimir() {
        System.out.println(" ");
        System.out.println("Atendente");
        System.out.println(" ");
        super.imprimir();
        System.out.println("Turno: " + turno);
    }
    
    @Override
    public Atendente inserir(){
        System.out.println("## CADASTRO DE ATENDENTE ##");
        System.out.println(" ");
        System.out.print("Digite o turno: ");
        this.turno = read.nextLine();
        System.out.print("Digite o primeiro nome: ");
        this.first_name = read.nextLine();
        System.out.print("Digite o ultimo nome: ");
        this.last_name = read.nextLine();
        System.out.print("Digite o cpf: ");
        this.cpf = read.next();
        System.out.print("Digite a idade: ");
        this.idade = read.nextInt();
        read.nextLine();
        this.end = super.inserir();
        
        return this;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
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