package poo.ExercicioAula;

public class Funcionario extends Pessoa{

    private int numeroCracha;
    private Double salario;


    public Funcionario(){

    }

    public Funcionario(String nome, String cpf, int numeroCracha, Double salario){
        this.setNome(nome);
        this.setCpf(cpf);
        this.numeroCracha = numeroCracha;
        this.salario = salario;
    }

    @Override
    public String toString() {
        String str = "Funcionario -->";
        str += super.toString();
        str +=  "\nnumeroCracha: " + numeroCracha +
                "\nsalario: " + salario;
        return str;
    }

    public int getNumeroCracha() {
        return numeroCracha;
    }

    public void setNumeroCracha(int numeroCracha) {
        this.numeroCracha = numeroCracha;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
