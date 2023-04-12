package poo.ExercicioAula;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        //int codigoDisc;
        //String nomeDisc;
        //String nome;
        //String cpf;
        //String url;
        //String setor;
        //String funcao;
        //String ra;
        //String curso;
        Scanner input = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList();
        int opcao = 0;
        int codigo;
        Professor prof = new Professor();
        Disciplina disc = new Disciplina();
        Funcionario func = new Funcionario();
        Atendente at = new Atendente();
        Aluno al = new Aluno();


        while(opcao != 7){
            System.out.println("Menu:\n1- Inserir Disciplina" +
                    "\n2- Inserir Professor" +
                    "\n3- Inserir Atendente" +
                    "\n4- Inserir Aluno" +
                    "\n5- Adicionar Disciplina ao Professor" +
                    "\n6- Mostrar Pessoas" +
                    "\n7- Sair" +
                    "\nDigite a opção desejada: ");

            opcao = (input.nextInt());

            switch (opcao){
                case 1:
                    System.out.println("Digite o Código da Disciplina: ");
                    disc.setCodigo(input.nextInt());
                    System.out.println("Digite o Nome da Disciplina: ");
                    disc.setNome(input.next());
                    break;
                case 2:
                    System.out.println("Digite o Nome do Professor: ");
                    prof.setNome(input.next());
                    System.out.println("Digite o CPF do Professor: ");
                    prof.setCpf(input.next());
                    System.out.println("Digite a URL do curriculo do Professor: ");
                    prof.setUrlCurriculoLattes(input.next());

                    pessoas.add(prof);
                    break;
                case 3:
                    System.out.println("Digite o Nome do Atendente: ");
                    at.setNome(input.next());
                    System.out.println("Digite o CPF do Atendente: ");
                    at.setCpf(input.next());
                    System.out.println("Digite o setor do Atendente: ");
                    at.setSetor(input.next());
                    System.out.println("Digite a funcao do atendente: ");
                    at.setFuncao(input.next());

                    pessoas.add(at);
                    break;
                case 4:
                    System.out.println("Digite o Nome do Aluno: ");
                    al.setNome(input.next());
                    System.out.println("Digite o CPF do Aluno: ");
                    al.setCpf(input.next());
                    System.out.println("Digite o RA do Aluno: ");
                    al.setRa(input.next());
                    System.out.println("Digite o curso do Aluno: ");
                    al.setCurso(input.next());

                    pessoas.add(al);
                    break;
                case 5:
                    System.out.println("Digite os dados da disciplina que deseja adicionar ao professor " + prof.getNome());
                    System.out.println("Digite o Código da Disciplina: ");
                    disc.setCodigo(input.nextInt());
                    System.out.println("Digite o Nome da Disciplina: ");
                    disc.setNome(input.next());

                    if(prof != null){
                        prof.addDisciplina(disc);
                    }
                    break;
                case 6:
                    for (Pessoa p: pessoas) {
                        System.out.println(p.toString());
                    }
                    break;
                case 7:
                    System.out.println("Bye Bye");
                default:
                    System.out.println("Opção inválida. Digite uma das opções abaixo:");
            }

        }
        input.close();

    }
}
