package poo.ExercicioAula;

public class Atendente extends Funcionario{

    private String setor;
    private String funcao;

    public Atendente(){

    }

    public Atendente(String nome, String cpf, String setor, String funcao){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setor = setor;
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        String str = "Atendente -->";
        str += super.toString();
        str += "\nsetor: " + setor + "\nfuncao='" + funcao;
        return str;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
