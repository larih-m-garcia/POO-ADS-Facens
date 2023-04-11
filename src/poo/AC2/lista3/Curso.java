package poo.AC2.lista3;

import java.util.ArrayList;

public class Curso {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Curso(){

    }

    public Curso(int codigo, String nome, int cargaHoraria){
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public void insertAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void removerAluno(int index){
        alunos.remove(index);
    }

    public String imprimir(){
        return "Código: " + codigo + "\nNome do Curso: " + nome +
                "\nCarga Horária: " + cargaHoraria;
    }

    public String imprimirCompleto(){
        String impressaoCompleta = imprimir();
        impressaoCompleta += "\nLista de Alunos: ";
        for (Aluno aluno: alunos) {
            impressaoCompleta += aluno.imprimir();
        }
        return impressaoCompleta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }


}
