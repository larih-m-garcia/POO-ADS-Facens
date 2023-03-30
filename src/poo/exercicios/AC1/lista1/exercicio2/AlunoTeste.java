package poo.exercicios.AC1.lista1.exercicio2;

import java.util.Scanner;

public class AlunoTeste {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Aluno a = new Aluno();
        int opcao = 0;

        while(opcao != 3){
            System.out.println("Menu:\n1-Criar Aluno\n2-Mostrar Aluno\n3-Sair\nDigite a opção desejada: ");


            opcao = Integer.parseInt(input.nextLine());
            if (opcao != 1 && opcao != 2 && opcao != 3){
                System.out.println("Opção Invalida. Tente novamente...");
                continue;
            }

            if(opcao == 1){
                System.out.println("Digite o RA do aluno: ");
                a.setRA(input.nextLine());
                System.out.println("Digite o nome do aluno: ");
                a.setNome(input.nextLine());
                System.out.println("Digite a nota AC1: ");
                a.setAC1(input.nextFloat());
                System.out.println("Digite a nota AC2: ");
                a.setAC2(input.nextFloat());
                System.out.println("Digite a nota AG: ");
                a.setAG(input.nextFloat());
                System.out.println("Digite a nota AF: ");
                a.setAF(input.nextFloat());
                System.out.println("Aluno criado com sucesso :) !!");
                input.nextLine();
            }
            if(opcao == 2){
                System.out.println(a.imprimir());
            }
        }
        System.out.println("Bye Bye");
        input.close();
    }
}
