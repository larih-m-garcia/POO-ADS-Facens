package poo.ExercicioAula;

public class Aluno extends Pessoa{

    private String ra;
    private String curso;

    public Aluno(){

    }

    public Aluno(String nome, String cpf, String ra, String curso){
        this.setNome(nome);
        this.setCpf(cpf);
        this.ra = ra;
        this.curso = curso;
    }

    @Override
    public String toString() {
        String str = "\nAluno -->";
        str += super.toString();
        str += "\nra: " + ra + "\ncurso: " + curso;
        return str;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
