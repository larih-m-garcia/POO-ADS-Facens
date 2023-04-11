package poo.exercicios.AC2.lista3;

import poo.exercicios.AC1.lista2.exercicio2.Apolice;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int codigo;
        String nomeCurso;
        int cargaHoraria;
        String ra;
        String nomeAluno;
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
                    System.out.println("Qual aluno deseja remover?");
                    for (int i = 0; i < cursos.size(); i++) {
                        int num = i + 1;
                        for (Aluno a : cursos.get(i).getAlunos()) {
                            System.out.println(num + a.getNome());
                        }
                    }
                case 4:
                    for (Curso c : cursos) {
                        System.out.println(c.imprimir());;
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
