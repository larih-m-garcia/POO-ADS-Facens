package poo.AC1.lista1.exercicio3;

import java.util.Scanner;

public class FuncionarioTeste {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Funcionario f = new Funcionario();
        int opcao = 0;

        while(opcao != 4){
            System.out.println("Menu:\n1-Criar Funcionário" +
                    "\n2-Mostrar Folha de Pagamento" +
                    "\n3-Alterar remuneração" +
                    "\n4-Sair" +
                    "\nDigite a opção desejada: ");

            opcao = (input.nextInt());

            switch(opcao){
                case 1:
                    System.out.println("Digite o Crachá do funcionário: ");
                    f.setCracha(input.nextInt());
                    System.out.println("Digite o nome do funcionário: ");
                    f.setNome(input.next());
                    System.out.println("Digite o tipo de vinculo: ");
                    f.setTipoVinculo(input.next().charAt(0));

                    if(Character.toUpperCase(f.getTipoVinculo()) == 'H'){
                        System.out.println("Digite o valor da hora: ");
                        f.setValorHora(input.nextFloat());
                        System.out.println("Digite a quantidade de horas: ");
                        f.setQtdeHora(input.nextFloat());
                    }else{
                        System.out.println("Digite o valor do salário: ");
                        f.setSalario(input.nextFloat());
                    }
                    System.out.println("Digite o valor do desconto: ");
                    f.setValorDesconto(input.nextFloat());
                    System.out.println("Aluno criado com sucesso :) !!");
                    break;

                case 2:
                    System.out.println(f.imprimir());
                    break;
                case 3:
                    if(Character.toUpperCase(f.getTipoVinculo()) == 'H'){
                        System.out.println("Digite o valor da hora: ");
                        f.setValorHora(input.nextFloat());
                        System.out.println("Digite a quantidade de horas: ");
                        f.setQtdeHora(input.nextFloat());
                    }else{
                        System.out.println("Digite o valor do salário: ");
                        f.setSalario(input.nextFloat());

                    }
                    break;
                case 4:
                    System.out.println("Bye Bye");
                    break;
                default:
                    System.out.println("Opção Invalida. Tente novamente...");
            }
        }
        input.close();
    }
}

