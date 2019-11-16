package interface_relationship_15oct;

public abstract class Pessoa extends Endereco{
    protected String first_name;
    protected String last_name;
    protected String cpf;
    protected int idade;
    
    
    public void imprimir () {
        System.out.println("Nome: " + this.first_name + " " + this.last_name);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);
        super.imprimir();
    }
    
}
