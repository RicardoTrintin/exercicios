package interface_relationship_15oct;

public class Aluno extends Pessoa{
    private char categoriaHabilitacao;

    
    public Aluno(char categoriaHabilitacao, String first_name, String last_name, String cpf, int idade){
        this.categoriaHabilitacao = categoriaHabilitacao;
        this.first_name = first_name;
        this.last_name = last_name;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    
    @Override
    public void imprimir (){
        System.out.println("Aluno");
        System.out.println(" ");
        super.imprimir();
        System.out.println("Categoria Habilitação: " + categoriaHabilitacao);
    }
    
    
    public char getCategoriaHabilitacao() {
        return categoriaHabilitacao;
    }

    public void setCategoriaHabilitacao(char categoriaHabilitacao) {
        this.categoriaHabilitacao = categoriaHabilitacao;
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
