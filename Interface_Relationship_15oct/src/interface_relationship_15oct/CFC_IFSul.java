package interface_relationship_15oct;	
import java.util.Scanner;
import java.util.Vector;


public class CFC_IFSul {
    public static void main(String[] args){
        
        int opcao;
        
        Vector<Automovel> vetorCar = new Vector();
        Scanner read = new Scanner(System.in);
        //Onibus onibus = new Onibus("Branco", "OHG87HH", 32, "Volvo");
        //11Instrutor instrutor = new Instrutor(1, carro, "Paulo", "Ricardo", "01587604094", 22);
        
        System.out.println("1 - CADASTRAR AUTOMOVEL");
        System.out.println("2 - CADASTRAR FUNCIIONARIO");
        System.out.println("1 - CADASTRAR ALUNO");
        System.out.println("0 - SAIR");
        System.out.println(" ");
        System.out.print("ESCOLHA UMA DAS OPCOES ACIMA: ");
        opcao = read.nextInt();
        
        if (opcao == 1) {
            System.out.println("#### CADASTRO DE AUTOMOVEL ####");
            System.out.println(" ");
            System.out.println("1 - CADASTRAR CARRO");
            System.out.println("2 - CADASTRAR ONIBUS");
            System.out.println("3 - CADASTRAR MOTO");
            System.out.println(" ");
            opcao = read.nextInt();
            if (opcao == 1){
                String cor = "";
                String modelo = "";
                String placa = "";
                int numPortas = 0;
                System.out.print("Digite a cor: ");
                cor = read.next();
                System.out.print("Digite a placa: ");
                placa = read.next();
                System.out.print("Digite o modelo: ");
                modelo = read.next();
                System.out.print("Digite o numero de portas: ");
                numPortas = read.nextInt();
                Carro carro = new Carro(cor, placa, numPortas, modelo);
                vetorCar.add(carro);
                vetorCar.get(0).imprimir();

            }else if (opcao == 2){
                String cor = "";
                String modelo = "";
                String placa = "";
                int numLugares = 0;
                System.out.print("Digite a cor: ");
                cor = read.next();
                System.out.print("Digite a placa: ");
                placa = read.next();
                System.out.print("Digite o modelo: ");
                modelo = read.next();
                System.out.print("Digite o numero de portas: ");
                numLugares = read.nextInt();
            }else {
                String cor = "";
                String modelo = "";
                String placa = "";
                int cilindradas = 0;
                System.out.print("Digite a cor: ");
                cor = read.next();
                System.out.print("Digite a placa: ");
                placa = read.next();
                System.out.print("Digite o modelo: ");
                modelo = read.next();
                System.out.print("Digite o numero de portas: ");
                cilindradas = read.nextInt();
            }
        }else if (opcao == 2){
            System.out.println("#### CADASTRO DE FUNCIONARIO ####");
            System.out.println(" ");
            System.out.println("1 - CADASTRAR ATENDENTE");
            System.out.println("2 - CADASTRAR INSTRUTOR");
            System.out.println(" ");
            opcao = read.nextInt();
        }else {
            System.out.println("#### CADASTRO DE ALUNO ####");
            System.out.println(" ");
            
        }
        
        
    }
    
}
