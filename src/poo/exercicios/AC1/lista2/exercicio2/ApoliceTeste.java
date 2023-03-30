package poo.exercicios.AC1.lista2.exercicio2;

import java.util.Scanner;

public class ApoliceTeste {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Apolice apolice = null;
        Integer numero;
        String nome;
        Integer idade;
        Character sexo;
        Double valorAutomovel;
        int opcao = 0;



        while(opcao != 3){
            System.out.println("Menu:\n1-Criar Apólice" +
                    "\n2-Mostrar Dados Apólice" +
                    "\n3-Sair" +
                    "\nDigite a opção desejada: ");

            opcao = (input.nextInt());

            switch (opcao){
                case 1:
                    System.out.println("Digite o Número da Apólice: ");
                    numero = (input.nextInt());
                    System.out.println("Digite o Nome do segurado: ");
                    nome = (input.next());
                    System.out.println("Digite a Idade do segurado: ");
                    idade = (input.nextInt());
                    System.out.println("Digite o Sexo do segurado: ");
                    sexo = (input.next().charAt(0));
                    System.out.println("Digite o Valor do Automóvel: ");
                    valorAutomovel = (input.nextDouble());
                    apolice = new Apolice(numero, nome, idade, sexo, valorAutomovel);
                    break;
                case 2:
                    if (apolice != null){
                        System.out.println(apolice.imprimir());
                    }else{
                        System.out.println("Nenhuma apólice cadastrada ainda");
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
