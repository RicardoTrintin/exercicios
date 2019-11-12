package interface_relationship_15oct;	
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;


public class CFC_IFSul {
    public static void main(String[] args){
        
        int opcao;
        
        Vector<Automovel> vectorAut = new Vector();
        Vector<Pessoa> VectorEmployee = new Vector();
        Vector<Pessoa> VectorStudent = new Vector();
        Scanner read = new Scanner(System.in);
        //Onibus onibus = new Onibus("Branco", "OHG87HH", 32, "Volvo");
        //11Instrutor instrutor = new Instrutor(1, carro, "Paulo", "Ricardo", "01587604094", 22);
        
        do{
            System.out.println("1 - CADASTRAR AUTOMOVEL");
            System.out.println("2 - LISTAR AUTOMOVEIS");
            System.out.println("3 - CADASTRAR FUNCIIONARIO");
            System.out.println("4 - LISTAR FUNCIONARIOS");
            System.out.println("5 - CADASTRAR ALUNO");
            System.out.println("6 - LISTAR ALUNOS");
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
                    vectorAut.add(carro);
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
                    System.out.print("Digite o numero de lugares: ");
                    numLugares = read.nextInt();
                    Onibus onibus = new Onibus(cor, placa, numLugares, modelo);
                    vectorAut.add(onibus);
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
                    System.out.print("Digite o numero de cilindradas: ");
                    cilindradas = read.nextInt();
                    Moto moto = new Moto(cor, placa, cilindradas, modelo);
                    vectorAut.add(moto);
                }
            }else if (opcao == 2){
                for (Automovel vector: vectorAut){
                    vector.imprimir();
                }
            }else if (opcao == 3){
                System.out.println("#### CADASTRO DE FUNCIONARIO ####");
                System.out.println(" ");
                System.out.println("1 - CADASTRAR ATENDENTE");
                System.out.println("2 - CADASTRAR INSTRUTOR");
                System.out.println(" ");
                opcao = read.nextInt();
                if (opcao == 1){
                    String turno = "";
                    String first_name = "";
                    String last_name = "";
                    String cpf = "";
                    int idade = 0;
                    System.out.print("Digite o turno: ");
                    turno = read.next();
                    System.out.print("Digite o primeiro nome: ");
                    first_name = read.nextLine();
                    System.out.print("Digite o ultimo nome: ");
                    last_name = read.nextLine();
                    System.out.print("Digite o cpf: ");
                    cpf = read.next();
                    System.out.print("Digite a idade: ");
                    idade = read.nextInt();
                    Atendente atendente = new Atendente(turno, first_name, last_name, cpf, idade);
                    VectorEmployee.add(atendente);
                }else if (opcao == 2){                  
                    String first_name = "";
                    String last_name = "";
                    String cpf = "";
                    int idade = 0;
                    String placa = "";
                    
                    System.out.print("Digite o primeiro nome: ");
                    first_name = read.nextLine();
                    System.out.print("Digite o ultimo nome: ");
                    last_name = read.nextLine();
                    System.out.print("Digite o cpf: ");
                    cpf = read.next();
                    System.out.print("Digite a idade: ");
                    idade = read.nextInt();
                    System.out.println("Digite a placa do carro para este instrutor: ");
                    placa = read.next();
                    //int i = 0;
                    for (int i = 0; i < vectorAut.size(); i++){                    
                        String placa1vect = vectorAut.get(i).placa;
                        Automovel car = vectorAut.get(i);
                        car.imprimir();
                        if (placa1vect.equals(placa)){
                            Instrutor instrutor = new Instrutor(car, first_name, last_name, cpf, idade);
                            VectorEmployee.add(instrutor);
                        }
                    }
                }
            }else if (opcao == 4){
                for (Pessoa vector: VectorEmployee){
                    vector.imprimir();
                }
            }else if (opcao == 5){
                char categoria = ' ';
                String first_name = "";
                String last_name = "";
                String cpf = "";
                int idade = 0;           
                
                System.out.println("#### CADASTRO DE ALUNO ####");
                System.out.println(" ");    
                System.out.print("Digite o primeiro nome: ");
                first_name = read.nextLine();
                System.out.print("Digite o ultimo nome: ");
                last_name = read.nextLine();
                System.out.print("Digite o cpf: ");
                cpf = read.next();
                System.out.print("Digite a idade: ");
                idade = read.nextInt();
                System.out.println("Digite a categoria deste aluno: ");
                categoria = read.next().charAt(0);
                Aluno aluno = new Aluno(categoria, first_name, last_name, cpf, idade);
                VectorStudent.add(aluno);
            }else if (opcao == 6){
                for (Pessoa vector: VectorStudent){
                    vector.imprimir();
                }
            }
        }while (opcao != 0);
        
        
    }
    
}
