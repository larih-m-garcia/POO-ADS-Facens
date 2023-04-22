package poo.AC2.lista3.exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int codigo;
        ArrayList<Curso> cursos = new ArrayList<>();
        int opcao = 0;


        while(opcao != 6){
            System.out.println("Menu:\n1- Criar Curso" +
                    "\n2- Criar Aluno" +
                    "\n3- Remover Aluno" +
                    "\n4- Mostrar Todos os Cursos" +
                    "\n5- Mostrar alunos do curso" +
                    "\n6- Sair" +
                    "\nDigite a opção desejada: ");

            opcao = (input.nextInt());

            switch (opcao){
                case 1:
                    String nomeCurso;
                    int cargaHoraria;
                    System.out.println("Digite o Código do Curso: ");
                    codigo = (input.nextInt());
                    System.out.println("Digite o Nome do Curso: ");
                    nomeCurso = (input.next());
                    System.out.println("Digite a Carga Horaria: ");
                    cargaHoraria = (input.nextInt());

                    Curso curso = new Curso(codigo, nomeCurso, cargaHoraria);
                    cursos.add(curso);
                    break;
                case 2:
                    String ra;
                    String nomeAluno;
                    System.out.println("Digite o RA do Aluno: ");
                    ra = (input.next());
                    System.out.println("Digite o Nome do Aluno: ");
                    nomeAluno = (input.next());
                    System.out.println("Curso do Aluno (código): ");
                    for (Curso c : cursos){
                        System.out.println(c.getCodigo() + " - " + c.getNome());
                    }
                    codigo = (input.nextInt());

                    Aluno aluno = new Aluno(ra, nomeAluno);
                    for (Curso c : cursos){
                        if(c.getCodigo() == codigo){
                            c.insertAluno(aluno);
                        }
                    }
                    break;
                case 3:
                    int index = 1;
                    int indexDelete;
                    System.out.println("Qual aluno deseja remover? (Digite o código)");
                    for (int i = 0; i < cursos.size(); i++) {
                        for (Aluno a : cursos.get(i).getAlunos()) {
                            System.out.println(index + " - " + a.getNome());
                            index ++;
                        }
                    }
                    indexDelete = (input.nextInt());
                    index = 1;
                    for (int i = 0; i < cursos.size(); i++) {
                        for (int j = 0; j < cursos.get(i).getAlunos().size(); j++) {
                            if (index == indexDelete){
                                cursos.get(i).removerAluno(j);
                                index ++;
                                break;
                            }
                            index ++;
                        }
                    }

                    break;
                case 4:
                    for (Curso c : cursos) {
                        System.out.println(c.imprimir());
                    }
                    break;
                case 5:
                    System.out.println("Lista de alunos de qual curso? (Digite o código)");
                    for (Curso c : cursos){
                        System.out.println(c.getCodigo() + " - " + c.getNome());
                    }
                    codigo = (input.nextInt());

                    for (Curso c1 : cursos){
                        if(c1.getCodigo() == codigo){
                            System.out.println(c1.imprimirCompleto());
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
