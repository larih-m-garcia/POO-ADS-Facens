package poo.ExercicioAula;

import java.util.ArrayList;

public class Professor extends Funcionario {

    private String urlCurriculoLattes;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Professor(){

    }

    public Professor(String nome, String cpf, String urlCurriculoLattes){
        this.setNome(nome);
        this.setCpf(cpf);
        this.urlCurriculoLattes = urlCurriculoLattes;
    }

    @Override
    public String toString() {
        String str = "Professor -->";
        str += super.toString();
        str +=  "\nurlCurriculoLattes: " + urlCurriculoLattes + '\'' +
                "\ndisciplinas: " + disciplinas;
        return str;
    }

    public void addDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }

    public void removeDisciplina(int index){
        disciplinas.remove(index);
    }

    public void removeDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }

    public String getUrlCurriculoLattes() {
        return urlCurriculoLattes;
    }

    public Disciplina getDisciplina(int index){
        return disciplinas.get(index);
    }

    public void setUrlCurriculoLattes(String urlCurriculoLattes) {
        this.urlCurriculoLattes = urlCurriculoLattes;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }


}
