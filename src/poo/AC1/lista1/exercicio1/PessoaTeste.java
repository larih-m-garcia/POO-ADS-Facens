package poo.AC1.lista1.exercicio1;
import java.util.Scanner;

public class PessoaTeste {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Pessoa p = new Pessoa();
        int opcao = 0;

        while(opcao != 3){
            System.out.println("Menu:\n1-Criar Pessoa\n2-Mostrar Pessoa\n3-Sair\nDigite a opção desejada: ");

            opcao = Integer.parseInt(input.nextLine());
            if (opcao != 1 && opcao != 2 && opcao != 3){
                System.out.println("Opção Invalida. Tente novamente...");
                continue;
            }
            if(opcao == 1){
                System.out.println("Digite o CPF da pessoa: ");
                p.setCPF(input.nextLine());
                System.out.println("Digite o nome da pessoa: ");
                p.setNome(input.nextLine());
                System.out.println("Digite o sexo da pessoa: ");
                p.setSexo(input.nextLine().charAt(0));
                System.out.println("Digite o idade da pessoa: ");
                p.setIdade(Integer.parseInt(input.nextLine()));
                System.out.println("Pessoa criada com sucesso :) !!");
            }
            if(opcao == 2){
                System.out.println(p.imprimir());;
            }
        }
        System.out.println("Bye Bye");
        input.close();
    }
}