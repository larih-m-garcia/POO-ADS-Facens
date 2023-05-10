package poo.AC2.lista4.exercicio1;

public class FuncionarioHorista extends Funcionario {

    private int qtdeHoras;
    private Double valorHora;

    public FuncionarioHorista(){

    }

    public FuncionarioHorista(int numeroCracha, String nome, String setor, String funcao, int qtdeHoras, Double valorHora) {
        super(numeroCracha, nome, setor, funcao);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    public int getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public String imprimir(){
        return "Número do Crachá: " + getNumeroCracha() + "\nNome: " + getNome() +
                "\nSetor: " + getSetor() + "\nFunção: " + getFuncao() + "\nQuantidade de Horas: " + qtdeHoras +
                "\nValor da Hora: " + valorHora;
    }
}
