package poo.AC1.lista2.exercicio3e4;

import java.util.Scanner;

public class VendedorTeste {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Vendedor vendedor1 = null;
        Integer codigo;
        String nome;
        Double percentualComissao;
        Double valorVenda;
        Double valorDesconto;
        int opcao = 0;



        while(opcao != 3){
            System.out.println("Menu:\n1-Cadastrar Vendedor" +
                    "\n2-Calcular comissão" +
                    "\n3-Sair" +
                    "\nDigite a opção desejada: ");

            opcao = (input.nextInt());

            switch (opcao){
                case 1:
                    System.out.println("Digite o Código do Vendedor: ");
                    codigo = (input.nextInt());
                    System.out.println("Digite o Nome do vendedor: ");
                    nome = (input.next());
                    System.out.println("Digite o Percentual de comissão do vendedor: ");
                    percentualComissao = (input.nextDouble());
                    vendedor1 = new Vendedor(codigo, nome, percentualComissao);
                    break;
                case 2:
                    if (vendedor1 != null){
                        System.out.println("Digite o Valor da Venda: ");
                        valorVenda = (input.nextDouble());
                        System.out.println("Digite o Valor do desconto: ");
                        valorDesconto = (input.nextDouble());
                        System.out.println(vendedor1.imprimir(valorVenda, valorDesconto));
                    }else{
                        System.out.println("Nenhum vendedor cadastrado!");
                    }
                    break;
                case 3:
                    System.out.println("Bye Bye");
                    break;
                default:
                    System.out.println("Opção inválida. Digite uma das opções abaixo:");
            }

        }

        input.close();
    }
}
