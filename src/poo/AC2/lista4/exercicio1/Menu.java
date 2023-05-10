package poo.AC2.lista4.exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        int opcao = 0;

        while(opcao != 3){
            System.out.println("Menu:\n1- Inserir Funcionario" +
                    "\n2- Exibir Funcionario" +
                    "\n3- Sair" +
                    "\nDigite a opção desejada: ");

            opcao = (input.nextInt());

            switch (opcao){
                case 1:
                    System.out.println("Digite o Número do crachá do Funcionário: ");
                    var numCracha = (input.nextInt());
                    System.out.println("Digite o Nome do Funcionário: ");
                    var nome = (input.next());
                    input.nextLine();
                    System.out.println("Digite o setor em que o funcionário trabalha: ");
                    var setor = (input.next());
                    input.nextLine();
                    System.out.println("Digite a função do funcionário: ");
                    var funcao = (input.next());
                    input.nextLine();
                    int tipoFunc;
                    do{
                        System.out.println("""
                                Qual o tipo de contrato do Funcionário? (Digite o código):
                                1- Mensalista
                                2- Horista""");
                        tipoFunc = (input.nextInt());
                    }while (tipoFunc != 1 && tipoFunc != 2);

                    if(tipoFunc == 1){
                        System.out.println("Digite o salário do funcionário: ");
                        var salario = (input.nextDouble());
                        FuncionarioMensalista fmensalista = new FuncionarioMensalista(numCracha, nome, setor, funcao, salario);
                        funcionarios.add(fmensalista);
                    }else{
                        System.out.println("Digite o valor da hora do funcionário: ");
                        var valorHora = (input.nextDouble());
                        System.out.println("Digite a quantidade de horas do funcionário: ");
                        var qtdeHoras = (input.nextInt());
                        FuncionarioHorista fhorista = new FuncionarioHorista(numCracha, nome, setor, funcao, qtdeHoras, valorHora);
                        funcionarios.add(fhorista);
                    }
                    break;
                case 2:
                    for (Funcionario  funcionario : funcionarios){
                        if (funcionario instanceof FuncionarioHorista fh){
                            System.out.println(fh.imprimir());
                        }else{
                            FuncionarioMensalista fm = (FuncionarioMensalista) funcionario;
                            System.out.println(fm.imprimir());
                        }
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
