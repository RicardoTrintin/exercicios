package interface_relationship_15oct;

public class Moto extends Automovel{
    private int cilindradas;

    public Moto(String cor, String placa, int cilindradas, String modelo){
        this.cor = cor;
        this.placa = placa;
        this.modelo = modelo;
        this.cilindradas = cilindradas;
    }
    
    @Override
    public void imprimir (){
        System.out.println("MOTO");
        System.out.println(" ");
        super.imprimir();
        System.out.println("Numero de colindradas: " + cilindradas);
        System.out.println(" ");
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
