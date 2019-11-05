package interface_relationship_15oct;
import java.util.Random;

/**
 *
 * @author joaojrmachado
 */
public class Instrutor extends Pessoa {
    private int id;
    private Automovel aut;
    
    Random randon = new Random();
    
    public Instrutor(Automovel carro){
        this.id = randon.nextInt();
        this.aut = carro;
    }
    
    public Instrutor(int id, Automovel aut, String first_name, String last_name, String cpf, int idade){
        this.id = id;
        this.aut = aut;
        this.first_name = first_name;
        this.last_name = last_name;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    
    @Override
    public void imprimir (){
        System.out.println("Instrutor");
        System.out.println(" ");
        super.imprimir();
        System.out.println("ID: " + id);
        System.out.println("Modelo carro" + aut.modelo);
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
