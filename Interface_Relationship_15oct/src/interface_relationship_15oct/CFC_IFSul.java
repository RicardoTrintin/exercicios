package interface_relationship_15oct;
import java.util.Scanner;
import java.util.Vector;

public class CFC_IFSul {

    public static void main(String[] args) {

        int opcao;

        
        Vector<Pessoa> VectorEmployee = new Vector();
        Vector<Pessoa> VectorStudent = new Vector();
        Scanner read = new Scanner(System.in);
        Endereco endedereco = new Endereco();
        
        do {
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
                if (opcao == 1) {
                    Carro carro = new Carro();
                    carro.inserir();
                } else if (opcao == 2) {
                    System.out.print("Digite a cor: ");
                    String cor = read.next();
                    System.out.print("Digite a placa: ");
                    String placa = read.next();
                    System.out.print("Digite o modelo: ");
                    String modelo = read.next();
                    System.out.print("Digite o numero de lugares: ");
                    int numLugares = read.nextInt();
                    Onibus onibus = new Onibus(cor, placa, numLugares, modelo);
                    //vectorAut.add(onibus);
                } else {
                    System.out.print("Digite a cor: ");
                    String cor = read.next();
                    System.out.print("Digite a placa: ");
                    String placa = read.next();
                    System.out.print("Digite o modelo: ");
                    String modelo = read.next();
                    System.out.print("Digite o numero de cilindradas: ");
                    int cilindradas = read.nextInt();
                    Moto moto = new Moto(cor, placa, cilindradas, modelo);
                    //vectorAut.add(moto);
                }
            } else if (opcao == 2) {
//                for (Automovel vector : vectorAut) {
//                    vector.imprimir();
//                }
            } else if (opcao == 3) {
                System.out.println("#### CADASTRO DE FUNCIONARIO ####");
                System.out.println(" ");
                System.out.println("1 - CADASTRAR ATENDENTE");
                System.out.println("2 - CADASTRAR INSTRUTOR");
                System.out.println(" ");
                opcao = read.nextInt();
                if (opcao == 1) {
                    System.out.print("Digite o turno: ");
                    String turno = read.next();
                    System.out.print("Digite o primeiro nome: ");
                    String first_name = read.nextLine();
                    System.out.print("Digite o ultimo nome: ");
                    String last_name = read.nextLine();
                    System.out.print("Digite o cpf: ");
                    String cpf = read.next();
                    System.out.print("Digite a idade: ");
                    int idade = read.nextInt();
                    Endereco end = endedereco.inserir();
                    Atendente atendente = new Atendente(end, turno, first_name, last_name, cpf, idade);
                    VectorEmployee.add(atendente);
                } else if (opcao == 2) {
                    System.out.print("Digite o primeiro nome: ");
                    String first_name = read.nextLine();
                    System.out.print("Digite o ultimo nome: ");
                    String last_name = read.nextLine();
                    System.out.print("Digite o cpf: ");
                    String cpf = read.next();
                    System.out.print("Digite a idade: ");
                    int idade = read.nextInt();
                    System.out.println("Digite a placa do carro para este instrutor: ");
                    String placa = read.next();
                    //int i = 0;
//                    for (int i = 0; i < vectorAut.size(); i++) {
//                        String placa1vect = vectorAut.get(i).placa;
//                        Automovel car = vectorAut.get(i);
//                        if (placa1vect.equals(placa)) {
//                            Instrutor instrutor = new Instrutor(car, first_name, last_name, cpf, idade);
//                            VectorEmployee.add(instrutor);
//                        }
//                    }
                }
            } else if (opcao == 4) {
                for (Pessoa vector : VectorEmployee) {
                    vector.imprimir();
                }
            } else if (opcao == 5) {
                System.out.println("#### CADASTRO DE ALUNO ####");
                System.out.println(" ");
                System.out.print("Digite o primeiro nome: ");
                String first_name = read.nextLine();
                System.out.print("Digite o ultimo nome: ");
                String last_name = read.nextLine();
                System.out.print("Digite o cpf: ");
                String cpf = read.next();
                System.out.print("Digite a idade: ");
                int idade = read.nextInt();
                System.out.println("Digite a categoria deste aluno: ");
                char categoria = read.next().charAt(0);
                Aluno aluno = new Aluno(categoria, first_name, last_name, cpf, idade);
                VectorStudent.add(aluno);
            } else if (opcao == 6) {
                for (Pessoa vector : VectorStudent) {
                    vector.imprimir();
                }
            }
        } while (opcao != 0);

    }

}
