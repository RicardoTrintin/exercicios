package interface_relationship_15oct;

public class Atendente extends Pessoa{
    private String turno;
    private Endereco end; 

    
    public Atendente(Endereco end, String turno, String first_name, String last_name, String cpf, int idade){
        this.end = end;
        this.turno = turno;
        this.first_name = first_name;
        this.last_name = last_name;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    @Override
    public void imprimir (){
        System.out.println("Atendente");
        System.out.println(" ");
        super.imprimir();
        System.out.println("Turno: " + turno);
    }
    
    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
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
