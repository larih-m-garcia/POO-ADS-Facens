package poo.AC2.lista3.exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao = 0;
        int codigo = 0;
        ArrayList<Pessoa> pessoas = new ArrayList();

        while(opcao != 6){
            System.out.println("Menu:\n1- Criar Pessoa" +
                    "\n2- Criar Automovel" +
                    "\n3- Transferir Automovel" +
                    "\n4- Mostrar Todas as Pessoas" +
                    "\n5- Mostrar automóvel da pessoa" +
                    "\n6- Sair" +
                    "\nDigite a opção desejada: ");

            opcao = (input.nextInt());

            switch (opcao){
                case 1:
                    int codigoPessoa;
                    String nome;
                    System.out.println("Digite o Código da Pessoa: ");
                    codigoPessoa = (input.nextInt());
                    System.out.println("Digite o Nome da Pessoa: ");
                    nome = (input.next());

                    Pessoa p = new Pessoa(codigoPessoa, nome);
                    pessoas.add(p);
                    break;
                case 2:
                    String marca;
                    String modelo;
                    System.out.println("Digite a Marca do Automovel: ");
                    marca = (input.next());
                    System.out.println("Digite o Modelo do Automovel: ");
                    modelo = (input.next());
                    Automovel a = new Automovel(marca, modelo);
                    System.out.println("A quem este automovel pertence? (código)");
                    for (Pessoa pessoa: pessoas) {
                        System.out.println("\nCodigo: " + pessoa.getCodigo() + "\nNome: " + pessoa.getNome());
                    }
                    codigo = (input.nextInt());
                    for (Pessoa pessoa: pessoas){
                        if (pessoa.getCodigo() == codigo){
                            pessoa.inserirAutomovel(a);
                        }
                    }
                    break;
                case 3:
                    int codigoPessoaOrigem = 0;
                    int codigoPessoaDestino = 0;
                    int indexAuto = 0;
                    Automovel autoTransfer = new Automovel();
                    System.out.println("Digite o código da pessoa de origem:");
                    for (Pessoa pessoa: pessoas) {
                        System.out.println("\nCodigo: " + pessoa.getCodigo() + "\nNome: " + pessoa.getNome());
                    }
                    codigoPessoaOrigem = (input.nextInt());
                    System.out.println("Selecione o automovel da pessoa de origem: (código)");
                    for (Pessoa pessoa: pessoas){
                        if (pessoa.getCodigo() == codigoPessoaOrigem){
                            for (int i = 0; i < pessoa.getAutomoveis().size(); i++) {
                                System.out.println(i + " - " + "Marca: " + pessoa.getAutomoveis().get(i).getMarca() + " Modelo: " + pessoa.getAutomoveis().get(i).getModelo());
                            }
                            indexAuto = (input.nextInt());
                            autoTransfer.setMarca(pessoa.getAutomoveis().get(indexAuto).getMarca());
                            autoTransfer.setModelo(pessoa.getAutomoveis().get(indexAuto).getModelo());
                            pessoa.removerAutomovel(indexAuto);
                        }
                    }
                    System.out.println("Digite o código da pessoa de destino: ");
                    for (Pessoa pessoa: pessoas) {
                        System.out.println("\nCodigo: " + pessoa.getCodigo() + "\nNome: " + pessoa.getNome());
                    }
                    codigoPessoaDestino = (input.nextInt());
                    for (Pessoa pessoa: pessoas){
                        if (pessoa.getCodigo() == codigoPessoaDestino){
                                pessoa.inserirAutomovel(autoTransfer);
                        }
                    }
                    break;
                case 4:
                    for (Pessoa pessoa: pessoas) {
                        System.out.println(pessoa.imprimir());
                    }
                    break;
                case 5:
                    System.out.println("De qual pessoa deseja ver os automoveis? (código)");
                    for (Pessoa pessoa: pessoas) {
                        System.out.println("\nCodigo: " + pessoa.getCodigo() + "\nNome: " + pessoa.getNome());
                    }
                    codigo = (input.nextInt());
                    for (Pessoa pessoa: pessoas) {
                        if (pessoa.getCodigo() == codigo) {
                            System.out.println(pessoa.imprimirCompleto());
                        }
                    }
                    break;
                case 6:
                    System.out.println("Bye Bye");
                    break;
                default:
                    System.out.println("Opção inválida. Digite uma das opções abaixo:");
            }

        }
        input.close();
    }
}
