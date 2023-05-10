package poo.AC2.lista4.exercicio1;

public class FuncionarioMensalista extends Funcionario {

    private Double salario;

    public FuncionarioMensalista() {
    }

    public FuncionarioMensalista(int numeroCracha, String nome, String setor, String funcao, Double salario) {
        super(numeroCracha, nome, setor, funcao);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String imprimir(){
        return "Número do Crachá: " + getNumeroCracha() + "\nNome: " + getNome() +
                "\nSetor: " + getSetor() + "\nFunção: " + getFuncao() + "\nSalário: " + salario;
    }
}
