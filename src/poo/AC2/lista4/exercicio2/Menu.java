package poo.AC2.lista4.exercicio2;

import poo.AC2.lista4.exercicio1.Funcionario;
import poo.AC2.lista4.exercicio1.FuncionarioHorista;
import poo.AC2.lista4.exercicio1.FuncionarioMensalista;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Imovel> imoveis = new ArrayList<>();
        int opcao = 0;

        while(opcao != 3){
            System.out.println("Menu:\n1- Inserir Imóvel" +
                    "\n2- Exibir Imóveis" +
                    "\n3- Sair" +
                    "\nDigite a opção desejada: ");

            opcao = (input.nextInt());

            switch (opcao){
                case 1:
                    System.out.println("Digite o código do imóvel: ");
                    var codigo = (input.nextInt());
                    System.out.println("Digite o endereço do imóvel: ");
                    var endereco = (input.next());
                    input.nextLine();
                    System.out.println("Digite o valor do imóvel: ");
                    var valor = (input.nextDouble());
                    int tipoImovel;
                    do{
                        System.out.println("""
                                Qual o estado do imóvel? (Digite o código):
                                1- Novo
                                2- Velho""");
                        tipoImovel = (input.nextInt());
                    }while (tipoImovel != 1 && tipoImovel != 2);

                    if(tipoImovel == 1){
                        System.out.println("Digite o valor adicional do imóvel: ");
                        var valorAdicional = (input.nextDouble());
                        ImovelNovo inovo = new ImovelNovo(codigo, endereco, valor, valorAdicional);
                        imoveis.add(inovo);
                    }else{
                        System.out.println("Digite o valor de desconto do imóvel: ");
                        var valorDesconto = (input.nextDouble());
                        ImovelVelho ivelho = new ImovelVelho(codigo, endereco, valor, valorDesconto);
                        imoveis.add(ivelho);
                    }
                    break;
                case 2:
                    for (Imovel  imovel : imoveis){
                        if (imovel instanceof ImovelNovo imnovo){
                            System.out.println(imnovo.imprimir());
                        }else{
                            ImovelVelho imvelho = (ImovelVelho) imovel;
                            System.out.println(imvelho.imprimir());
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
