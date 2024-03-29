package interface_relationship_15oct;
import java.util.Scanner;

public class Automovel implements Tipo {

    protected String placa;
    protected String cor;
    protected String modelo;
    Scanner read = new Scanner(System.in);

    public Automovel inserir() {
        System.out.print("Digite a cor: ");
        String cor = read.next();
        System.out.print("Digite a placa: ");
        String placa = read.next();
        System.out.print("Digite o modelo: ");
        String modelo = read.next();
        Automovel auto = new Automovel(placa, cor, modelo);
        
        return auto;
    }

    public void imprimir() {
        System.out.println("Placa: " + this.placa);
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
    }

    protected Instrutor inst;

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

    public Instrutor getInst() {
        return inst;
    }

    public void setInst(Instrutor inst) {
        this.inst = inst;
    }

    @Override
    public int numPneus() {
        return 1;
    }

    @Override
    public int numCavalos() {
        return 1;
    }

    //construtor vazio
    public Automovel() {
        this("", "", "");
    }

    //construtor default
    public Automovel(String placa, String cor, String modelo) {
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
    }
}
