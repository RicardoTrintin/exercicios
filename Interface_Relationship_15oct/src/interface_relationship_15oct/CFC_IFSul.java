package interface_relationship_15oct;

import java.util.Scanner;
import java.util.Vector;

public class CFC_IFSul {

    public static void main(String[] args) {

        int opcao;

        Vector<Pessoa> VectorEmployee = new Vector();
        Vector<Pessoa> VectorStudent = new Vector();
        Vector<Automovel> vectorAut = new Vector();
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
                System.out.print("ESCOLHA UMA DAS OPCOES ACIMA: ");
                opcao = read.nextInt();
                read.nextLine();
                if (opcao == 1) {
                    Carro carro = new Carro();
                    carro = carro.inserir();
                    vectorAut.add(carro);
                    System.out.println(" ");
                } else if (opcao == 2) {
                    Onibus bus = new Onibus();
                    bus = bus.inserir();
                    vectorAut.add(bus);
                    System.out.println(" ");
                } else {
                    Moto moto = new Moto();
                    moto = moto.inserir();
                    vectorAut.add(moto);
                    System.out.println(" ");
                }
            } else if (opcao == 2) {
                for (Automovel vector : vectorAut) {
                    vector.imprimir();
                }
            } else if (opcao == 3) {
                System.out.println("#### CADASTRO DE FUNCIONARIO ####");
                System.out.println(" ");
                System.out.println("1 - CADASTRAR ATENDENTE");
                System.out.println("2 - CADASTRAR INSTRUTOR");
                System.out.println(" ");
                opcao = read.nextInt();
                if (opcao == 1) {
                    Atendente atendente = new Atendente();
                    atendente = atendente.inserir();
                    VectorEmployee.add(atendente);
                } else if (opcao == 2) {
                    Instrutor instrutor = new Instrutor();
                    instrutor = instrutor.inserir();
                    if (instrutor != null) {
                        VectorEmployee.add(instrutor);
                    } else {
                        System.out.println("Placa nao encontrada!");
                        System.out.println(" ");
                    }
                }
            } else if (opcao == 4) {
                for (Pessoa vector : VectorEmployee) {
                    vector.imprimir();
                }
            } else if (opcao == 5) {
                Aluno aluno = new Aluno();
                aluno = aluno.inserir();
                VectorStudent.add(aluno);
            } else if (opcao == 6) {
                for (Pessoa vector : VectorStudent) {
                    vector.imprimir();
                }
            }
        } while (opcao != 0);

    }

}
